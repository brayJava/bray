package com.whiteplanet.mapper.model;

import java.math.BigDecimal;
import java.util.Date;

public class ClinicDealRecord {
    private Integer id;

    private String clinicId;

    private BigDecimal money;

    private String orderId;

    private String withDrawId;

    private Integer dealType;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId == null ? null : clinicId.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getDealType() {
        return dealType;
    }

    public void setDealType(Integer dealType) {
        this.dealType = dealType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getWithDrawId() {
        return withDrawId;
    }

    public void setWithDrawId(String withDrawId) {
        this.withDrawId = withDrawId;
    }
}