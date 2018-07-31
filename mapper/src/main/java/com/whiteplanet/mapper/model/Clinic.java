package com.whiteplanet.mapper.model;

import java.math.BigDecimal;
import java.util.Date;

public class Clinic {
    private String id;

    private String name;

    private String note;

    private Integer doctorCount;

    private Boolean business;

    private Date businessDate;

    private Integer businessDay;

    private Date createDate;

    private Date updateDate;

    private String doctorId;

    private BigDecimal amount;

    private BigDecimal receiveMoney;

    private BigDecimal money;

    private BigDecimal refMoney;

    private BigDecimal serviceMoney;

    private Integer serviceWait;

    private Integer doctorRefCount;

    private Integer doctorReciveCount;

    private Integer doctorDepartmentCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getDoctorCount() {
        return doctorCount;
    }

    public void setDoctorCount(Integer doctorCount) {
        if(doctorCount == null) doctorCount = 0;
        this.doctorCount = doctorCount;
    }

    public Boolean getBusiness() {
        return business;
    }

    public void setBusiness(Boolean business) {
        this.business = business;
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public Integer getBusinessDay() {
        return businessDay;
    }

    public void setBusinessDay(Integer businessDay) {
        this.businessDay = businessDay;
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

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getReceiveMoney() {
        return receiveMoney;
    }

    public void setReceiveMoney(BigDecimal receiveMoney) {
        this.receiveMoney = receiveMoney;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getRefMoney() {
        return refMoney;
    }

    public void setRefMoney(BigDecimal refMoney) {
        this.refMoney = refMoney;
    }

    public BigDecimal getServiceMoney() {
        return serviceMoney;
    }

    public void setServiceMoney(BigDecimal serviceMoney) {
        this.serviceMoney = serviceMoney;
    }

    public Integer getServiceWait() {
        return serviceWait;
    }

    public void setServiceWait(Integer serviceWait) {
        this.serviceWait = serviceWait;
    }

    public Integer getDoctorRefCount() {
        return doctorRefCount;
    }

    public void setDoctorRefCount(Integer doctorRefCount) {
        this.doctorRefCount = doctorRefCount;
    }

    public Integer getDoctorReciveCount() {
        return doctorReciveCount;
    }

    public void setDoctorReciveCount(Integer doctorReciveCount) {
        this.doctorReciveCount = doctorReciveCount;
    }

    public Integer getDoctorDepartmentCount() {
        return doctorDepartmentCount;
    }

    public void setDoctorDepartmentCount(Integer doctorDepartmentCount) {
        this.doctorDepartmentCount = doctorDepartmentCount;
    }
}