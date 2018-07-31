package com.whiteplanet.mapper.data;

/**
 * @author:wuzhiyuan
 * @description:
 * @date: Created in 19:59 2018/5/31
 * @modified By:
 */
public class AppointmentStatBean {

    private String startTime;

    private String endTime;

    private String source;

    private String departmentName;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
