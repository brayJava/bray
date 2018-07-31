package com.whiteplanet.mapper.data;

/**
 * @author:wuzhiyuan
 * @description: 转诊统计相关
 * @date: Created in 16:10 2018/6/4
 * @modified By:
 */
public class TransStatBean {
    /**
     * 科室名称
     */
    private String departmentName;
    /**
     * 转诊数量
     */
    private int transCount;
    /**
     * 接诊数量
     */
    private int receiveCount;
    /**
     * 成功转诊率
     */
    private String successRate;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getTransCount() {
        return transCount;
    }

    public void setTransCount(int transCount) {
        this.transCount = transCount;
    }

    public int getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(int receiveCount) {
        this.receiveCount = receiveCount;
    }

    public String getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(String successRate) {
        this.successRate = successRate;
    }
}
