package com.whiteplanet.web.service.doctor;

import com.alibaba.fastjson.JSONObject;
import com.whiteplanet.mapper.*;
import com.whiteplanet.mapper.model.Certificates;
import com.whiteplanet.mapper.model.Clinic;
import com.whiteplanet.mapper.model.ClinicImage;
import com.whiteplanet.mapper.model.Doctor;
import com.whiteplanet.utils.WPStringUtil;
import com.whiteplanet.web.Final;
import com.whiteplanet.web.entry.doctor.ClinicDetailBean;
import com.whiteplanet.web.entry.doctor.ClinicInfoBean;
import com.whiteplanet.web.entry.doctor.DoctorClinicBean;
import com.whiteplanet.web.service.TestApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author:wuzhiyuan
 * @description: 医生诊所相关服务测试
 * @date: Created in 14:52 2017/12/20
 * @modified By:
 */
@SpringBootTest(classes = TestApplication.class)
@RunWith(SpringRunner.class)
public class ClinicDortorServiceTest {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

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


    private static final String CLINIC_ID = "00abf7511df94046ae73eed84388a3fe";
    /**
     * 修改医生诊所姓名
     */
    @Test
    public void updateClinicName(){
        Clinic clinic = clinicMapper.selectByDoctorId(CLINIC_ID);
        Assert.assertNull(clinic);
        Clinic clinicNew = new Clinic();
        String clinicName = "bray的医疗政所";
        clinicNew.setId("0009bd15488d43d48f2f5aa3c816cb38");
        clinicNew.setName(clinicName);
        clinicNew.setUpdateDate(new Date());
        try {
            clinicMapper.updateByPrimaryKeySelective(clinicNew);
        } catch (Exception e) {
            logger.error(">>>>>>>>>>>诊所名称为:{},x修改失败!",clinicName);
            e.printStackTrace();
        }
    }
    /**
     * 修改诊所理念测试
     */
    @Test
    @Rollback
    public  void updateClinicNote() {
        Clinic clinic = clinicMapper.selectByDoctorId(CLINIC_ID);
        Assert.assertNull(clinic);
        String clinicNote = "我的诊所我做主";
        Clinic clinicNew = new Clinic();
        clinic.setId(clinic.getId());
        clinic.setNote(clinicNote);
        clinic.setUpdateDate(new Date());
        try {
            clinicMapper.updateByPrimaryKeySelective(clinicNew);
        } catch (Exception e) {
            logger.error(">>>>>>>>>>>诊所理念：{} ,修改失败!",clinicNote);
            e.printStackTrace();
        }
    }
    /**
     * 获取诊所信息
     */
    @Test
    public void myClinicInfo() {
        Clinic clinic = clinicMapper.selectByDoctorId(CLINIC_ID);
        //判断是否有诊所，如果没有则不进行下面的逻辑
        if(Objects.isNull(clinic)) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put(Final.HAS_CLINIC,false);
        }
        //获取所有医生信息
        Doctor doctor = doctorMapper.selectByPrimaryKey(CLINIC_ID);
        //获取部门所属code
        String departmentCode = departmentMapper.selectParentCodeByPrimaryKey(CLINIC_ID);
        String code = StringUtils.isEmpty(departmentCode) ? Final.ADMINISTRATION_CODE : departmentCode;
        DoctorClinicBean doctorClinicBean = new DoctorClinicBean(doctor,code);
        ClinicInfoBean clinicInfoBean = new ClinicInfoBean(clinic);
        clinicInfoBean.setDoctor(doctorClinicBean);
        System.out.println(JSONObject.toJSON(clinicInfoBean));
    }

    /**
     * 修改诊所营业状态
     */
    @Test
    @Rollback
    public void updateClinicStatus() {
        Doctor doctor = doctorMapper.selectByPrimaryKey(CLINIC_ID);
        if(!Objects.isNull(doctor)) {
            //认证未通过，该部门无法开诊
            if(!departmentMapper.selectByPrimaryKey(doctor.getDepartmentId()).getVisiting());
            return;
        }
        Clinic clinic = clinicMapper.selectByDoctorId(CLINIC_ID);
        //无相关诊所信息
        if(Objects.isNull(clinic)) return;
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
        List<Certificates> certificates = certificatesMapper.selectByDoctorIdAndStatus(CLINIC_ID, 2);
        //如果上传的证件少于四张，则不符合认证要求
        if(CollectionUtils.isEmpty(certificates) || certificates.size() < 4) return;
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
            return;
        //修改诊所状态信息
        Clinic clinicNew = updateClinic(clinic, businessDay);
        try {
            clinicMapper.updateByPrimaryKeySelective(clinicNew);
        } catch (Exception e) {
            logger.error(">>>>>>>>诊所开业状态修改失败!");
            e.printStackTrace();
        }
    }
    /**
     * 诊所详情
     * @return
     */
    @Test
    @Rollback
    public void clinicDetails() {
        Clinic clinic = clinicMapper.selectByDoctorId(CLINIC_ID);
        //如果没有相关诊所，则插入新的诊所信息
        if(Objects.isNull(clinic)) {
            clinic = new Clinic();
            clinic.setId(WPStringUtil.GETuuid());
            clinic.setCreateDate(new Date());
            clinic.setName("bray的医疗政所");
            clinic.setDoctorCount(0);
            clinic.setDoctorId(CLINIC_ID);
            try {
                clinicMapper.insertSelective(clinic);
            } catch (Exception e) {
                logger.error(">>>>>>>>>诊所名称为:{}, 插入失败...");
                e.printStackTrace();
            }
        }
        //获取诊所图片数量
        List<ClinicImage> clinicImages = clinicImageMapper.selectImageIdByClinicId(CLINIC_ID);
        ClinicDetailBean clinicDetailBean = new ClinicDetailBean();
        clinicDetailBean.setName(clinic.getName());
        clinicDetailBean.setNote(clinic.getNote());
        clinicDetailBean.setClinicImageCount(CollectionUtils.isEmpty(clinicImages) ? 0 : clinicImages.size());
        System.out.println(JSONObject.toJSON(clinicDetailBean));
//        return new ReturnResult(JSONObject.toJSON(clinicDetailBean));
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