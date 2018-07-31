package com.whiteplanet.mapper.model;

public class DoctorImage {
    private Integer id;

    private Integer sort;

    private String doctorId;

    private String pubFileId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public String getPubFileId() {
        return pubFileId;
    }

    public void setPubFileId(String pubFileId) {
        this.pubFileId = pubFileId == null ? null : pubFileId.trim();
    }
}