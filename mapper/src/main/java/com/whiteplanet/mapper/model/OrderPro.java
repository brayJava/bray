package com.whiteplanet.mapper.model;

import java.util.Date;

public class OrderPro extends Order {

    private Date visitingTime;

    public Date getVisitingTime() {
        return visitingTime;
    }

    public void setVisitingTime(Date visitingTime) {
        this.visitingTime = visitingTime;
    }
}
