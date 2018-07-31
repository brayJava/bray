package com.whiteplanet.mapper.data;

/**
 * @author:wuzhiyuan
 * @description: 价格相关统计
 * @date: Created in 16:56 2018/4/20
 * @modified By:
 */
public class ClinicPriceRangeBean {

    private int lowTreatmentMoney;

    private int highTreatmentMoney;

    private String startTime;

    private String endTime;

    private String source;

    private String departmentName;

    private String departmentFunction;

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

    public String getDepartmentFunction() {
        return departmentFunction;
    }

    public void setDepartmentFunction(String departmentFunction) {
        this.departmentFunction = departmentFunction;
    }

    public int getLowTreatmentMoney() {
        return lowTreatmentMoney;
    }

    public void setLowTreatmentMoney(int lowTreatmentMoney) {
        this.lowTreatmentMoney = lowTreatmentMoney;
    }

    public int getHighTreatmentMoney() {
        return highTreatmentMoney;
    }

    public void setHighTreatmentMoney(int highTreatmentMoney) {
        this.highTreatmentMoney = highTreatmentMoney;
    }

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
}
