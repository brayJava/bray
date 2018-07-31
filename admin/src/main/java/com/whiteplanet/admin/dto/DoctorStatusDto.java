package com.whiteplanet.admin.dto;

import java.io.Serializable;

/**
 * @author:wuzhiyuan
 * @description: 医生审核状态信息
 * @date: Created in 17:06 2017/11/27
 * @modified By:
 */
public class DoctorStatusDto implements Serializable {

    private static final long serialVersionUID = -8576352310424781229L;
    /**
     * 医生用户id
     */
    private String doctorId;
    /**
     * 医生用户姓名
     */
    private String doctorName;
    /**
     * 医生用户电话
     */
    private String phone;
    /**
     * 医生修改状态
     */
    private int identifyStatus;
    /**
     * 医生不通过修改原因
     */
    private String identifyRemarks;
    /**
     * 身份证号
     * @return
     */
    private String idcardNum;
    /**
     * 执照类型
     * @return
     */
    private String licenseType;
    /**
     * 执照编码
     * @return
     */
    private String licenseCode;

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdcardNum() {
        return idcardNum;
    }

    public void setIdcardNum(String idcardNum) {
        this.idcardNum = idcardNum;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getLicenseCode() {
        return licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public int getIdentifyStatus() {
        return identifyStatus;
    }

    public void setIdentifyStatus(int identifyStatus) {
        this.identifyStatus = identifyStatus;
    }

    public String getIdentifyRemarks() {
        return identifyRemarks;
    }

    public void setIdentifyRemarks(String identifyRemarks) {
        this.identifyRemarks = identifyRemarks;
    }
}
