package com.whiteplanet.mapper.model;

import java.util.Date;

public class MRecordDetail {
    private String id;

    private String mRecordId;

    private String illnessDescribe;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getmRecordId() {
        return mRecordId;
    }

    public void setmRecordId(String mRecordId) {
        this.mRecordId = mRecordId == null ? null : mRecordId.trim();
    }

    public String getIllnessDescribe() {
        return illnessDescribe;
    }

    public void setIllnessDescribe(String illnessDescribe) {
        this.illnessDescribe = illnessDescribe == null ? null : illnessDescribe.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}