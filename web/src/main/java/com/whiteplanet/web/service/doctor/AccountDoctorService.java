package com.whiteplanet.web.service.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.DepartmentMapper;
import com.whiteplanet.mapper.DoctorMapper;
import com.whiteplanet.mapper.PhoneCodeMapper;
import com.whiteplanet.mapper.SysAuthCodeMapper;
import com.whiteplanet.mapper.model.Doctor;
import com.whiteplanet.mapper.model.PhoneCode;
import com.whiteplanet.mapper.model.SysAuthCode;
import com.whiteplanet.utils.MD5Crypto;
import com.whiteplanet.utils.WPStringUtil;
import com.whiteplanet.web.entry.ForgotPasswordBean;
import com.whiteplanet.web.entry.LoginBean;
import com.whiteplanet.web.entry.RegisterBean;
import com.whiteplanet.web.entry.TokenBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @Author: HeWei
 * @Description: 医生账户信息(登录，注册，找回密码等功能)
 * @Date: Created in 11:41 2017
 * @Modified By:
 */
@Service
@Transactional
public class AccountDoctorService extends BaseDoctorService {
    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private PhoneCodeMapper phoneCodeMapper;
    @Autowired
    private SysAuthCodeMapper sysAuthCodeMapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 账户登录
     *
     * @param data
     * @return
     */
    public ReturnResult login(LoginBean data) {
        try {
            logger.debug(">>>>>>>>>>用户:{}请求登录"+data.getUsername());
            Doctor doctor = doctorMapper.selectByPhone(data.getUsername());
            if(doctor==null){
                //用户不存在
                return ReturnResult.PHONE_NONE;
            } else if (!doctor.getPassword().equals(MD5Crypto.encrypByMd5(data.getPassword()))){
                //密码错误
                return ReturnResult.PASSWORD_WRONG;
            }else{
                //构建登录信息bean
                SysAuthCode sysAuthCode = new SysAuthCode();
                sysAuthCode.setCreateTime(new Date());
                sysAuthCode.setAccountId(doctor.getId());
                sysAuthCode.setDoctor(true);
                sysAuthCode.setToken(WPStringUtil.GETuuid());
                //插入新记录
                sysAuthCodeMapper.insert(sysAuthCode);
                ReturnResult returnResult = new ReturnResult(new TokenBean(
                        sysAuthCode.getToken(),sysAuthCode.getCreateTime(),doctor.getId()
                ));
                //判断是否第一次登录
                returnResult.putAttr("isFirstLogin",doctor.isFirstLogin());
                if(doctor.isFirstLogin()){
                    doctor.setFirstLogin(false);
                    doctorMapper.updateByPrimaryKeySelective(doctor);
                }
                return returnResult;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return  ReturnResult.RESULT_ERROR;
        }

    }

    /**
     *  忘记密码
     * @param data
     * @return
     */
    public ReturnResult forgotPassword(ForgotPasswordBean data) {
        //---------------用户手机号校验--------------------
        Doctor doctor = doctorMapper.selectByPhone(data.getPhoneNo());
        if(doctor == null){
            return ReturnResult.PHONE_NONE; //为null 返回用户不存在
        }
        //---------------手机验证码校验---------------------
        //校验手机号和验证码 如果返回code不为0 则直接返回错误
        ReturnResult returnResult = checkPhoneAndPin(data.getPhoneNo(),data.getVerificationCode());
        if(!returnResult.getCode().equals("0")){
            return returnResult;
        }
        //--------------------更新密码------------------------
        doctor.setPassword(MD5Crypto.encrypByMd5(data.getNewPassword()));
        doctor.setUpdateDate(new Date());
        doctorMapper.updateByPrimaryKeySelective(doctor);
        return returnResult;
    }

    /**
     * 注册 (去掉测试环境不发验证码功能)
     * @param data
     * @return
     */
    public ReturnResult register(RegisterBean data){
        //校验手机号和验证码 如果返回code不为0 则直接返回错误
        ReturnResult returnResult = checkPhoneAndPin(data.getPhoneNo(),data.getVerificationCode());
        if(!returnResult.getCode().equals("0")){
            return returnResult;
        }
        //---------------校验用户是否存在-----------------------
        Doctor doc = doctorMapper.selectByPhone(data.getPhoneNo());
        if (doc!=null){
            return ReturnResult.USER_EXIST;
        }
        //init new doctor bean
        Doctor doctor = new Doctor();
        doctor.setId(WPStringUtil.GETuuid());
        doctor.setPhone(data.getPhoneNo());
        doctor.setPassword(MD5Crypto.encrypByMd5(data.getPassword()));
        doctor.setCreateDate(new Date());
        doctor.setCode("AA0909");//暂时定义常量
        //insert one record
        doctorMapper.insertSelective(doctor);

        //init new SysAuthCode bean (Token ...)
        SysAuthCode sysAuthCode = new SysAuthCode();
        sysAuthCode.setToken(WPStringUtil.GETuuid());
        sysAuthCode.setDoctor(true);
        sysAuthCode.setAccountId(doctor.getId());
        sysAuthCode.setCreateTime(new Date());
        //insert one record
        sysAuthCodeMapper.insert(sysAuthCode);

        logger.debug(">>>>>>>>>>用户:[{}]注册成功，生成id:[{}]",doctor.getPhone(),doctor.getId());
        return returnResult;
    }

    /**
     * 判断手机号是否注册
     * @param phone
     * @return
     */
    public ReturnResult checkPhoneExist(String phone){
        //已注册 true,未注册 false
        Map<String,Object> map = new HashMap<String ,Object>();
        map.put("existed",doctorMapper.selectExistByPhone(phone));
        return new ReturnResult(map);
    }

    /**
     * 验证手机号和验证码(为忘记密码和注册api封装，也为接口校验接口调用)
     * @param phoneNo
     * @param pin
     * @return
     */
    public ReturnResult checkPhoneAndPin(String phoneNo,String pin){
        //---------------手机验证码校验---------------------
        PhoneCode phoneCode = phoneCodeMapper.selectByPhoneAndDockerAndReg(
                phoneNo,true,true
        );
        if(phoneCode == null){
            logger.debug(">>>>>>>>>>用户:{}进行验证码校验失败，验证码为空",phoneNo);
            return ReturnResult.WRONG_CODE;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(phoneCode.getSenddatetime());
        calendar.set(Calendar.MINUTE,calendar.get(Calendar.MINUTE)+3);//有效期 3分钟
        //如果当前时间比验证码发送时间多1分钟以上，则过期
        if(calendar.getTime().compareTo(new Date()) == -1){
            logger.debug(">>>>>>>>>>用户:{}进行验证码校验失败，验证码超时",phoneNo);
            return ReturnResult.OVERTIME_CODE;
        }
        //参数与db数据对比，不相等返回错误
        if(!pin.equals(phoneCode.getValue())){
            logger.debug(">>>>>>>>>>用户:{}进行验证码校验失败，验证码错误",phoneNo);
            return ReturnResult.WRONG_CODE;
        }
        return ReturnResult.RESULT_SUCCESS;
    }


}
