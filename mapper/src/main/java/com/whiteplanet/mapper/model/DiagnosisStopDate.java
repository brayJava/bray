package com.whiteplanet.mapper.model;

import java.util.Date;

public class DiagnosisStopDate {
    private String id;

    private String group;

    private Date dateTime;

    private Integer status;

    private Boolean stop;

    private Date createDate;

    private Date updateDate;

    private String doctorCalendarId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group == null ? null : group.trim();
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getStop() {
        return stop;
    }

    public void setStop(Boolean stop) {
        this.stop = stop;
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

    public String getDoctorCalendarId() {
        return doctorCalendarId;
    }

    public void setDoctorCalendarId(String doctorCalendarId) {
        this.doctorCalendarId = doctorCalendarId;
    }
}