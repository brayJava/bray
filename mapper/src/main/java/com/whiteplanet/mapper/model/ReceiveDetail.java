package com.whiteplanet.mapper.model;

import java.util.Date;

public class ReceiveDetail {
    private String id;

    private String transDocId;

    private String receiveDocId;

    private String orderId;

    private Date startDate;

    private Date endDate;

    private Date createDate;

    private Integer outpatientType;

    private Integer dateType;

    private String outpatientName;

    private String hospitalName;

    private String hospitalAddr;

    private String hospitalAddrDetail;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getOutpatientType() {
        return outpatientType;
    }

    public void setOutpatientType(Integer outpatientType) {
        this.outpatientType = outpatientType;
    }

    public String getOutpatientName() {
        return outpatientName;
    }

    public void setOutpatientName(String outpatientName) {
        this.outpatientName = outpatientName == null ? null : outpatientName.trim();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getHospitalAddr() {
        return hospitalAddr;
    }

    public void setHospitalAddr(String hospitalAddr) {
        this.hospitalAddr = hospitalAddr == null ? null : hospitalAddr.trim();
    }

    public String getHospitalAddrDetail() {
        return hospitalAddrDetail;
    }

    public void setHospitalAddrDetail(String hospitalAddrDetail) {
        this.hospitalAddrDetail = hospitalAddrDetail == null ? null : hospitalAddrDetail.trim();
    }

    public Integer getIsFree() {
        return isFree;
    }

    public void setIsFree(Integer isFree) {
        this.isFree = isFree;
    }

    public Integer getDateType() {
        return dateType;
    }

    public void setDateType(Integer dateType) {
        this.dateType = dateType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}