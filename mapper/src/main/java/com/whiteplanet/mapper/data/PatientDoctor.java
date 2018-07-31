package com.whiteplanet.mapper.data;

import com.whiteplanet.mapper.model.Doctor;

import java.util.Date;

public class PatientDoctor extends Doctor {
    private Boolean business;
    private Boolean silent;
    private Date time;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Boolean getBusiness() {
        return business;
    }

    public void setBusiness(Boolean business) {
        if(business == null) this.business = false;
        else this.business = business;
    }

    public Boolean getSilent() {
        return silent;
    }

    public void setSilent(Boolean silent) {
        if(silent == null) this.silent = false;
        else this.silent = silent;
    }
}
