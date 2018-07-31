package com.whiteplanet.mapper.model;

import java.util.Date;

public class DiagnosisStop {
    private String id;

    private String group;

    private String orderId;

    private Integer status;

    private String text;

    private Date createDate;

    private Date updateDate;

    private String patientEmergencyId;

    public String getPatientEmergencyId() {
        return patientEmergencyId;
    }

    public void setPatientEmergencyId(String patientEmergencyId) {
        this.patientEmergencyId = patientEmergencyId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group == null ? null : group.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}