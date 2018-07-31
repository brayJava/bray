package com.whiteplanet.mapper.model;

import java.util.Date;

public class ReferralDoctor {
    private String id;

    private String doctorId;

    private String referralId;

    private Integer status;

    private Boolean money;

    private String grounds;

    private Date createTime;

    private Date updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public String getReferralId() {
        return referralId;
    }

    public void setReferralId(String referralId) {
        this.referralId = referralId == null ? null : referralId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getMoney() {
        return money;
    }

    public void setMoney(Boolean money) {
        this.money = money;
    }

    public String getGrounds() {
        return grounds;
    }

    public void setGrounds(String grounds) {
        this.grounds = grounds;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}