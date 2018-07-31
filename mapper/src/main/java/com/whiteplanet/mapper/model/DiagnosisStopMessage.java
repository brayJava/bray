package com.whiteplanet.mapper.model;

import java.util.Date;

public class DiagnosisStopMessage {
    private String id;

    private Boolean notTime;

    private Date createDate;

    private String diagnosisStopId;

    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Boolean getNotTime() {
        return notTime;
    }

    public void setNotTime(Boolean notTime) {
        this.notTime = notTime;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDiagnosisStopId() {
        return diagnosisStopId;
    }

    public void setDiagnosisStopId(String diagnosisStopId) {
        this.diagnosisStopId = diagnosisStopId == null ? null : diagnosisStopId.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}