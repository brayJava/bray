package com.whiteplanet.admin.service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whiteplanet.admin.dto.CertificatesDto;
import com.whiteplanet.admin.dto.DoctorDto;
import com.whiteplanet.mapper.*;
import com.whiteplanet.mapper.model.*;
import com.whiteplanet.sms.SMSResult;
import com.whiteplanet.sms.SendSms;
import com.whiteplanet.sms.SendSmsService;
import com.whiteplanet.utils.WPStringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import java.time.Clock;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static org.junit.Assert.assertNotNull;
/**
 * @author:wuzhiyuan
 * @description: 获取医生用户相关信息测试类
 * @date: Created in 18:30 2017/11/26
 * @modified By:
 */
@SpringBootTest(classes = TestApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class DoctorServiceTest {

    @Autowired
    public DoctorMapper doctorMapper;

    @Autowired
    public CertificatesMapper certificatesMapper;

    @Autowired
    public PubFileMapper pubFileMapper;

    @Autowired
    public HospitalMapper hospitalMapper;

    @Autowired
    public SendSmsService sendSmsService;

    @Autowired
    public MessageGroupMapper messageGroupMapper;

    @Autowired
    public MessageTemplateMapper messageTemplateMapper;
//    @Autowired
//    public SmsSendService smsSendService;
    /**
     * 查询医生用户所有关联信息
     */
    @Test
    public void selectAllDoctorUser() {
        long ls = Clock.systemDefaultZone().millis();
        String startTime = "2017-11-00";
        String endTime = "2017-11-20";
        //分页查询
        PageHelper.startPage(1,5);
        List<Doctor> doctors = doctorMapper.selectAllDocdor();
        List<DoctorDto> doctorDtos = new ArrayList<DoctorDto>();
        doctors.forEach(doctor -> {
            final DoctorDto doctorDto = new DoctorDto();
            //查询所有证件信息
            List<Certificates> certificatesList = certificatesMapper.selectByDoctorId(doctor.getId());
            if(!CollectionUtils.isEmpty(certificatesList)) {
                certificatesList.forEach(certificates -> {
                    PubFile pubFile = pubFileMapper.selectByPrimaryKey(certificates.getPubFileId());
                    if(!Objects.isNull(pubFile)) {
                        final CertificatesDto  certificatesDto = new CertificatesDto();
                        certificatesDto.setPubFile(pubFile);
                    }
                });
                doctorDto.setCertificates(certificatesList);
//                doctorDto.setDoctor(doctor);
            }
            doctorDtos.add(doctorDto);
        });
        long le = Clock.systemDefaultZone().millis();
        System.out.println("获取医生用户所用时间："+(le - ls));
        assertNotNull(doctorDtos);
    }
    /**
     * 更改审核状态
     */
    @Test
    @Rollback
    public void updateDoctorAuditStatus() {
        Integer status  = new Integer("1");
        List<Certificates> certificates = certificatesMapper.selectByDoctorId("doctorId");
        if(!CollectionUtils.isEmpty(certificates)) {
            certificates.forEach(certificate -> {
                certificate.setStatus(status);
                certificatesMapper.updateByPrimaryKey(certificate);
            });
        }
    }
    /**
     * 分页插件查询
     */
    @Test
    public void selectDoctorUserByPage() {
        String startTime = "2017-11-00";
        String endTime = "2017-11-20";
        PageHelper.startPage(1,5);
        List<Doctor> doctors = doctorMapper.selectAllDocdor();
        PageInfo<Doctor> doctorPageInfo = new PageInfo<>(doctors);
        System.out.println( doctorPageInfo.getPages());
        doctorPageInfo.getList().forEach(doctor -> {
            System.out.println(doctor.getCode());
        });
    }
    /**
     * 用户列表按条件查询
     */
    @Test
    public void fuzzySelectDoctorUserByPage() {
        long ls = Clock.systemDefaultZone().millis();
        String startTime = "2017-11-00";
        String endTime = "2017-11-20";
        //分页查询
        PageHelper.startPage(1,5);
        Doctor doctor = new Doctor();
        doctor.setId("00abf7511df94046ae73eed84388a3fe");
        doctor.setRealName("我不是医生");
        doctor.setHospitalName("中山大学附属第三医院");
        doctor.setStatus(new Integer("0"));
        doctor.setPhone("13875450006");
        List<Doctor> doctors = doctorMapper.selectDoctorByCondition(doctor.getId(),doctor.getPhone(),doctor.getRealName(),
                doctor.getHospitalName(),String.valueOf(doctor.getStatus()));
        List<DoctorDto> doctorDtos = new ArrayList<DoctorDto>();
        doctors.forEach(d -> {
            final DoctorDto doctorDto = new DoctorDto();
            //查询所有证件信息
            List<Certificates> certificatesList = certificatesMapper.selectByDoctorId(d.getId());
            if(!CollectionUtils.isEmpty(certificatesList)) {
                certificatesList.forEach(certificates -> {
                    PubFile pubFile = pubFileMapper.selectByPrimaryKey(certificates.getPubFileId());
                    if(!Objects.isNull(pubFile)) {
                        final CertificatesDto  certificatesDto = new CertificatesDto();
                        certificatesDto.setPubFile(pubFile);
                    }
                });
                doctorDto.setCertificates(certificatesList);
//                doctorDto.setDoctor(d);
            }
            doctorDtos.add(doctorDto);
        });
        long le = Clock.systemDefaultZone().millis();
        System.out.println("获取医生用户所用时间："+(le - ls));
        assertNotNull(doctorDtos);
    }
    public String dateFormat(Date date) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String format = f.format(date);
        return "";

    }

    @Test
    public void sendSms() {
        sendSmsService.sendSms("18507906861","mr.wu",5);
    }

    @Test
    public void send(){
        String code = "code623-1";
        Map<String,String> paramMap = new LinkedHashMap<>();
        paramMap.put("doctor","wuyuan");
        MessageGroup messageGroup = messageGroupMapper.selectByCode(code);
        String transDocPhone = "";
        if(!Objects.isNull(messageGroup)) {
            List<MessageTemplate> messageTemplates = messageTemplateMapper.selectByGroup(messageGroup.getId(), 2);
            messageTemplates.forEach(messageTemplate -> {
                String msg = WPStringUtil.render(messageTemplate.getNote(),paramMap); //替换参数
                switch (messageTemplate.getKind()) {
                    case 1://IM消息
//                        jMessageHandleService.sendCustomMessage("admin","single"
//                                ,"system",userId,msg,"备注");
                        break;
                    case 2://微信消息
                        break;
                    case 0://短信消息
                        sendSms("18507906861",msg);
                        break;
                }
            });
        }
    }
    /**
     * @param phoneNo  需发送的手机号码
     * @param msgContext 短信内容
     */
    public void sendSms(String phoneNo, String msgContext){

//        String smsTemp = handlerMsg(smsCode);
//        String msg = WPStringUtil.render(smsTemp,paramMap); //替换参数
        //发送短信
        String result = SendSms.send(phoneNo,msgContext);
        SMSResult smsResult = JSON.parseObject(result, SMSResult.class);
    }
}
