package com.whiteplanet.mapper.model;

import java.util.Date;

public class UserLossStatistics {
    private Integer id;

    private Date time;

    private Integer monthLossCount;

    private Integer quarterLossCount;

    private Integer halfyearLossCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getMonthLossCount() {
        return monthLossCount;
    }

    public void setMonthLossCount(Integer monthLossCount) {
        this.monthLossCount = monthLossCount;
    }

    public Integer getQuarterLossCount() {
        return quarterLossCount;
    }

    public void setQuarterLossCount(Integer quarterLossCount) {
        this.quarterLossCount = quarterLossCount;
    }

    public Integer getHalfyearLossCount() {
        return halfyearLossCount;
    }

    public void setHalfyearLossCount(Integer halfyearLossCount) {
        this.halfyearLossCount = halfyearLossCount;
    }
}