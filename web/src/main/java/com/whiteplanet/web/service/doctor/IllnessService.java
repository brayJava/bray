package com.whiteplanet.web.service.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.DoctorIllnessMapper;
import com.whiteplanet.mapper.DoctorMapper;
import com.whiteplanet.mapper.IllnessDepartmentFunctionMapper;
import com.whiteplanet.mapper.IllnessMapper;
import com.whiteplanet.mapper.model.Doctor;
import com.whiteplanet.mapper.model.DoctorIllnessKey;
import com.whiteplanet.mapper.model.Illness;
import com.whiteplanet.mapper.model.IllnessDepartmentFunctionKey;
import com.whiteplanet.utils.WPStringUtil;
import com.whiteplanet.web.Final;
import com.whiteplanet.web.entry.Account;
import com.whiteplanet.web.entry.DoubleStringBean;
import com.whiteplanet.web.entry.GlobalPageVo;
import com.whiteplanet.web.entry.SingleStringBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @Author: HeWei
 * @Description:
 * @Date: Created in 9:04 2017
 * @Modified By:
 */
@Service
@Transactional
public class IllnessService extends BaseDoctorService{
    @Autowired
    private IllnessMapper illnessMapper;
    @Autowired
    private IllnessDepartmentFunctionMapper illnessDepartmentFunctionMapper;
    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private DepartmentFunctionService departmentFunctionService;
    @Autowired
    private DoctorIllnessMapper doctorIllnessMapper;

    /**
     * 添加疾病
     * @param data
     * @param account
     * @return
     */
    public ReturnResult addIllness(SingleStringBean data, Account account){
        //获取医生信息
        Doctor doctor = doctorMapper.selectByPrimaryKey(account.getId());
        //根据新添加疾病名称 获取数据
        Illness illness = illnessMapper.selectByName(data.getParam());
        //若疾病已存在
        if(illness != null){

            IllnessDepartmentFunctionKey illnessDepartmentFunctionKey = new IllnessDepartmentFunctionKey();
            illnessDepartmentFunctionKey.setDepartmentFunctionId(doctor.getDepartmentFunctionId());
            illnessDepartmentFunctionKey.setIllnessId(illness.getId());
            //查询科室-疾病是否关联
            IllnessDepartmentFunctionKey item = illnessDepartmentFunctionMapper.
                    selectByPrimaryKey(illnessDepartmentFunctionKey);
            if(item == null){
                //无关联 insert
                illnessDepartmentFunctionMapper.insertSelective(illnessDepartmentFunctionKey);
            } else {
                //关联  报错
                return ReturnResult.DATA_EXIST;
            }
            Map<String,String> map = new HashMap<>();
            map.put("id",illness.getId());
            return new ReturnResult(map);
        } else {
            //若疾病不存在 则新建 入库
            Illness illnessNew = new Illness();
            illnessNew.setId(WPStringUtil.GETuuid());
            illnessNew.setCreateDate(new Date());
            illnessNew.setName(data.getParam());
            illnessNew.setStatus(Final.PERSONAL_ADD);
            illnessNew.setUpdateDate(new Date());

            illnessMapper.insertSelective(illnessNew);

            //新建 科室-疾病对应关系
            IllnessDepartmentFunctionKey illnessDepartmentFunctionKey = new IllnessDepartmentFunctionKey();
            illnessDepartmentFunctionKey.setDepartmentFunctionId(doctor.getDepartmentFunctionId());
            illnessDepartmentFunctionKey.setIllnessId(illnessNew.getId());
            illnessDepartmentFunctionMapper.insertSelective(illnessDepartmentFunctionKey);

            Map<String,String> map = new HashMap<>();
            map.put("id",illnessNew.getId());
            return new ReturnResult(map);
        }
    }

    /**
     * 添加我擅长的疾病
     * @param data  疾病id
     * @param account
     * @return
     */
    public ReturnResult addMyIllness(SingleStringBean data,Account account) {
        //构建数据
        DoctorIllnessKey doctorIllnessKey = new DoctorIllnessKey();
        doctorIllnessKey.setDoctorId(account.getId());
        doctorIllnessKey.setIllnessId(data.getParam());
        //查询 判断是否记录存在
        DoctorIllnessKey result = doctorIllnessMapper.selectByPrimaryKey(doctorIllnessKey);
        if (result!=null){
            return ReturnResult.DATA_EXIST;
        }
        //新增
        doctorIllnessMapper.insert(doctorIllnessKey);
        logger.debug(">>>>>>>>>>用户:[{}]添加擅长项目成功!ID:[{}]",account.getPhone(),data.getParam());
        return ReturnResult.RESULT_SUCCESS;
    }

    /**
     * 查询我擅长的疾病
     * @param account
     * @return
     */
    public ReturnResult myIllness(Account account) {
        //初始化返回list
        List<Map<String,Object>> returnList = new ArrayList<>();
        //根据医生id查询疾病list
        List<Illness> list = doctorIllnessMapper.selectByDoctorId(account.getId());
        //组合返回数据
        for (Illness item : list) {
            Map<String,Object> map = new HashMap<>();
            map.put("id",item.getId());
            map.put("name",item.getName());

            returnList.add(map);
        }
        return new ReturnResult(returnList);
    }

    /**
     * 删除我擅长的疾病
     * @param data
     * @param account
     * @return
     */
    public ReturnResult delMyIllness(SingleStringBean data,Account account) {
        //构建数据
        DoctorIllnessKey doctorIllnessKey = new DoctorIllnessKey();
        doctorIllnessKey.setDoctorId(account.getId());
        doctorIllnessKey.setIllnessId(data.getParam());
        //删除
        doctorIllnessMapper.deleteByPrimaryKey(doctorIllnessKey);
        logger.debug(">>>>>>>>>>用户:[{}]删除擅长项目成功!ID:[{}]",account.getPhone(),data.getParam());
        return ReturnResult.RESULT_SUCCESS;
    }

    /**
     * 根据名称模糊查询疾病
     * @param data
     * @param account
     * @return
     */
    public ReturnResult searchIllness(GlobalPageVo data,Account account) {
        //初始化返回list
        List<Map<String,Object>> returnList = new ArrayList<>();
        //根据名称模糊查询疾病list
        List<Illness> list = illnessMapper.selectByLikeName(data.getText(),data.getCount());
        //组合返回数据
        for (Illness item : list) {
            Map<String,Object> map = new HashMap<>();
            map.put("id",item.getId());
            map.put("name",item.getName());

            returnList.add(map);
        }
        return new ReturnResult(returnList);
    }
}
