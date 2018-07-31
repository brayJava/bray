package com.whiteplanet.mapper.model;

import java.util.Date;

public class SysAuthCode {
    private Integer id;

    private Boolean doctor;

    private String token;

    private Date createTime;

    private String accountId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDoctor() {
        return doctor;
    }

    public void setDoctor(Boolean doctor) {
        this.doctor = doctor;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }
}