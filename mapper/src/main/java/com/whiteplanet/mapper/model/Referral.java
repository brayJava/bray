package com.whiteplanet.mapper.model;

import java.util.Date;

public class Referral {
    private String id;

    private Integer source;

    private Integer status;

    private Boolean money;

    private String needsOrderId;

    private Date createTime;

    private Date updateTime;

    private Boolean timeout;

    private Date timeoutTime;

    private String notes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
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

    public String getNeedsOrderId() {
        return needsOrderId;
    }

    public void setNeedsOrderId(String needsOrderId) {
        this.needsOrderId = needsOrderId == null ? null : needsOrderId.trim();
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

    public Boolean getTimeout() {
        return timeout;
    }

    public void setTimeout(Boolean timeout) {
        this.timeout = timeout;
    }

    public Date getTimeoutTime() {
        return timeoutTime;
    }

    public void setTimeoutTime(Date timeoutTime) {
        this.timeoutTime = timeoutTime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}