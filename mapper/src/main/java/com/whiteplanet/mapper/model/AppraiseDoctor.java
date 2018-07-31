package com.whiteplanet.mapper.model;

import java.util.Date;

public class AppraiseDoctor {
    private Integer id;

    private String doctorId;

    private String doctorIdTarget;

    private String orderId;

    private String comment;

    private Integer major;

    private Integer familiar;

    private Integer ethics;

    private Date createDate;

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
        this.doctorId = doctorId;
    }

    public String getDoctorIdTarget() {
        return doctorIdTarget;
    }

    public void setDoctorIdTarget(String doctorIdTarget) {
        this.doctorIdTarget = doctorIdTarget;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public Integer getFamiliar() {
        return familiar;
    }

    public void setFamiliar(Integer familiar) {
        this.familiar = familiar;
    }

    public Integer getEthics() {
        return ethics;
    }

    public void setEthics(Integer ethics) {
        this.ethics = ethics;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}