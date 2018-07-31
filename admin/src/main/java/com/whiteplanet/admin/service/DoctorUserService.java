package com.whiteplanet.admin.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whiteplanet.admin.dto.*;
import com.whiteplanet.admin.util.DateUtil;
import com.whiteplanet.config.PushExtrasType;
import com.whiteplanet.im.jiguang.api.service.JMessageHandleService;
import com.whiteplanet.mapper.*;
import com.whiteplanet.mapper.data.DoctorCertificatesBean;
import com.whiteplanet.mapper.model.*;
import com.whiteplanet.push.jg.impl.JpushServiceImpl;
import com.whiteplanet.sms.Final;
import com.whiteplanet.sms.SendSmsService;
import com.whiteplanet.utils.WPStringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;
/**
 * @author:wuzhiyuan
 * @description:  医生用户处理实现类
 * @date: Created in 17:20 2017/11/27
 * @modified By:
 */
@Component
@Transactional
public class DoctorUserService extends UserBaseService{
    public static final int INT_1 = 1;
    public static final int INT_3 = 3;
    public static final int INT_2 = 2;
    public static final int INT_4 = 4;
    public static final int IDENTIFY_STATUS = 5;
    public static final int SMS_TYPE_6 = 6;
    public static final int SMS_TYPE_5 = 5;
    public static final String A05 = "A05";
    public static final String ADMIN = "admin";
    public static final String SINGLE = "single";
    public static final String ADMINTWO = "Admintwo";
    public static final String REASON = "";
    public static final String TITLE = "实名认证";
    /**
     *  短信发送接口
     */
    @Autowired
    public SendSmsService sendSmsService;
    /**
     * 极光推送接口
     */
    @Autowired
    public JpushServiceImpl jpushServiceImpl;
    /**
     * IM系统消息相关服务
     */
    @Autowired
    public JMessageHandleService jMessageHandleService;
    /**
     * 用户列表按条件查询
     */
    public Map<String,Object> fuzzySelectDoctorUserByPage(DoctorCerDto doctorCerDto) {
//        long ls = Clock.systemDefaultZone().millis();
        Map<String,Object> resMap = new HashMap<String,Object>();
        List<DoctorCertificatesBean> doctorCertificatesBeans = null;
        try {
            //分页查询
            PageHelper.startPage(doctorCerDto.pageNum,doctorCerDto.pageSize);
            doctorCertificatesBeans = doctorCertificatesMapper.selectDortorCertificates(doctorCerDto.getDoctorId()
                    ,doctorCerDto.getPhone(),doctorCerDto.getDoctorName(),doctorCerDto.getHospitalName(),doctorCerDto.getStatus(),
                    doctorCerDto.getStartTime(),doctorCerDto.getEndTime(),doctorCerDto.getIdcardNum(),doctorCerDto.getLicenseType()
                    ,doctorCerDto.getLicenseCode());
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询失败....");
        }
        if (CollectionUtils.isEmpty(doctorCertificatesBeans))
            return new HashMap<>();
        PageInfo<DoctorCertificatesBean> pageInfo = new PageInfo<>(doctorCertificatesBeans);
        List<DoctorDto> doctorDtoData = getDoctorDtoData(doctorCertificatesBeans);
        resMap.put(Constant.PAGEINFO,pageInfo);
        resMap.put(Constant.LIST,doctorDtoData);
        System.out.println("DoctorUserService中："+doctorMapper);
        return resMap;
    }
    /**
     * 更改审核状态
     */
    public boolean updateDoctorAuditStatus(DoctorStatusDto doctorStatusDto) {
        //判断是否状态更新成功
        boolean updateFlag = true;
        Doctor doctor = getDoctor(doctorStatusDto);
        Doctor originalDoctor = doctorMapper.selectByPrimaryKey(doctor.getId());
        //返回doctor详情信息
        if(Objects.isNull(originalDoctor)) {
            logger.info(">>>>>>>>>>>>>>查询用户id为：{} 的医生信息失败，无可更新数据...",doctor.getId());
            return false;
        } else if(StringUtils.isEmpty(doctorStatusDto.getDoctorName()) //如果传参没有医生姓名或手机号码，则通过userId获取原始医生信息的姓名或号码
                    || StringUtils.isEmpty(doctorStatusDto.getPhone())){
                    doctor.setRealName(originalDoctor.getRealName());
                    doctor.setPhone(originalDoctor.getPhone());
                    doctorStatusDto.setPhone(originalDoctor.getPhone());
                    doctorStatusDto.setDoctorName(originalDoctor.getRealName());
        }
        //待重新审核未通过则设置为5
        if(originalDoctor.getIdentifyStatus() == INT_4
                && doctor.getIdentifyStatus() == INT_3) {
            doctor.setIdentifyStatus(IDENTIFY_STATUS);
        }
        try {
            //修改用户信息状态和描述
            doctorMapper.updateByPrimaryKeySelective(doctor);
        } catch (Exception e) {
            updateFlag = false;
            logger.error(">>>>>>>>>>>>>>>修改用户id为{} 的医生用户状态信息失败...",doctor.getId());
            e.printStackTrace();
        }
        try {
            if(doctorStatusDto.getIdentifyStatus() == INT_3) {
                //处理审核不通过流程
                dealAuditFailure(doctorStatusDto, doctor);
            } else if (doctorStatusDto.getIdentifyStatus() == INT_2) {
                //处理审核通过流程
                dealAuditSuccess(doctorStatusDto, doctor, originalDoctor);
            }
        } catch (Exception e) {
            updateFlag = false;
            logger.error(">>>>>>>>>>用户id为{}的医生用户审核异常...",doctor.getId());
            e.printStackTrace();
        }
        return updateFlag;
    }
    
    private void dealAuditSuccess(DoctorStatusDto doctorStatusDto, Doctor doctor, Doctor originalDoctor) {
        //判断是否职级发生变化，如有变化，需改变状态信息
        DepartmentChangeTemp departmentChangeTemp = departmentChangeTempMapper.selectByDoctorId(originalDoctor.getId());
        if(!Objects.isNull(departmentChangeTemp) //行政切非行政身份变更，其他情况不变更职级信息
                && A05.equals(departmentMapper.selectParentCodeByPrimaryKey(originalDoctor.getDepartmentId()))
                &&  !A05.equals(departmentMapper.selectParentCodeByPrimaryKey(departmentChangeTemp.getToDepartmentId()))) {
            //更新医生职级表职级
            changeDoctorMessageFromTemp(doctor, departmentChangeTemp);
            doctorMapper.updateByPrimaryKeySelective(doctor);
            //修改临时表状态,设置改字段为废除状态
            departmentChangeTemp.setDelFlag(INT_1);
            departmentChangeTempMapper.updateByPrimaryKeySelective(departmentChangeTemp);
        }
        //插入之前，先查是否有证件信息
        List<CertificatesDetail> certificatesDetails = certificatesDetailMapper.selectByDoctorId(doctor.getId());
        if (!CollectionUtils.isEmpty(certificatesDetails)) {
            //修改证件详情信息
            certificatesDetailMapper.updateStatusByDoctorId(doctor.getId());
        }
        // 证件详细信息收集
        CertificatesDetail certificatesDetail = getCertificatesDetail(doctorStatusDto);
        //将填入的证件信息放入表中记录
        certificatesDetailMapper.insertSelective(certificatesDetail);
        //医生邀请关系建立
        DoctorPatientRelate(doctorStatusDto);
        //审核通过短信发送(SMS)
        sendSmsService.sendSms(doctor.getPhone(), doctor.getRealName(), SMS_TYPE_5);
        //审核成功推送通知
        jpushServiceImpl.sendPushWithNotificationByAliasToAllPlatform(doctor.getId(),
                Final.PUSH_AUDIT_SUCCESS_ALERT, PushExtrasType.CERTIFICATES_AUDIT_SUCCESS);
        //im系统推送消息
        jMessageHandleService.sendCustomMessage(ADMIN,SINGLE,ADMINTWO
                ,doctor.getId(), Final.PUSH_AUDIT_SUCCESS_ALERT);
        //记录审核记录
        messageAuditMethod(doctor,INT_2, REASON);
    }

    private void dealAuditFailure(DoctorStatusDto doctorStatusDto, Doctor doctor) {
        //将证件状态全部改为-1
        certificatesMapper.updateByUpdateAuditStatus(doctor.getId());
        //审核失败短信发送(SMS)
        sendSmsService.sendSms(doctorStatusDto.getPhone(),doctorStatusDto.getDoctorName(), SMS_TYPE_6);
        //审核失败推送通知
        jpushServiceImpl.sendPushWithNotificationAndMessageByAliasToAllPlatform(doctor.getId(),
                Final.PUSH_AUDIT_FAIL_ALERT, PushExtrasType.CERTIFICATES_AUDIT_FAIL,doctorStatusDto.getIdentifyRemarks());
        //im系统推送消息
        jMessageHandleService.sendCustomMessage(ADMIN, SINGLE, ADMINTWO
                ,doctor.getId(),Final.PUSH_AUDIT_FAIL_ALERT);
        //记录审核记录
        messageAuditMethod(doctor,doctor.getIdentifyStatus(),doctorStatusDto.getIdentifyRemarks());
    }

    /**
     *
     * @param doctor
     * @param departmentChangeTemp
     */
    private void changeDoctorMessageFromTemp(Doctor doctor, DepartmentChangeTemp departmentChangeTemp) {
        doctor.setDepartmentId(departmentChangeTemp.getToDepartmentId());
        doctor.setDepartmentName(departmentChangeTemp.getToDepartmentName());
        doctor.setDepartmentFunctionId(departmentChangeTemp.getToFunctionId());
        doctor.setDepartmentFunctionName(departmentChangeTemp.getToFunctionName());
        doctor.setHospitalId(departmentChangeTemp.getToHospitalId());
        doctor.setHospitalName(departmentChangeTemp.getToHospitalName());
    }

    /**
     * 审核通过后医生关系建立
     * @param doctorStatusDto
     */
    private void DoctorPatientRelate(DoctorStatusDto doctorStatusDto) {
        WxApplyRecord wxApplyRecord = wxApplyRecordMapper.selectByPhone(doctorStatusDto.getPhone());
        if(!Objects.isNull(wxApplyRecord)) {
            if(wxApplyRecord.getApplyType() == INT_1) {
                Clinic clinic = clinicMapper.selectByDoctorId(wxApplyRecord.getDocid());
                if (Objects.isNull(clinic)) return;
                DoctorJoinClinicWithBLOBs doctorJoinClinic = new DoctorJoinClinicWithBLOBs();
                doctorJoinClinic.setDoctorId(doctorStatusDto.getDoctorId());
                doctorJoinClinic.setClinicId(clinic.getId());
                DoctorJoinClinicWithBLOBs doctorJoinClinicWithBLOBs = doctorJoinClinicMapper.selectByPrimaryKey(doctorJoinClinic);
                //存在对应记录则不做插入操作
                if(!Objects.isNull(doctorJoinClinicWithBLOBs)) return;
                doctorJoinClinic.setApply(true);
                try {
                    doctorJoinClinicMapper.insertSelective(doctorJoinClinic);
                    logger.info("医生诊所关系插入成功>>>>>>>>>>>>>>>>>");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /**
     *  记录插入
     * @param doctor
     */
    private void messageAuditMethod(Doctor doctor,Integer status,String reason) {
        MessageImHistory messageImHistory = new MessageImHistory();
        messageImHistory.setType(status);
        messageImHistory.setTitle(TITLE);
        messageImHistory.setContent(reason);
        messageImHistory.setUserId(doctor.getId());
        messageImHistory.setSendDate(new Date());
//        MessagePushHistory messagePushHistory = new MessagePushHistory();
//        messagePushHistory.setAuditStatus(status+"");
//        messagePushHistory.setCreateDate(new Date());
//        messagePushHistory.setDoctorid(doctor.getId());
//        messagePushHistory.setType("1");
//        messagePushHistory.setReason(reason);
        try {
            messageImHistoryMapper.insertSelective(messageImHistory);
            logger.info(">>>>>>>>>>>>>>>>>推送记录插入成功{}",messageImHistory.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取医生所有关联证件信息
     * @param DoctorCertificatesBeans
     */
    private  List<DoctorDto> getDoctorDtoData(List<DoctorCertificatesBean> DoctorCertificatesBeans) {
        List<DoctorDto> doctorDtos = new ArrayList<DoctorDto>();
        DoctorCertificatesBeans.forEach(dc -> {
            final DoctorDto doctorDto = new DoctorDto();
            //查询所有证件信息
            List<Certificates> certificatesList = certificatesMapper.selectByDoctorId(dc.getId());
            //默认id为00001，如果没有图片，打开默认的图片
            CertificatePathDto certificatePathDto = new CertificatePathDto(Constant.DEFAULT_PATH,Constant.DEFAULT_PATH
                    ,Constant.DEFAULT_PATH,Constant.DEFAULT_PATH,Constant.DEFAULT_PATH);
            if(CollectionUtils.isEmpty(certificatesList)) {
                doctorDto.setCertificatePathDto(certificatePathDto);
            } else {
                final CertificatesDto certificatesDto = new CertificatesDto();
                certificatesList.forEach(certificates -> {
                    PubFile pubFile = pubFileMapper.selectByPrimaryKey(certificates.getPubFileId());
                    if(!Objects.isNull(pubFile)) {
                        certificatesDto.setPubFile(pubFile);
                    }
                    //证件路径填充类
                    fillCertificdatePath(certificatePathDto, certificates);
                });
                doctorDto.setCertificatePathDto(certificatePathDto);
            }
            //获取上传时间并展示
            doctorDto.setStartTime(DateUtil.formatDate(dc.getUploadDate(),DateUtil.PATTERN_yyyy_MM_dd_HH_mm_ss));
            //  后台时间格式转换
            doctorDto.setCertificates(certificatesList);
            doctorDto.setDoctorCertificatesBean(dc);
            doctorDtos.add(doctorDto);
            //将审状态证件按上传时间降序
//            CertificatesComparator certificatesComparator = new CertificatesComparator();
//            Comparator comparator = Collections.reverseOrder(certificatesComparator);
//            Collections.sort(doctorDtos,comparator);
        });
        return doctorDtos;
    }
    /**
     * 证件照判断处理
     * @param certificatePathDto
     * @param certificates
     */
    private void fillCertificdatePath(CertificatePathDto certificatePathDto, Certificates certificates) {
        String fileType = certificates.getType();
        if (!StringUtils.isEmpty(fileType)) {
            if (fileType.equals(CertificateTypeIFace.IDCARD_F)) {
                certificatePathDto.setIdCardF(certificates.getPubFileId());
            } else if (fileType.equals(CertificateTypeIFace.IDCARD_B)) {
                certificatePathDto.setIdCardB(certificates.getPubFileId());
            } else if (fileType.equals(CertificateTypeIFace.PHYSICIA_F)) {
                certificatePathDto.setPhysicilF(certificates.getPubFileId());
            } else if (fileType.equals(CertificateTypeIFace.PHYSICIA_B)) {
                certificatePathDto.setPhysicilB(certificates.getPubFileId());
            } else if (fileType.equals(CertificateTypeIFace.CARD)) {
                certificatePathDto.setCard(certificates.getPubFileId());
            }
        }
    }
    /**
     * 证件详细信息收集
     * @param doctorStatusDto
     * @return
     */
    private CertificatesDetail getCertificatesDetail(DoctorStatusDto doctorStatusDto) {
        CertificatesDetail certificatesDetail = new CertificatesDetail();
        certificatesDetail.setId(WPStringUtil.GETuuid());
        certificatesDetail.setDoctorId(doctorStatusDto.getDoctorId());
        certificatesDetail.setIdcardNum(doctorStatusDto.getIdcardNum());
        certificatesDetail.setLicenseType(doctorStatusDto.getLicenseType());
        certificatesDetail.setLicenseCode(doctorStatusDto.getLicenseCode());
        certificatesDetail.setStatus(INT_1);
        return certificatesDetail;
    }
    /**
     * 获取原始对象参数
     * @param doctorStatusDto
     * @return
     */
    private Doctor getDoctor(DoctorStatusDto doctorStatusDto) {
        Doctor doctor = new Doctor();
        doctor.setId(doctorStatusDto.getDoctorId());
        doctor.setIdentifyRemarks(doctorStatusDto.getIdentifyRemarks());
        doctor.setIdentifyStatus(doctorStatusDto.getIdentifyStatus());
        doctor.setRealName(doctorStatusDto.getDoctorName());
        doctor.setPhone(doctorStatusDto.getPhone());
        return doctor;
    }
}