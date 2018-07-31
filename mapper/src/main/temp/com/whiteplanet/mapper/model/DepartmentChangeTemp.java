package com.whiteplanet.mapper.model;

import java.util.Date;

public class DepartmentChangeTemp {
    private Integer id;

    private String docId;

    private String toDepartmentName;

    private String toDepartmentId;

    private String toFunctionId;

    private String toFunctionName;

    private String toHospitalId;

    private String toHospitalName;

    private Integer delFlag;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId == null ? null : docId.trim();
    }

    public String getToDepartmentName() {
        return toDepartmentName;
    }

    public void setToDepartmentName(String toDepartmentName) {
        this.toDepartmentName = toDepartmentName == null ? null : toDepartmentName.trim();
    }

    public String getToDepartmentId() {
        return toDepartmentId;
    }

    public void setToDepartmentId(String toDepartmentId) {
        this.toDepartmentId = toDepartmentId == null ? null : toDepartmentId.trim();
    }

    public String getToFunctionId() {
        return toFunctionId;
    }

    public void setToFunctionId(String toFunctionId) {
        this.toFunctionId = toFunctionId == null ? null : toFunctionId.trim();
    }

    public String getToFunctionName() {
        return toFunctionName;
    }

    public void setToFunctionName(String toFunctionName) {
        this.toFunctionName = toFunctionName == null ? null : toFunctionName.trim();
    }

    public String getToHospitalId() {
        return toHospitalId;
    }

    public void setToHospitalId(String toHospitalId) {
        this.toHospitalId = toHospitalId == null ? null : toHospitalId.trim();
    }

    public String getToHospitalName() {
        return toHospitalName;
    }

    public void setToHospitalName(String toHospitalName) {
        this.toHospitalName = toHospitalName == null ? null : toHospitalName.trim();
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}