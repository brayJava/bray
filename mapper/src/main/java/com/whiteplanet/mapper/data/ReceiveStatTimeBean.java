package com.whiteplanet.mapper.data;

/**
 * @author:wuzhiyuan
 * @description: 接诊成功率统计
 * @date: Created in 20:05 2018/6/5
 * @modified By:
 */
public class ReceiveStatTimeBean {
    /**
     * 统计时间
     */
    private String totalTime;
    /**
     * 接诊数量
     */
    private int receiveCount;
    /**
     * 接诊成功数量
     */
    private int receiveSuccessCount;
    /**
     * 接诊成功率
     */
    private String successRate;

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public int getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(int receiveCount) {
        this.receiveCount = receiveCount;
    }

    public int getReceiveSuccessCount() {
        return receiveSuccessCount;
    }

    public void setReceiveSuccessCount(int receiveSuccessCount) {
        this.receiveSuccessCount = receiveSuccessCount;
    }

    public String getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(String successRate) {
        this.successRate = successRate;
    }
}
