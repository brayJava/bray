package com.whiteplanet.mapper.model;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private String id;

    private String doctorId;

    private Boolean pay;

    private Boolean vis;

    private Boolean appraise;

    private Boolean timeout;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String needsOrderId;

    private String caseIllnessId;

    private Date payDate;

    private Date visDate;

    private Date timeoutDate;

    private Date finshDate;

    private Date cancelDate;

    private Date appraiseDate;

    private Boolean money;

    private BigDecimal treatmentMoney;
    private Boolean fabulous;

    public Boolean getFabulous() {
        return fabulous;
    }

    public void setFabulous(Boolean fabulous) {
        this.fabulous = fabulous;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public Boolean getPay() {
        return pay;
    }

    public void setPay(Boolean pay) {
        this.pay = pay;
    }

    public Boolean getVis() {
        return vis;
    }

    public void setVis(Boolean vis) {
        this.vis = vis;
    }

    public Boolean getAppraise() {
        return appraise;
    }

    public void setAppraise(Boolean appraise) {
        this.appraise = appraise;
    }

    public Boolean getTimeout() {
        return timeout;
    }

    public void setTimeout(Boolean timeout) {
        this.timeout = timeout;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getNeedsOrderId() {
        return needsOrderId;
    }

    public void setNeedsOrderId(String needsOrderId) {
        this.needsOrderId = needsOrderId == null ? null : needsOrderId.trim();
    }

    public String getCaseIllnessId() {
        return caseIllnessId;
    }

    public void setCaseIllnessId(String caseIllnessId) {
        this.caseIllnessId = caseIllnessId == null ? null : caseIllnessId.trim();
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getVisDate() {
        return visDate;
    }

    public void setVisDate(Date visDate) {
        this.visDate = visDate;
    }

    public Date getTimeoutDate() {
        return timeoutDate;
    }

    public void setTimeoutDate(Date timeoutDate) {
        this.timeoutDate = timeoutDate;
    }

    public Date getFinshDate() {
        return finshDate;
    }

    public void setFinshDate(Date finshDate) {
        this.finshDate = finshDate;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public Date getAppraiseDate() {
        return appraiseDate;
    }

    public void setAppraiseDate(Date appraiseDate) {
        this.appraiseDate = appraiseDate;
    }

    public Boolean getMoney() {
        return money;
    }

    public void setMoney(Boolean money) {
        this.money = money;
    }

    public BigDecimal getTreatmentMoney() {
        return treatmentMoney;
    }

    public void setTreatmentMoney(BigDecimal treatmentMoney) {
        this.treatmentMoney = treatmentMoney;
    }
}