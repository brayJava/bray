package com.whiteplanet.mapper.model;

import java.util.Date;

public class CryptogramCode {

    private String id;
    private String doctorId;
    private Date lockFailureTime;
    private Date firstWrongTime;
    private Date lastWrongTime;
    private Integer wrongCount;
    private Integer continuousWrongCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public Date getLockFailureTime() {
        return lockFailureTime;
    }

    public void setLockFailureTime(Date lockFailureTime) {
        this.lockFailureTime = lockFailureTime;
    }

    public Date getFirstWrongTime() {
        return firstWrongTime;
    }

    public void setFirstWrongTime(Date firstWrongTime) {
        this.firstWrongTime = firstWrongTime;
    }

    public Date getLastWrongTime() {
        return lastWrongTime;
    }

    public void setLastWrongTime(Date lastWrongTime) {
        this.lastWrongTime = lastWrongTime;
    }

    public Integer getWrongCount() {
        return wrongCount;
    }

    public void setWrongCount(Integer wrongCount) {
        this.wrongCount = wrongCount;
    }

    public Integer getContinuousWrongCount() {
        return continuousWrongCount;
    }

    public void setContinuousWrongCount(Integer continuousWrongCount) {
        this.continuousWrongCount = continuousWrongCount;
    }
}
