package com.whiteplanet.mapper.model;

import java.math.BigDecimal;
import java.util.Date;

public class DoctorStatistics {
    private Integer id;

    private String doctorId;

    private Date time;

    private Integer partnerCount =0;

    private Integer partnerTwo  =0;

    private Integer customerCount =0;

    private BigDecimal profit = BigDecimal.valueOf(0);

    private BigDecimal profitRef = BigDecimal.valueOf(0);

    private Integer invitationsDoctor =0;

    private Integer invitationsDoctorRead =0;

    private Integer invitationsDoctorRegister =0;

    private Integer applyClinic =0;

    private Integer applyClinicRead =0;

    private Integer applyClinicOk =0;

    private Integer sendCustomer = 0;

    private Integer sendCustomerRead =0;

    private Integer sendCustomerFollow =0;

    private Integer clinicCount =0;

    private Integer departmentCount =0;

    public void setNull(){
        this.partnerCount =null;
        this.partnerTwo  =null;
        this.customerCount =null;
        this.profit = null;
        this.profitRef = null;
        this.invitationsDoctor =null;
        this.invitationsDoctorRead =null;
        this.invitationsDoctorRegister =null;
        this.applyClinic =null;
        this.applyClinicRead =null;
        this.applyClinicOk =null;
        this.sendCustomer = null;
        this.sendCustomerRead =null;
        this.sendCustomerFollow =null;
        this.clinicCount =null;
        this.departmentCount =null;
    }

    public Integer getDepartmentCount() {
        return departmentCount;
    }

    public void setDepartmentCount(Integer departmentCount) {
        this.departmentCount = departmentCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getPartnerCount() {
        return partnerCount;
    }

    public void setPartnerCount(Integer partnerCount) {
        this.partnerCount = partnerCount;
    }

    public Integer getPartnerTwo() {
        return partnerTwo;
    }

    public void setPartnerTwo(Integer partnerTwo) {
        this.partnerTwo = partnerTwo;
    }

    public Integer getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(Integer customerCount) {
        this.customerCount = customerCount;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public BigDecimal getProfitRef() {
        return profitRef;
    }

    public void setProfitRef(BigDecimal profitRef) {
        this.profitRef = profitRef;
    }

    public Integer getInvitationsDoctor() {
        return invitationsDoctor;
    }

    public void setInvitationsDoctor(Integer invitationsDoctor) {
        this.invitationsDoctor = invitationsDoctor;
    }

    public Integer getInvitationsDoctorRead() {
        return invitationsDoctorRead;
    }

    public void setInvitationsDoctorRead(Integer invitationsDoctorRead) {
        this.invitationsDoctorRead = invitationsDoctorRead;
    }

    public Integer getInvitationsDoctorRegister() {
        return invitationsDoctorRegister;
    }

    public void setInvitationsDoctorRegister(Integer invitationsDoctorRegister) {
        this.invitationsDoctorRegister = invitationsDoctorRegister;
    }

    public Integer getApplyClinic() {
        return applyClinic;
    }

    public void setApplyClinic(Integer applyClinic) {
        this.applyClinic = applyClinic;
    }

    public Integer getApplyClinicRead() {
        return applyClinicRead;
    }

    public void setApplyClinicRead(Integer applyClinicRead) {
        this.applyClinicRead = applyClinicRead;
    }

    public Integer getApplyClinicOk() {
        return applyClinicOk;
    }

    public void setApplyClinicOk(Integer applyClinicOk) {
        this.applyClinicOk = applyClinicOk;
    }

    public Integer getSendCustomer() {
        return sendCustomer;
    }

    public void setSendCustomer(Integer sendCustomer) {
        this.sendCustomer = sendCustomer;
    }

    public Integer getSendCustomerRead() {
        return sendCustomerRead;
    }

    public void setSendCustomerRead(Integer sendCustomerRead) {
        this.sendCustomerRead = sendCustomerRead;
    }

    public Integer getSendCustomerFollow() {
        return sendCustomerFollow;
    }

    public void setSendCustomerFollow(Integer sendCustomerFollow) {
        this.sendCustomerFollow = sendCustomerFollow;
    }

    public Integer getClinicCount() {
        return clinicCount;
    }

    public void setClinicCount(Integer clinicCount) {
        this.clinicCount = clinicCount;
    }
}