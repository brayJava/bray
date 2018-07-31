package com.whiteplanet.web.service.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.*;
import com.whiteplanet.mapper.model.*;
import com.whiteplanet.utils.WPStringUtil;
import com.whiteplanet.web.Final;
import com.whiteplanet.web.entry.DoctorInfoVo;
import com.whiteplanet.web.entry.SingleStringBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.print.Doc;
import java.util.*;

/**
 * @Author: HeWei
 * @Description: 医生基本信息
 * @Date: Created in 11:41 2017
 * @Modified By:
 */
@Service
@Transactional
public class DoctorProfileService extends BaseDoctorService{
    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private ClinicMapper clinicMapper;
    @Autowired
    private DoctorImageMapper doctorImageMapper;
    @Autowired
    private DoctorIllnessMapper doctorIllnessMapper;
    @Autowired
    private DoctorCalendarMapper doctorCalendarMapper;

    /**
     * 提交医生数据 (doctor表冗余多个字段,方便update)
     * @param data
     * @return
     */
    public ReturnResult addDoctorInfo(DoctorInfoVo data){
        Doctor doctor = new Doctor();
        //科室和医院表固定配置，数据不更新到表中
        //-------------set value------------------
        //职称
        doctor.setDepartmentId(data.getDepartmentId());
        doctor.setDepartmentName(data.getGetDepartmentName());
        //医院
        doctor.setHospitalId(data.getHospitalId());
        doctor.setHospitalName(data.getHospitalName());
        //科室
        doctor.setDepartmentFunctionId(data.getDepartmentFunctionId());
        doctor.setDepartmentFunctionName(data.getDepartmentFunctionName());
        //姓名
        doctor.setRealName(data.getRealName());
        //诊费
        doctor.setTreatmentMoney(data.getTreatmentMoney());
        doctor.setUpdateDate(new Date());
        //update db
        doctorMapper.updateByPrimaryKeySelective(doctor);

        return ReturnResult.RESULT_SUCCESS;
    }

    /**
     * 根据医生id查询医生综合信息 (查看其他医生信息 整张页面数据)
     * 待改进点: 门诊类型 outpatientType 改成配置模式 不能用字符串直接表示
     * @param data 医生id
     * @return
     */
    public ReturnResult doctorCard(SingleStringBean data){
        //根据医生id查询医生信息以及诊所信息
        Doctor doctor = doctorMapper.selectByPrimaryKey(data.getParam());
        Clinic clinic = clinicMapper.selectByDoctorId(data.getParam());
        //为null 返回错误
        if(clinic == null){
            return ReturnResult.NONE_CLINIC;
        }
        //初始化集合数据
        Map<String,Object> returnMap = new HashMap<>();     //总数据集合
        Map<String,Object> doctorMap = new HashMap<>();     //医生数据集合
        Map<String,Object> clinicMap = new HashMap<>();     //诊所数据集合
        List<Map<String,Object>> illnessList = new ArrayList<>();    //擅长领域数据集合
        List<Map<String,Object>> outpatientList = new ArrayList<>();    //门诊时间数据集合

        //组合数据 doctorMap
        doctorMap.put("id",doctor.getId());                             //医生 id
        doctorMap.put("name",doctor.getRealName());                     //医生 姓名
        doctorMap.put("faceImage",doctor.getFaceimg());                 //医生 头像
        doctorMap.put("title",doctor.getDepartmentName());              //医生 职称
        doctorMap.put("department",doctor.getDepartmentFunctionName()); //医生 科室
        doctorMap.put("money",doctor.getTreatmentMoney());              //医生 诊费
        doctorMap.put("hospital",doctor.getHospitalName());             //医生 所在医院名称
        doctorMap.put("note",doctor.getIntroduce());                    //医生 简介
        doctorMap.put("credits",doctor.getCredits());                   //医生 评分
        doctorMap.put("thumbsUp",doctor.getThumbsUp());                 //医生 点赞数
        //根据医生id查询个人照片列表
        List<DoctorImage> doctorImageList = doctorImageMapper.selectImageIdByDoctorId(data.getParam());
        doctorMap.put("images",doctorImageList);                        //医生 照片list
        //组合数据 clinicMap
        clinicMap.put("id",clinic.getId());                                //诊所 id
        clinicMap.put("name",clinic.getName());                            //诊所 名称
        clinicMap.put("doctorCount",clinic.getDoctorCount());              //诊所 专家数
        clinicMap.put("doctorRef",clinic.getDoctorRefCount());             //诊所 转诊数
        clinicMap.put("doctorRecive",clinic.getDoctorReciveCount());       //诊所 接诊数
        clinicMap.put("departmentCount",clinic.getDoctorDepartmentCount());//诊所 科室数
        //组合数据 illnessList
        //根据医生id 查询擅长领域列表
        List<Illness> illnesses = doctorIllnessMapper.selectByDoctorId(data.getParam());
        for (Illness item : illnesses){
            Map<String,Object> illMap = new HashMap<>();
            illMap.put("id",item.getId());                              //领域 id
            illMap.put("name",item.getName());                          //领域 名称

            illnessList.add(illMap);
        }
        //组合数据 outpatientList
        //根据医生id 以及看病类型(门诊)查询医生看病时间列表
        List<DoctorCalendar> doctorCalendars = doctorCalendarMapper.selectByDoctorAndKind(data.getParam(),
                Final.TREAT_TYPE_OP);
        for(DoctorCalendar item : doctorCalendars){
            Map<String,Object> map = new HashMap<>();
            map.put("week",item.getWeek());                            //看诊时间 1 星期一、2 星期二 ...
            map.put("stage",item.getStage());                          //看诊时间 0 上午、1 下午、2 晚上
            map.put("kind",item.getOutpatientType());                  //看诊类型(普通门诊、专家门诊等)

            outpatientList.add(map);
        }
        //数据汇总
        returnMap.put("doctor",doctorMap);
        returnMap.put("clinic",clinicMap);
        returnMap.put("illness",illnessList);
        returnMap.put("outpatient",outpatientList);

        return new ReturnResult(returnMap);
    }
}
