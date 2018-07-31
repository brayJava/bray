package com.whiteplanet.mapper.model;

import java.util.Date;

public class PhoneCode {
    private String phonenumber;

    private Date senddatetime;

    private Integer count;

    private Date nextdatetime;

    private Date validdatetime;

    private Integer reg;

    private Boolean doctor;

    private String value;

    private Integer timeCount;

    private Boolean bankCard;

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public Date getSenddatetime() {
        return senddatetime;
    }

    public void setSenddatetime(Date senddatetime) {
        this.senddatetime = senddatetime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getNextdatetime() {
        return nextdatetime;
    }

    public void setNextdatetime(Date nextdatetime) {
        this.nextdatetime = nextdatetime;
    }

    public Date getValiddatetime() {
        return validdatetime;
    }

    public void setValiddatetime(Date validdatetime) {
        this.validdatetime = validdatetime;
    }

    public Boolean getDoctor() {
        return doctor;
    }

    public void setDoctor(Boolean doctor) {
        this.doctor = doctor;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Integer getTimeCount() {
        return timeCount;
    }

    public void setTimeCount(Integer timeCount) {
        this.timeCount = timeCount;
    }

    public Boolean getBankCard() {
        return bankCard;
    }

    public void setBankCard(Boolean bankCard) {
        this.bankCard = bankCard;
    }

    public Integer getReg() {
        return reg;
    }

    public void setReg(Integer reg) {
        this.reg = reg;
    }
}