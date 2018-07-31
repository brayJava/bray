package com.whiteplanet.back.model;

import java.util.Date;

public class UserActivityStatistics {
    private Integer id;

    private Date time;

    private Integer dailyActivity;

    private Integer weekActivity;

    private Integer monthActivity;

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

    public Integer getDailyActivity() {
        return dailyActivity;
    }

    public void setDailyActivity(Integer dailyActivity) {
        this.dailyActivity = dailyActivity;
    }

    public Integer getWeekActivity() {
        return weekActivity;
    }

    public void setWeekActivity(Integer weekActivity) {
        this.weekActivity = weekActivity;
    }

    public Integer getMonthActivity() {
        return monthActivity;
    }

    public void setMonthActivity(Integer monthActivity) {
        this.monthActivity = monthActivity;
    }
}