package com.whiteplanet.web.service.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.*;
import com.whiteplanet.mapper.data.DepartmentFunctionDoctorBean;
import com.whiteplanet.mapper.data.DoctorClinicBean;
import com.whiteplanet.mapper.model.*;
import com.whiteplanet.web.Final;
import com.whiteplanet.web.entry.Account;
import com.whiteplanet.web.entry.SingleIntVo;
import com.whiteplanet.web.entry.SingleStringBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @Author: HeWei
 * @Description: 诊所信息
 * @Date: Created in 9:43 2017
 * @Modified By:
 */
@Service
@Transactional
public class ClinicService extends BaseDoctorService {
    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private ClinicMapper clinicMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private CertificatesMapper certificatesMapper;
    @Autowired
    private DoctorClinicMapper doctorClinicMapper;
    @Autowired
    private ClinicImageMapper clinicImageMapper;


    /**
     * 查询诊所信息
     *
     * @param account
     * @return
     */
    public ReturnResult clinicInfo(Account account) {
        //根据用户id查询用户(医生)信息
        Doctor doctor = doctorMapper.selectByPrimaryKey(account.getId());
        //根据用户id查询诊所信息(修改mapper方法名selectByDockerId->selectByDoctorId)
        Clinic clinic = clinicMapper.selectByDoctorId(account.getId());
        //初始化返回数据map
        Map<String, Object> map = new HashMap<>();
        if (clinic == null) {
            //诊所信息为空 返回数据 (为了方便前端处理，用flag返回)
            map.put("hasClinic",false);
            return new ReturnResult(map);
        }

        /*产品逻辑修改，行政部门也可以看诊，所以此逻辑去掉*/
//        //判断诊所对应的职级是否可看诊
//        Department department = departmentMapper.selectByPrimaryKey(doctor.getDepartmentId());
//        if(!department.getVisiting()){
//            return ReturnResult.NO_DEPARTMENT_VISITING;
//        }

        //身份校验
        /* 逻辑已修改 idCheckStatus校验审核状态方法弃用*/
       // Boolean is_checked = this.idCheckStatus(account.getId());


        Map<String, Object> docMap = new HashMap<>();
        //组合医生数据
        docMap.put("id", doctor.getId());                //医生id
        docMap.put("name", doctor.getRealName());        //医生姓名
        docMap.put("title", doctor.getDepartmentName()); //医生职称
        docMap.put("hospital", doctor.getHospitalName());//医院名称
        docMap.put("faceImage", doctor.getFaceimg());    //医生头像
        docMap.put("departmentFunctionName",doctor.getDepartmentFunctionName()); //科室
        docMap.put("identifyStatus", doctor.getIdentifyStatus()); //个人身份验证状态 0 未认证 1 认证中 2 认证成功 3 认证失败
        docMap.put("identifyRemarks",doctor.getIdentifyRemarks());//身份验证备注(验证失败才返回具体信息)
        //组合总数据map
        map.put("doctor", docMap);                       //医生信息
        map.put("businessDay", clinic.getBusinessDay()); //营业天数(可以直接通过createDate算，不用开定时任务)
        map.put("createDate", clinic.getCreateDate());   //成立日期
        map.put("name", clinic.getName());               //名称
        map.put("clinicId", clinic.getId());             //诊所id
        map.put("notes", clinic.getNote());              //诊所简介
        map.put("isOpen", clinic.getBusiness());         //是否开张
        map.put("hasClinic",true);                       //是否有诊所 标识位 方便前端跳转

        return new ReturnResult(map);

    }

    /**
     * 更新诊所简介
     * @param data
     * @param account
     * @return
     */
    public ReturnResult updateClinicNote(SingleStringBean data,Account account) {
        //根据医生id查询诊所信息
        Clinic clinic = clinicMapper.selectByDoctorId(account.getId());
        clinic.setNote(data.getParam());
        clinic.setUpdateDate(new Date());
        //update
        clinicMapper.updateByPrimaryKeySelective(clinic);
        return ReturnResult.RESULT_SUCCESS;
    }

    /**
     * 更新诊所名称
     * @param data
     * @param account
     * @return
     */
    public ReturnResult updateClinicName(SingleStringBean data,Account account){
        //根据医生id查询诊所信息
        Clinic clinic = clinicMapper.selectByDoctorId(account.getId());
        clinic.setName(data.getParam());
        clinic.setUpdateDate(new Date());
        //update
        clinicMapper.updateByPrimaryKeySelective(clinic);
        return ReturnResult.RESULT_SUCCESS;
    }

    /**
     * 我加入的诊所 (修改原有数据结构)
     * @param account
     * @return
     */
    public ReturnResult clinicsJoined(Account account, SingleIntVo data){
        //查询医生--诊所关系list
        List<DoctorClinicBean> list = doctorClinicMapper.selectDoctorByDoctorId(account.getId(),data.getValue());
        //初始化返回list
        List<Map<String,Object>> returnList = new ArrayList<>();
        for (DoctorClinicBean item : list) {
            //查询诊所信息
            Clinic clinic = clinicMapper.selectByPrimaryKey(item.getClinicId());
            Map<String,Object> map = new HashMap<>();
            map.put("clinicId",item.getClinicId());                                     //诊所id
            map.put("doctorName",item.getDoctorName());                                 //医生名字
            map.put("faceImage",item.getFaceImage());                                   //头像
            map.put("doctorId",item.getDoctorId());                                     //医生id
            map.put("doctorLevel",item.getDepartmentName());                            //医生职称
            map.put("clinicName",clinic==null?"":clinic.getName());                     //诊所名称
            map.put("doctorCount",clinic==null?"":clinic.getDoctorCount());             //诊所专家数
            map.put("departmentCount",clinic==null?"":clinic.getDoctorDepartmentCount());//诊所科室数

            returnList.add(map);
        }
        return new ReturnResult(returnList);
    }

    /**
     * 离开诊所
     * @param data
     * @param account
     * @return
     */
    public ReturnResult exitClinic(SingleStringBean data,Account account){
        //构造请求参数实体类
        DoctorClinicKey doctorClinicKey = new DoctorClinicKey();
        doctorClinicKey.setClinicId(data.getParam());
        doctorClinicKey.setDoctorId(account.getId());
        DoctorClinic doctorClinic = doctorClinicMapper.selectByPrimaryKey(doctorClinicKey);

        Clinic clinic = clinicMapper.selectByPrimaryKey(data.getParam());
        //为null判断
        if(doctorClinic==null||clinic==null){
            return ReturnResult.NONE_CLINIC;
        }
        doctorClinic.setStatus(Final.DEL_TRUE); //设置删除标识
        //更新医生-诊所 表记录
        doctorClinicMapper.updateByPrimaryKeySelective(doctorClinic);

        clinic.setDoctorCount(clinic.getDoctorCount()-1); //诊所医生数 -1
        clinic.setUpdateDate(new Date());
        //更新诊所表记录
        clinicMapper.updateByPrimaryKey(clinic);

        logger.debug(">>>>>>>>>>用户:[{}]离开诊所:[{}]成功，诊所剩余人数:[{}]",account.getPhone(),
                clinic.getName(),clinic.getDoctorCount());
        return ReturnResult.RESULT_SUCCESS;
    }

    /**
     * 根据诊所id查询诊所综合信息 (查看自己或他人诊所 整张页面数据)
     * @param data 诊所id
     * @return
     */
    public ReturnResult clinicCard(SingleStringBean data){
        //通过诊所id查询诊所 以及 诊所CEO信息
        Clinic clinic = clinicMapper.selectByPrimaryKey(data.getParam());
        Doctor doctor = doctorMapper.selectByPrimaryKey(clinic.getDoctorId());
        //为null 处理
        if(clinic == null ||doctor == null){
            return ReturnResult.RESULT_NONE;
        }
        //根据数据结构，初始化集合
        Map<String,Object> returnMap = new HashMap<>();     //总数据集合
        Map<String,Object> docCeoMap = new HashMap<>();     //诊所CEO医生集合
        Map<String,Object> clinicMap = new HashMap<>();     //诊所集合
        List<Map<String,Object>> partnerList = new ArrayList<>();     //诊所合伙人集合
        //组装数据 docCeoMap
        docCeoMap.put("id",doctor.getId());                                 //CEO id
        docCeoMap.put("name",doctor.getRealName());                         //CEO 姓名
        docCeoMap.put("faceImage",doctor.getFaceimg());                     //CEO 头像
        docCeoMap.put("title",doctor.getDepartmentName());                  //CEO 职称
        docCeoMap.put("department",doctor.getDepartmentFunctionName());     //CEO 科室名称
        docCeoMap.put("money",doctor.getTreatmentMoney());                  //CEO 诊费
        docCeoMap.put("hospital",doctor.getHospitalName());                 //CEO 所在医院名称
        docCeoMap.put("credits",doctor.getCredits());                       //CEO 评分数
        docCeoMap.put("thumbsUp",doctor.getThumbsUp());                     //CEO 点赞数
        //组装数据 clinicMap
        clinicMap.put("id",clinic.getId());                                 //诊所 id
        clinicMap.put("name",clinic.getName());                             //诊所 名称
        clinicMap.put("note",clinic.getNote());                             //诊所 理念
        clinicMap.put("doctorCount",clinic.getDoctorCount());               //诊所 专家数量
        clinicMap.put("doctorRef",clinic.getDoctorRefCount());              //诊所 转诊数
        clinicMap.put("doctorRecive",clinic.getDoctorReciveCount());        //诊所 接诊数
        clinicMap.put("departmentCount",clinic.getDoctorDepartmentCount()); //诊所 科室数
        //根据诊所id 获取背景图list
        List<ClinicImage> clinicImageList = clinicImageMapper.selectImageIdByClinicId(data.getParam());
        clinicMap.put("images",clinicImageList);                            //诊所 背景图
        //组装数据 partnerList
        //根据CEO id 获取 合伙人所在科室 list
        List<DepartmentFunctionDoctorBean> departmentFunctionDoctorBeanList = doctorMapper
                .selectPartnerDepartmentFunction(doctor.getId());
        //遍历科室list 获取合伙人列表
        for (DepartmentFunctionDoctorBean item : departmentFunctionDoctorBeanList){
            Map<String,Object> itemMap = new HashMap<>();
            List<Doctor> doctorList = doctorMapper.selectPartnerCard(doctor.getId(),item.getDepartmentFunctionId());
            itemMap.put("departmentId",item.getDepartmentFunctionId());          // 科室id
            itemMap.put("departmentName",item.getDepartmentFunctionName());      // 科室名称
            itemMap.put("departmentCount",item.getDepartmentFunctionCount());    // 科室合伙人数
            List<Map<String,Object>> docMapList = new ArrayList<>();
            for (Doctor docItem : doctorList){
                Map<String,Object> docItemMap = new HashMap<>();
                docItemMap.put("id",docItem.getId());                            // 合伙人 id
                docItemMap.put("name",docItem.getRealName());                    // 合伙人 姓名
                docItemMap.put("faceImage",docItem.getFaceimg());                // 合伙人 头像
                docItemMap.put("hospital",docItem.getHospitalName());            // 合伙人 所在医院名称
                docItemMap.put("title",docItem.getDepartmentName());             // 合伙人 职称
                docItemMap.put("department",docItem.getDepartmentFunctionName());// 合伙人 科室名称

                docMapList.add(docItemMap);
            }
            itemMap.put("doctors",docMapList);                                   //合伙人 list

            partnerList.add(itemMap);
        }

        //数据汇总
        returnMap.put("doctor",docCeoMap);
        returnMap.put("clinic",clinicMap);
        returnMap.put("partner",partnerList);

        return new ReturnResult(returnMap);
    }
}
