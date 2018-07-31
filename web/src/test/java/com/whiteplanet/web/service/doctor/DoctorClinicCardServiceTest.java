package com.whiteplanet.web.service.doctor;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.mapper.*;
import com.whiteplanet.mapper.model.*;
import com.whiteplanet.web.entry.doctor.*;
import com.whiteplanet.web.service.TestApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 医生卡片信息测试类
 * @date: Created in 14:26 2017/12/28
 * @modified By:
 */
@SpringBootTest(classes = TestApplication.class)
@RunWith(SpringRunner.class)
public class DoctorClinicCardServiceTest {
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

    @Test
    public void doctorClinicCard() {
        Doctor doctor = doctorMapper.selectByPrimaryKey("e6d7662bf1df444f938f6aac15b890ec");
        Clinic clinic = clinicMapper.selectByDoctorId(doctor.getId());
        Assert.assertNotNull(clinic);
        //医生图片
        List<DoctorImage> doctorImages = doctorImageMapper.selectImageIdByDoctorId("e6d7662bf1df444f938f6aac15b890ec");
        if(CollectionUtils.isEmpty(doctorImages))
            doctorImages =  new ArrayList<DoctorImage>();
        //主页医生信息
        CardDoctorBean cardDoctorBean = new CardDoctorBean(doctor, doctorImages);
        //主页诊所信息
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
        DoctorClinicCardBean doctorClinicCardBean = new DoctorClinicCardBean(cardDoctorBean, cardClinicBean, cardIllnessBeans, cardOutPatientBeans);
        System.out.println(JSONObject.toJSON(doctorClinicCardBean));
    }


}
