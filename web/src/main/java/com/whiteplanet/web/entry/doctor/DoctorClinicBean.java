package com.whiteplanet.web.entry.doctor;

import com.whiteplanet.mapper.model.Doctor;

import java.io.Serializable;

/**
 * @author:wuzhiyuan
 * @description:  返回医生相关类信息
 * @date: Created in 17:14 2017/12/20
 * @modified By:
 */
public class DoctorClinicBean implements Serializable {

    private static final long serialVersionUID = 6774252525826770741L;
    /**
     * 医生id
     */
    private String id;
    /**
     * 医生姓名
     */
    private String name;
    /**
     * 部门姓名
     */
    private String title;
    /**
     * 医院姓名
     */
    private String hospital;
    /**
     * 医生头像
     */
    private String faceImage;
    /**
     * 科室名称
     */
    private String departmentFunctionName;
    /**
     * 认证状态
     */
    private Integer identifyStatus;
    /**
     *  部门编码
     */
    private String departmentCode;
    /**
     * 认证备注
     */
    private String identifyRemarks;

    public DoctorClinicBean() {
    }
    public DoctorClinicBean(Doctor doctor,String departmentCode) {

        this.name = doctor.getRealName();
        this.title = doctor.getDepartmentName();
        this.hospital = doctor.getHospitalName();
        this.faceImage = doctor.getFaceimg();
        this.departmentFunctionName = doctor.getDepartmentFunctionName();
        this.identifyStatus  = doctor.getIdentifyStatus();
        this.identifyRemarks = doctor.getIdentifyRemarks();
        this.departmentCode = departmentCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    public String getDepartmentFunctionName() {
        return departmentFunctionName;
    }

    public void setDepartmentFunctionName(String departmentFunctionName) {
        this.departmentFunctionName = departmentFunctionName;
    }

    public Integer getIdentifyStatus() {
        return identifyStatus;
    }

    public void setIdentifyStatus(Integer identifyStatus) {
        this.identifyStatus = identifyStatus;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getIdentifyRemarks() {
        return identifyRemarks;
    }

    public void setIdentifyRemarks(String identifyRemarks) {
        this.identifyRemarks = identifyRemarks;
    }
}
