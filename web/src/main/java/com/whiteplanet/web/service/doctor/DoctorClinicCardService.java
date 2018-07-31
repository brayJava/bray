package com.whiteplanet.web.service.doctor;

import com.alibaba.fastjson.JSONObject;
import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.*;
import com.whiteplanet.mapper.data.DepartmentFunctionDoctorBean;
import com.whiteplanet.mapper.data.DoctorPartnerBean;
import com.whiteplanet.mapper.model.*;
import com.whiteplanet.web.entry.Account;
import com.whiteplanet.web.entry.SingleStringBean;
import com.whiteplanet.web.entry.doctor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author:wuzhiyuan
 * @description: 医生主页信息
 * @date: Created in 14:05 2017/12/27
 * @modified By:
 */
@Service
public class DoctorClinicCardService extends BaseDoctorService {
    /**
     * 医生信息接口
     */
    @Autowired
    private DoctorMapper doctorMapper;
    /**
     * 诊所信息接口
     */
    @Autowired
    private ClinicMapper clinicMapper;
    /**
     * 医生时间表信息接口
     */
    @Autowired
    private DoctorCalendarMapper doctorCalendarMapper;
    /**
     * 医生上传图片接口
     */
    @Autowired
    private DoctorImageMapper doctorImageMapper;
    /**
     * 医生疾病接口
     */
    @Autowired
    private DoctorIllnessMapper doctorIllnessMapper;
    /**
     * 医生和诊所关系接口
     */
    @Autowired
    private DoctorClinicMapper doctorClinicMapper;
    /**
     * 诊所图片接口
     */
    @Autowired
    private ClinicImageMapper clinicImageMapper;
    /**
     * 医生卡片信息（主页）
     * @param reqParam
     * @return
     */
    public ReturnResult doctorClinicCard(SingleStringBean reqParam) {
        DoctorClinicCardBean doctorClinicCardBean = null;
        try {
            Doctor doctor = doctorMapper.selectByPrimaryKey(reqParam.getParam());
            Clinic clinic = clinicMapper.selectByDoctorId(doctor.getId());
            if(Objects.isNull(clinic)) return ReturnResult.RESULT_NONE;
            //医生图片
            List<DoctorImage> doctorImages = doctorImageMapper.selectImageIdByDoctorId(reqParam.getParam());
            if(CollectionUtils.isEmpty(doctorImages))
                doctorImages =  new ArrayList<DoctorImage>();
            //主页医生信息
            CardDoctorBean cardDoctorBean = new CardDoctorBean(doctor, doctorImages);
            //主页诊所信息(不传入诊所图片)
            CardClinicBean cardClinicBean = new CardClinicBean(clinic,null);
            //医生关联疾病项目
            List<Illness> illnesses = doctorIllnessMapper.selectByDoctorId(doctor.getId());
            List<CardIllnessBean> cardIllnessBeans = new ArrayList<>();
            if(!CollectionUtils.isEmpty(illnesses)) {
                illnesses.forEach(illness -> {
                    CardIllnessBean ccb = new CardIllnessBean();
                    ccb.setId(illness.getId());
                    ccb.setName(illness.getName());
                    cardIllnessBeans.add(ccb);
                });
            }
            //医生时间表信息
            List<DoctorCalendar> doctorCalendars = doctorCalendarMapper.selectByDoctorAndKind(doctor.getId(), 0);
            List<CardOutPatientBean> cardOutPatientBeans = new ArrayList<>();
            if(!CollectionUtils.isEmpty(doctorCalendars)) {
                doctorCalendars.forEach(doctorCalendar -> {
                    CardOutPatientBean cardOutPatientBean = new CardOutPatientBean();
                    cardOutPatientBean.setWeek(doctorCalendar.getWeek());
                    cardOutPatientBean.setStage(doctorCalendar.getStage());
                    cardOutPatientBean.setKind(doctorCalendar.getOutpatientType());
                    cardOutPatientBeans.add(cardOutPatientBean);
                });
            }
            //医生主页信息
            doctorClinicCardBean = new DoctorClinicCardBean(cardDoctorBean, cardClinicBean, cardIllnessBeans, cardOutPatientBeans);
        } catch (Exception e) {
            logger.error(">>>>>>>>>>>用户id为{}的医生用户个人主页打开失败...",reqParam.getParam());
            e.printStackTrace();
        }
        return new ReturnResult(JSONObject.toJSON(doctorClinicCardBean));
    }

    /**
     * 他人主页卡片信息
     * @param reqParam {id,"医生id"}
     * @param account
     * @return
     */
    public ReturnResult otherDoctorClinicCard(SingleStringBean reqParam, Account account) {
        OtherDoctorClinicCardBean otherDoctorClinicCardBean = null;
        try {
            //他人诊所信息
            Clinic otherClinic = clinicMapper.selectByPrimaryKey(reqParam.getParam());
            //我的诊所信息
            Clinic myClinic = clinicMapper.selectByDoctorId(account.getId());
            //没有他人诊所信息则返回，数据为空
            if(Objects.isNull(otherClinic)) return ReturnResult.RESULT_NONE;
            //他人医生信息
            Doctor otherDoctor = doctorMapper.selectByPrimaryKey(otherClinic.getDoctorId());
            boolean isOtherPartner = false; //是否是其他医生合伙人
            boolean isMyPartner  = false;   //这个意思是否是我的合伙人
            //查询申请状态
            DoctorClinicKey doctorClinicKey = new DoctorClinicKey();
            doctorClinicKey.setDoctorId(account.getId());    //用户自己
            doctorClinicKey.setClinicId(otherClinic.getId());//列表用户
            DoctorClinic applyDoctorClinic = doctorClinicMapper.selectByPrimaryKey(doctorClinicKey);
            if(!Objects.isNull(applyDoctorClinic)) isOtherPartner = true;
            //查询邀请状态
            doctorClinicKey.setDoctorId(otherDoctor.getId()); //邀请用户
            doctorClinicKey.setClinicId(myClinic.getId());    //邀请人，用户自己的诊所
            DoctorClinic inviteDoctorClinic = doctorClinicMapper.selectByPrimaryKey(doctorClinicKey);
            if(!Objects.isNull(inviteDoctorClinic)) isMyPartner = true;
            //其他用户信息
            CardDoctorBean cardDoctorBean = new CardDoctorBean(otherDoctor,null);
            //其他用户诊所信息
            CardClinicBean cardClinicBean = new CardClinicBean(otherClinic, clinicImageMapper.selectImageIdByClinicId(reqParam.getParam()));
            //查询其他用户合伙人科室信息
            List<DepartmentFunctionDoctorBean> departmentFunctionDoctorBeans = doctorMapper.selectPartnerDepartmentFunction(otherDoctor.getId());
            //查询其他用户最新加入的三个合伙人信息
            List<DoctorPartnerBean> doctorPartnerBeans = doctorMapper.selectPartnerByDocAndDf(otherDoctor.getId(), null, 3);
            PartnerBean partnerBean = new PartnerBean();
            partnerBean.setDepartmentFunctionDoctorBeans(CollectionUtils.isEmpty(departmentFunctionDoctorBeans)
                    ? new ArrayList<>() : departmentFunctionDoctorBeans);
            partnerBean.setDoctorPartnerBeans(CollectionUtils.isEmpty(doctorPartnerBeans)
                    ? new ArrayList<>() : doctorPartnerBeans);
            //合伙人关系
            IsPartner isPartner = new IsPartner(isOtherPartner, isMyPartner);
            //他人用户主页卡片
            otherDoctorClinicCardBean = new OtherDoctorClinicCardBean(cardDoctorBean, cardClinicBean, partnerBean, isPartner);
        } catch (Exception e) {
            logger.error(">>>>>>>>>>诊所id为{} 的医生个人主页信息打开失败...",reqParam.getParam());
            e.printStackTrace();
        }
        return new ReturnResult(JSONObject.toJSON(otherDoctorClinicCardBean));
    }
}
