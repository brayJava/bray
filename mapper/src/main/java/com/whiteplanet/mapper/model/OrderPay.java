package com.whiteplanet.mapper.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderPay {
    private String id;

    private String orderId;

    private BigDecimal money;

    private Date createDate;

    private Integer source;

    private String serviceOrderId;

    private String secondOrderId;

    private Integer status;

    private Date updateDate;

    private String doctorId;

    private String doctorName;

    private String refDoctorId;

    private String refDoctorName;

    private String patientId;

    private String patientName;

    private Integer errStatus;

    private Date errDate;

    public Integer getErrStatus() {
        return errStatus;
    }

    public void setErrStatus(Integer errStatus) {
        this.errStatus = errStatus;
    }

    public Date getErrDate() {
        return errDate;
    }

    public void setErrDate(Date errDate) {
        this.errDate = errDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(String serviceOrderId) {
        this.serviceOrderId = serviceOrderId == null ? null : serviceOrderId.trim();
    }

    public String getSecondOrderId() {
        return secondOrderId;
    }

    public void setSecondOrderId(String secondOrderId) {
        this.secondOrderId = secondOrderId == null ? null : secondOrderId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public String getRefDoctorId() {
        return refDoctorId;
    }

    public void setRefDoctorId(String refDoctorId) {
        this.refDoctorId = refDoctorId == null ? null : refDoctorId.trim();
    }

    public String getRefDoctorName() {
        return refDoctorName;
    }

    public void setRefDoctorName(String refDoctorName) {
        this.refDoctorName = refDoctorName == null ? null : refDoctorName.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }
}