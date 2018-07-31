package com.whiteplanet.mapper.model;

import java.math.BigDecimal;
import java.util.Date;

public class AppOrder {
    private String id;

    private String orderNo;

    private String mRecordId;

    private String visitPersonId;

    private Date inspectStartDate;

    private Date inspectEndDate;

    private String inspectCheckCity;

    private Long inspectCheckCost;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    private String transDocId;

    private String transDocName;

    private Date transDate;

    private String receiveDocId;

    private String receiveDocName;

    private Date receiveDate;

    private BigDecimal treatmentMoney;

    private Integer payType;

    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getmRecordId() {
        return mRecordId;
    }

    public void setmRecordId(String mRecordId) {
        this.mRecordId = mRecordId == null ? null : mRecordId.trim();
    }

    public String getVisitPersonId() {
        return visitPersonId;
    }

    public void setVisitPersonId(String visitPersonId) {
        this.visitPersonId = visitPersonId == null ? null : visitPersonId.trim();
    }

    public Date getInspectStartDate() {
        return inspectStartDate;
    }

    public void setInspectStartDate(Date inspectStartDate) {
        this.inspectStartDate = inspectStartDate;
    }

    public Date getInspectEndDate() {
        return inspectEndDate;
    }

    public void setInspectEndDate(Date inspectEndDate) {
        this.inspectEndDate = inspectEndDate;
    }

    public String getInspectCheckCity() {
        return inspectCheckCity;
    }

    public void setInspectCheckCity(String inspectCheckCity) {
        this.inspectCheckCity = inspectCheckCity == null ? null : inspectCheckCity.trim();
    }

    public Long getInspectCheckCost() {
        return inspectCheckCost;
    }

    public void setInspectCheckCost(Long inspectCheckCost) {
        this.inspectCheckCost = inspectCheckCost;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTransDocId() {
        return transDocId;
    }

    public void setTransDocId(String transDocId) {
        this.transDocId = transDocId == null ? null : transDocId.trim();
    }

    public String getTransDocName() {
        return transDocName;
    }

    public void setTransDocName(String transDocName) {
        this.transDocName = transDocName == null ? null : transDocName.trim();
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getReceiveDocId() {
        return receiveDocId;
    }

    public void setReceiveDocId(String receiveDocId) {
        this.receiveDocId = receiveDocId == null ? null : receiveDocId.trim();
    }

    public String getReceiveDocName() {
        return receiveDocName;
    }

    public void setReceiveDocName(String receiveDocName) {
        this.receiveDocName = receiveDocName == null ? null : receiveDocName.trim();
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public BigDecimal getTreatmentMoney() {
        return treatmentMoney;
    }

    public void setTreatmentMoney(BigDecimal treatmentMoney) {
        this.treatmentMoney = treatmentMoney;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}