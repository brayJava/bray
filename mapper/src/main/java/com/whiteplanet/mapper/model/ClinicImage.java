package com.whiteplanet.mapper.model;

public class ClinicImage {
    private Integer id;

    private Integer sort;

    private String pubFileId;

    private String clinicId;

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

    public String getPubFileId() {
        return pubFileId;
    }

    public void setPubFileId(String pubFileId) {
        this.pubFileId = pubFileId == null ? null : pubFileId.trim();
    }

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId == null ? null : clinicId.trim();
    }
}