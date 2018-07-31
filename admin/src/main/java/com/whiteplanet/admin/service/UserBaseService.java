package com.whiteplanet.admin.service;

import com.whiteplanet.mapper.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author:wuzhiyuan
 * @Description:
 * @Date: Created in 9:35 2018/7/30
 * @Modified By:
 */
@Component
public class UserBaseService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 医生用户映射mapper接口
     */
    @Autowired
    public DoctorMapper doctorMapper;
    /**
     * 证件映射mapper接口
     */
    @Autowired
    public CertificatesMapper certificatesMapper;
    /**
     * 文件路径映射mapper接口
     */
    @Autowired
    public PubFileMapper pubFileMapper;
    /**
     *  医生用户和相对应的证件照映射mapper接口
     */
    @Autowired
    public DoctorCertificatesMapper doctorCertificatesMapper;
    /**
     * 证件照细节mapper接口
     */
    @Autowired
    public CertificatesDetailMapper certificatesDetailMapper;
    /**
     * 医生职级变化
     */
    @Autowired
    public DepartmentChangeTempMapper departmentChangeTempMapper;
    /**
     * 科室信息
     */
    @Autowired
    public DepartmentMapper departmentMapper;
    /**
     * 推送消息历史记录
     */
    @Autowired
    public MessagePushHistoryMapper messagePushHistoryMapper;
    /**
     * 历史消息记录
     */
    @Autowired
    public MessageImHistoryMapper messageImHistoryMapper;
    /**
     * 微信邀请关系
     */
    @Autowired
    public WxApplyRecordMapper wxApplyRecordMapper;
    /**
     * 诊所
     */
    @Autowired
    public ClinicMapper clinicMapper;
    /**
     * 医生诊所
     */
    @Autowired
    public DoctorClinicMapper doctorClinicMapper;
    /**
     * 医生加入诊所记录
     */
    @Autowired
    public DoctorJoinClinicMapper doctorJoinClinicMapper;
    /**
     * 患者访问
     */
    @Autowired
    public VisitPersonMapper visitPersonMapper;
    /**
     * 医生患者关系
     */
    @Autowired
    public DoctorPatientMapper doctorPatientMapper;
}
