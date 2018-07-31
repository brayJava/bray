package com.whiteplanet.mapper.model;

import java.util.Date;

public class DoctorPatient extends DoctorPatientKey {
    private Boolean silent;

    private Date createDate;

    private Date updateDate;

    public Boolean getSilent() {
        return silent;
    }

    public void setSilent(Boolean silent) {
        this.silent = silent;
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