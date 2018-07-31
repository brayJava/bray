package com.whiteplanet.mapper.data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by ningchengzeng on 2017/7/19.
 */
public class PayBean {

    private String doctorId;
    private String doctorName;
    private String refDoctorId;
    private String refDoctorName;
    private String patientId;
    private String patientName;
    private BigDecimal money;
    private Boolean refund;
    private Date time;

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getRefDoctorId() {
        return refDoctorId;
    }

    public void setRefDoctorId(String refDoctorId) {
        this.refDoctorId = refDoctorId;
    }

    public String getRefDoctorName() {
        return refDoctorName;
    }

    public void setRefDoctorName(String refDoctorName) {
        this.refDoctorName = refDoctorName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Boolean getRefund() {
        return refund;
    }

    public void setRefund(Boolean refund) {
        this.refund = refund;
    }
}
