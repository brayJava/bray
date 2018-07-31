package com.whiteplanet.mapper.model;

import java.math.BigDecimal;
import java.util.Date;

public class Doctor {
    private String id;

    private String departmentId;

    private String hospitalId;

    private String code;

    private String departmentFunctionId;

    private String phone;

    private String password;

    private String realName;

    private Boolean sex;

    private String kinde;

    private String introduce;

    private Boolean treatment;

    private BigDecimal treatmentMoney;

    private Date createDate;

    private Date updateDate;

    private Integer status;

    private String faceimg;

    private String bgimg;

    private BigDecimal credits;

    private Integer age;

    private String source;

    private String departmentName;

    private String departmentFunctionName;

    private String hospitalName;

    private Integer thumbsUp;

    private String cryptogram;

    private Integer step;

    private Boolean firstLogin;

    private Integer identifyStatus;

    private String identifyRemarks;

    public String getBgimg() {
        return bgimg;
    }

    public void setBgimg(String bgimg) {
        this.bgimg = bgimg;
    }
    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId == null ? null : hospitalId.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDepartmentFunctionId() {
        return departmentFunctionId;
    }

    public void setDepartmentFunctionId(String departmentFunctionId) {
        this.departmentFunctionId = departmentFunctionId == null ? null : departmentFunctionId.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getKinde() {
        return kinde;
    }

    public void setKinde(String kinde) {
        this.kinde = kinde == null ? null : kinde.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Boolean getTreatment() {
        return treatment;
    }

    public void setTreatment(Boolean treatment) {
        this.treatment = treatment;
    }

    public BigDecimal getTreatmentMoney() {
        return treatmentMoney;
    }

    public void setTreatmentMoney(BigDecimal treatmentMoney) {
        this.treatmentMoney = treatmentMoney;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFaceimg() {
        return faceimg;
    }

    public void setFaceimg(String faceimg) {
        this.faceimg = faceimg == null ? null : faceimg.trim();
    }

    public BigDecimal getCredits() {
        return credits;
    }

    public void setCredits(BigDecimal credits) {
        this.credits = credits;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDepartmentFunctionName() {
        return departmentFunctionName;
    }

    public void setDepartmentFunctionName(String departmentFunctionName) {
        this.departmentFunctionName = departmentFunctionName == null ? null : departmentFunctionName.trim();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public Integer getThumbsUp() {
        return thumbsUp;
    }

    public void setThumbsUp(Integer thumbsUp) {
        this.thumbsUp = thumbsUp;
    }

    public String getCryptogram() {
        return cryptogram;
    }

    public void setCryptogram(String cryptogram) {
        this.cryptogram = cryptogram == null ? null : cryptogram.trim();
    }

    public Boolean isFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(boolean firstLogin) {
        this.firstLogin = firstLogin;
    }

    public Integer getIdentifyStatus() {
        return identifyStatus;
    }

    public void setIdentifyStatus(Integer identifyStatus) {
        this.identifyStatus = identifyStatus;
    }

    public String getIdentifyRemarks() {
        return identifyRemarks;
    }

    public void setIdentifyRemarks(String identifyRemarks) {
        this.identifyRemarks = identifyRemarks;
    }
}