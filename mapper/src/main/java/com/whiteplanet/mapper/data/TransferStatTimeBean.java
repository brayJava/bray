package com.whiteplanet.mapper.data;

/**
 * @author:wuzhiyuan
 * @description: 按时间统计转发
 * @date: Created in 19:42 2018/6/5
 * @modified By:
 */
public class TransferStatTimeBean {
    /**
     * 时间统计
     */
    private String totalTime;
    /**
     * 转发订单数量
     */
    private int tansCount;
    /**
     * 接诊订单数量
     */
    private int receiveCount;
    /**
     * 成功接诊率
     */
    private String successRate;

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public int getTansCount() {
        return tansCount;
    }

    public void setTansCount(int tansCount) {
        this.tansCount = tansCount;
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
