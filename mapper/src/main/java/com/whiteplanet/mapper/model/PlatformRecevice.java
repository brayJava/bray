package com.whiteplanet.mapper.model;

import java.math.BigDecimal;
import java.util.Date;

public class PlatformRecevice {
    private String id;

    private String orderId;

    private BigDecimal money;

    private Date createDate;

    private String patientId;

    private String patientName;

    private String doctorId;

    private String doctorName;

    private String refDoctorId;

    private String refDoctorName;

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
}