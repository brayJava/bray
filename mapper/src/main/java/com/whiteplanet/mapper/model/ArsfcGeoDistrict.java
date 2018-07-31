package com.whiteplanet.mapper.model;

public class ArsfcGeoDistrict {
    private Integer id;

    private String adcode;

    private String name;

    private Double lat;

    private Double lng;

    private String parentadcode;

    private String citycode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode == null ? null : adcode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getParentadcode() {
        return parentadcode;
    }

    public void setParentadcode(String parentadcode) {
        this.parentadcode = parentadcode == null ? null : parentadcode.trim();
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }
}