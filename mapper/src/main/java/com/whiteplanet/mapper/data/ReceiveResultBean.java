package com.whiteplanet.mapper.data;

/**
 * @author:wuzhiyuan
 * @description: 接诊结果集合
 * @date: Created in 19:50 2018/6/4
 * @modified By:
 */
public class ReceiveResultBean {

    private String departmentName;

    private int receiveCount;

    private int successReceiveCount;

    private String successRate;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(int receiveCount) {
        this.receiveCount = receiveCount;
    }

    public int getSuccessReceiveCount() {
        return successReceiveCount;
    }

    public void setSuccessReceiveCount(int successReceiveCount) {
        this.successReceiveCount = successReceiveCount;
    }

    public String getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(String successRate) {
        this.successRate = successRate;
    }
}
