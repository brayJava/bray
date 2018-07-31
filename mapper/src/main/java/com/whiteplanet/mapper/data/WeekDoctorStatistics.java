package com.whiteplanet.mapper.data;

import com.whiteplanet.mapper.model.DoctorStatistics;

/**
 * Created by ningchengzeng on 2017/8/4.
 */
public class WeekDoctorStatistics extends DoctorStatistics {
    private Integer week = 0;

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }
}
