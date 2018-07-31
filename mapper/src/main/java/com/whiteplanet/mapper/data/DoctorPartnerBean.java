package com.whiteplanet.mapper.data;

/**
 * Created by ningchengzeng on 2017/7/19.
 */
public class DoctorPartnerBean{
    private String id;
    private String name;
    private String department;
    private String hospital;
    private Boolean hide;
    private String faceimage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public Boolean getHide() {
        return hide;
    }

    public void setHide(Boolean hide) {
        this.hide = hide;
    }

    public String getFaceimage() {
        return faceimage;
    }

    public void setFaceimage(String faceimage) {
        this.faceimage = faceimage;
    }
}
