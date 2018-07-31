package com.whiteplanet.web.service.common;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.PhoneCodeMapper;
import com.whiteplanet.mapper.model.PhoneCode;
import com.whiteplanet.web.entry.VerificationCodeBean;
import com.whiteplanet.web.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * @Author: HeWei
 * @Description:
 * @Date: Created in 9:22 2017
 * @Modified By:
 */
@Service
@Transactional
public class SMSservice extends BaseService {
    @Autowired
    private PhoneCodeMapper phoneCodeMapper;
    @Autowired
    private SendSmsHandler sendSmsHandler;
    @Value("${whiteplanet.env}")
    private String env;

    /**
     * 发送手机短信
     * @param data
     * @return
     */
    public ReturnResult sendSmsCode(VerificationCodeBean data){
        try {
            PhoneCode pc = phoneCodeMapper.selectByPrimaryKey(data.getPhone());
            String code = RegCode(4); //生成验证码
            if(pc==null){// 第一次发送
                // bean set
                PhoneCode phoneCode  = new PhoneCode();
                phoneCode.setDoctor(data.isDoctor());
                phoneCode.setPhonenumber(data.getPhone());
                phoneCode.setCount(1);
                phoneCode.setTimeCount(1);
                phoneCode.setReg(data.getSmsType());
                phoneCode.setBankCard(false);

                Calendar calendar = Calendar.getInstance();
                phoneCode.setSenddatetime(calendar.getTime());
                //设置验证码有效期 3分钟
                calendar.set(Calendar.MINUTE,calendar.get(Calendar.MINUTE)+3);
                phoneCode.setNextdatetime(calendar.getTime());
                //生成验证码
                phoneCode.setValue(code);

                phoneCodeMapper.insertSelective(phoneCode);
            } else {//已存在记录
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(pc.getSenddatetime());
                calendar.set(Calendar.MINUTE,calendar.get(Calendar.MINUTE)+30);
                //如果距离上次发送大于30分钟，那么计数器重置
                if(calendar.getTime().compareTo(new Date())==-1){
                    pc.setTimeCount(1);
                }
                //如果30分钟内 短信发送数大于6，或者下次发送时间比系统时间大，则提示错误
                if(pc.getTimeCount()>=6||pc.getNextdatetime().compareTo(new Date())==1){
                    return ReturnResult.CODE_SENDED;
                }
                pc.setDoctor(data.isDoctor());
                pc.setTimeCount(pc.getTimeCount()+1);
                pc.setCount(pc.getCount()+1);
                pc.setReg(data.getSmsType());

                Calendar newCalendar = Calendar.getInstance();
                pc.setSenddatetime(newCalendar.getTime());
                //设置验证码有效期3分钟
                newCalendar.set(Calendar.MINUTE,newCalendar.get(Calendar.MINUTE)+3);
                pc.setNextdatetime(newCalendar.getTime());
                pc.setValue(code);

                phoneCodeMapper.updateByPrimaryKeySelective(pc);
            }

            sendSmsHandler.sendSms(data.getPhone(),pc.getValue(),data.getSmsType());
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnResult.RESULT_ERROR;
        }
        return  ReturnResult.RESULT_SUCCESS;
    }

    /**
     * 生成4位验证码
     * @param len
     * @return
     */
    private static String RegCode(Integer len){
        StringBuilder code = new StringBuilder();
        while (len>0){
            code.append(new Random().nextInt(10));
            len--;
        }
        return  code.toString();
    }

    public static void main(String[] args) {
        System.out.println(RegCode(4));
    }
}
