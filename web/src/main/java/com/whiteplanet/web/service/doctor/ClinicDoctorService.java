package com.whiteplanet.web.service.doctor;

import com.alibaba.fastjson.JSONObject;
import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.*;
import com.whiteplanet.mapper.model.Certificates;
import com.whiteplanet.mapper.model.Clinic;
import com.whiteplanet.mapper.model.ClinicImage;
import com.whiteplanet.mapper.model.Doctor;
import com.whiteplanet.utils.WPStringUtil;
import com.whiteplanet.web.Final;
import com.whiteplanet.web.entry.*;
import com.whiteplanet.web.entry.doctor.ClinicDetailBean;
import com.whiteplanet.web.entry.doctor.ClinicInfoBean;
import com.whiteplanet.web.entry.doctor.DoctorClinicBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author:wuzhiyuan
 * @description: 医生诊所相关逻辑处理服务
 * @date: Created in 14:28 2017/12/20
 * @modified By:
 */
@Service
@Transactional
public class ClinicDoctorService extends BaseDoctorService {
    /**
     * 诊所相关mapper映射接口
     */
    @Autowired
    private ClinicMapper clinicMapper;

    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private DoctorMapper doctorMapper;

    @Autowired
    private CertificatesMapper certificatesMapper;
    @Autowired
    private ClinicImageMapper clinicImageMapper;
    /**
     * 初始化我的诊所信息
     * @param account
     * @return
     */
    public ReturnResult initializeInfoFromMyClinic(Account account) {

        Clinic clinic = clinicMapper.selectByDoctorId(account.getId());
        //判断是否有诊所，如果没有则不进行下面的逻辑
        if(Objects.isNull(clinic)) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put(Final.HAS_CLINIC,false);
            return new ReturnResult(jsonObject);
        }
        //获取所有医生信息
        Doctor doctor = doctorMapper.selectByPrimaryKey(account.getId());
        //获取医生部门信息
//        Department department = departmentMapper.selectByPrimaryKey(account.getId());
        //获取部门所属code
        String departmentCode = departmentMapper.selectParentCodeByPrimaryKey(account.getId());
        String code = StringUtils.isEmpty(departmentCode) ? Final.ADMINISTRATION_CODE : departmentCode;
        DoctorClinicBean doctorClinicBean = new DoctorClinicBean(doctor,code);
        ClinicInfoBean clinicInfoBean = new ClinicInfoBean(clinic);
        clinicInfoBean.setDoctor(doctorClinicBean);
        return new ReturnResult(JSONObject.toJSON(clinicInfoBean));
    }
    /**
     * 医生诊所名字修改
     * @param singleStringBean {“text”：诊所名称}
     * @param account 医生基本信息
     * @return
     */
    public ReturnResult UpdateClinicName(SingleStringBean singleStringBean,
                                               Account account) {

        Clinic clinic = clinicMapper.selectByDoctorId(account.getId());
        Clinic clinicNew = new Clinic();
        clinicNew.setId(clinic.getId());
        clinicNew.setName(singleStringBean.getParam());
        clinicNew.setUpdateDate(new Date());
        boolean updateStatus = true;
        try {
            clinicMapper.updateByPrimaryKeySelective(clinicNew);
        } catch (Exception e) {
            logger.error(">>>>>>>>>>>诊所名称为:{},x修改失败!",singleStringBean.getParam());
            updateStatus = false;
            e.printStackTrace();
        }
        if(!updateStatus) return ReturnResult.RESULT_ERROR;
        return ReturnResult.RESULT_SUCCESS;
    }

    /**
     * 修改诊所理念
     * @param singleStringBean {“text”：诊所理念}
     * @param account 医生基本信息
     * @return
     */
    public ReturnResult updateClinicNote(SingleStringBean singleStringBean,Account account) {

        Clinic clinic = clinicMapper.selectByDoctorId(account.getId());
        Clinic clinicNew =  new Clinic();
        clinic.setId(clinic.getId());
        clinic.setNote(singleStringBean.getParam());
        clinic.setUpdateDate(new Date());
        boolean updateStatus = true;
        try {
            clinicMapper.updateByPrimaryKeySelective(clinicNew);
        } catch (Exception e) {
            logger.error(">>>>>>>>>>>诊所理念：{} ,修改失败!");
            updateStatus = false;
            e.printStackTrace();
        }
        if(!updateStatus) return ReturnResult.RESULT_ERROR;
        return ReturnResult.RESULT_SUCCESS;
    }

    /**
     * 修改诊所营业状态
     * @param account
     * @return
     */
    public ReturnResult updateClinicStatus(Account account) {
        Doctor doctor = doctorMapper.selectByPrimaryKey(account.getId());
        if(!Objects.isNull(doctor)) {
            //认证未通过，该部门无法开诊
            if(!departmentMapper.selectByPrimaryKey(doctor.getDepartmentId()).getVisiting())
                return ReturnResult.NO_DEPARTMENT_VISITING;
        }
        Clinic clinic = clinicMapper.selectByDoctorId(account.getId());
        //无相关诊所信息
        if(Objects.isNull(clinic)) return ReturnResult.NONE_CLINIC;
        Integer businessDay = clinic.getBusinessDay(); //营业天数
        //获取当前诊所营业天数，如上一个状态为停业，则重新计算营业时间
        if(!clinic.getBusiness()) {
            long deltaT = 1L;
            if(!Objects.isNull(clinic.getBusinessDate())) {
                //重新开业与上一次停业的时间天数
                deltaT = (new Date().getTime() - clinic.getBusinessDate().getTime()) / 10000 / 60 / 60 / 24;
            }
            //计算出总营业时间
            businessDay += new Long(deltaT).intValue();
        }
        //判断诊所是否通过认证
        List<Certificates> certificates = certificatesMapper.selectByDoctorIdAndStatus(account.getId(), 2);
        //如果上传的证件少于四张，则不符合认证要求
        if(CollectionUtils.isEmpty(certificates) || certificates.size() < 4) return ReturnResult.NO_CERTICATES_VISITING;
        boolean IDCARD_BACK_OK = false, IDCARD_FRONT_OK = false, PHYSICIA_BACK_OK = false, PHYSICIA_FRONT_OK = false;
        for(Certificates c : certificates) {
            switch (c.getType()) {
                case Final.IDCARD_FRONT : IDCARD_FRONT_OK = true; break;
                case Final.IDCARD_BACK : IDCARD_BACK_OK = true; break;
                case Final.PHYSICIA_FRONT : PHYSICIA_FRONT_OK = true; break;
                case Final.PHYSICIA_BACK : PHYSICIA_BACK_OK = true; break;
            }
        }
        //当所需证件有任何一张没有认证通过时，表示认证失败，不能开业
        if(!(IDCARD_FRONT_OK && IDCARD_BACK_OK && PHYSICIA_FRONT_OK && PHYSICIA_BACK_OK))
            return ReturnResult.NO_CERTICATES_VISITING;
        //修改诊所状态信息
        Clinic clinicNew = updateClinic(clinic, businessDay);
        try {
            clinicMapper.updateByPrimaryKeySelective(clinicNew);
        } catch (Exception e) {
            logger.error(">>>>>>>>诊所开业状态修改失败!");
            e.printStackTrace();
        }
        return ReturnResult.RESULT_SUCCESS;
    }
    /**
     * 诊所详情
     * @param account
     * @return
     */
    public ReturnResult clinicDetails(Account account) {
        Clinic clinic = clinicMapper.selectByDoctorId(account.getId());
        //如果没有相关诊所，则插入新的诊所信息
        if(Objects.isNull(clinic)) {
            clinic = new Clinic();
            clinic.setId(WPStringUtil.GETuuid());
            clinic.setCreateDate(new Date());
            clinic.setName(account.getName());
            clinic.setDoctorCount(0);
            clinic.setDoctorId(account.getId());
            try {
                clinicMapper.insertSelective(clinic);
            } catch (Exception e) {
                logger.error(">>>>>>>>>诊所名称为:{}, 插入失败...");
                e.printStackTrace();
            }
        }
        //获取诊所图片数量
        List<ClinicImage> clinicImages = clinicImageMapper.selectImageIdByClinicId(clinic.getId());
        ClinicDetailBean clinicDetailBean = new ClinicDetailBean();
        clinicDetailBean.setName(clinic.getName());
        clinicDetailBean.setNote(clinic.getNote());
        clinicDetailBean.setClinicImageCount(CollectionUtils.isEmpty(clinicImages) ? 0 : clinicImages.size());
        return new ReturnResult(JSONObject.toJSON(clinicDetailBean));
    }
    /**
     * 修改诊所状态信息
     * @param clinic
     * @param businessDay
     * @return
     */
    private Clinic updateClinic(Clinic clinic, Integer businessDay) {
        Clinic clinicNew = new Clinic();
        clinicNew.setId(clinic.getId());
        clinicNew.setBusiness(!clinic.getBusiness());
        clinicNew.setBusinessDay(businessDay);
        clinicNew.setBusinessDate(new Date());
        clinicNew.setUpdateDate(new Date());
        return clinicNew;
    }
}