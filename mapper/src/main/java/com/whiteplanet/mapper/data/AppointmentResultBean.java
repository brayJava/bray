package com.whiteplanet.mapper.data;

/**
 * @author:wuzhiyuan
 * @description:
 * @date: Created in 20:01 2018/5/31
 * @modified By:
 */
public class AppointmentResultBean {

    private String departmentName;

    private int appointmentCount;

    private int cancelCount;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getAppointmentCount() {
        return appointmentCount;
    }

    public void setAppointmentCount(int appointmentCount) {
        this.appointmentCount = appointmentCount;
    }

    public int getCancelCount() {
        return cancelCount;
    }

    public void setCancelCount(int cancelCount) {
        this.cancelCount = cancelCount;
    }
}
