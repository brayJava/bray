package com.whiteplanet.admin.dto;

import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;

/**
 * @author:wuzhiyuan
 * @description: 医生用户提交数据dto
 * @date: Created in 14:28 2017/11/27
 * @modified By:
 */
public class DoctorCerDto implements Serializable {
    /**
     * 起始时间
     */
     private String startTime;
    /**
     * 终止时间
     */
    private String endTime;
    /**
     * 用户id
     */
    private String doctorId;
    /**
     * 用户手机号
     */
    private String phone;
    /**
     * 医院名字
     */
    private String hospitalName;
    /**
     * 医生用户姓名
     */
    private String doctorName;
    /**
     * 审核状态
     */
    private String status;
    /**
     * 页码
     * @return
     */
    public int pageNum=1;
    /**
     * 页数
     * @return
     */
    public int pageSize=10;
    /**
     *  身份证号
     * @return
     */
    private String idcardNum;
    /**
     *  执照类型
     * @return
     */
    private String licenseType;
    /**
     * 执照编码
     * @return
     */
    private String licenseCode;

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

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
