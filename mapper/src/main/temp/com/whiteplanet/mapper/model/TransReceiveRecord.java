package com.whiteplanet.mapper.model;

import java.util.Date;

public class TransReceiveRecord {
    private String id;

    private String transDocId;

    private String receiveDocId;

    private String orderId;

    private Integer status;

    private String describeReason;

    private Date oprationDate;

    private Integer isFree;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTransDocId() {
        return transDocId;
    }

    public void setTransDocId(String transDocId) {
        this.transDocId = transDocId == null ? null : transDocId.trim();
    }

    public String getReceiveDocId() {
        return receiveDocId;
    }

    public void setReceiveDocId(String receiveDocId) {
        this.receiveDocId = receiveDocId == null ? null : receiveDocId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescribeReason() {
        return describeReason;
    }

    public void setDescribeReason(String describeReason) {
        this.describeReason = describeReason == null ? null : describeReason.trim();
    }

    public Date getOprationDate() {
        return oprationDate;
    }

    public void setOprationDate(Date oprationDate) {
        this.oprationDate = oprationDate;
    }

    public Integer getIsFree() {
        return isFree;
    }

    public void setIsFree(Integer isFree) {
        this.isFree = isFree;
    }
}