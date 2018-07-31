package com.whiteplanet.mapper.model;

import java.util.Date;

public class DiagnosisReport {
    private String id;

    private String mRecordDetailId;

    private String filePath;

    private Date createTime;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getmRecordDetailId() {
        return mRecordDetailId;
    }

    public void setmRecordDetailId(String mRecordDetailId) {
        this.mRecordDetailId = mRecordDetailId == null ? null : mRecordDetailId.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}