package com.whiteplanet.mapper.model;

import java.util.Date;

public class DoctorPhone {
    private String id;

    private String doctorId;

    private String phone;

    private String name;

    private String ownerDoctorId;

    private Date createDate;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOwnerDoctorId() {
        return ownerDoctorId;
    }

    public void setOwnerDoctorId(String ownerDoctorId) {
        this.ownerDoctorId = ownerDoctorId == null ? null : ownerDoctorId.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}