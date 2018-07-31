package com.whiteplanet.mapper.model;

import java.util.Date;

public class UserDataStatistics {
    private Integer id;

    private Date time;

    private Integer loadUserCount;

    private Integer registerUserCount;

    private Integer fillDataCount;

    private Integer applyRealnameCount;

    private String registerLoadPer;

    private String fillDataUserPer;

    private String realnameSubmitPer;

    private Integer activeDeviceNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getLoadUserCount() {
        return loadUserCount;
    }

    public void setLoadUserCount(Integer loadUserCount) {
        this.loadUserCount = loadUserCount;
    }

    public Integer getRegisterUserCount() {
        return registerUserCount;
    }

    public void setRegisterUserCount(Integer registerUserCount) {
        this.registerUserCount = registerUserCount;
    }

    public Integer getFillDataCount() {
        return fillDataCount;
    }

    public void setFillDataCount(Integer fillDataCount) {
        this.fillDataCount = fillDataCount;
    }

    public Integer getApplyRealnameCount() {
        return applyRealnameCount;
    }

    public void setApplyRealnameCount(Integer applyRealnameCount) {
        this.applyRealnameCount = applyRealnameCount;
    }

    public String getRegisterLoadPer() {
        return registerLoadPer;
    }

    public void setRegisterLoadPer(String registerLoadPer) {
        this.registerLoadPer = registerLoadPer == null ? null : registerLoadPer.trim();
    }

    public String getFillDataUserPer() {
        return fillDataUserPer;
    }

    public void setFillDataUserPer(String fillDataUserPer) {
        this.fillDataUserPer = fillDataUserPer == null ? null : fillDataUserPer.trim();
    }

    public String getRealnameSubmitPer() {
        return realnameSubmitPer;
    }

    public void setRealnameSubmitPer(String realnameSubmitPer) {
        this.realnameSubmitPer = realnameSubmitPer == null ? null : realnameSubmitPer.trim();
    }

    public Integer getActiveDeviceNumber() {
        return activeDeviceNumber;
    }

    public void setActiveDeviceNumber(Integer activeDeviceNumber) {
        this.activeDeviceNumber = activeDeviceNumber;
    }
}