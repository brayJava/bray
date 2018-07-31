package com.whiteplanet.sms;

/**
 * @Author: HeWei
 * @Description:
 * @Date: Created in 15:34 2017
 * @Modified By:
 */
public class SMSResult {
    private String taskId;  //提交短信的任务批次
    private String overage; //当前账户的余额
    private String desc;    //发送结果状态操作说明
    private Integer mobileCount; //成功的号码数量
    private Integer status; // 数字类型，0表示成功，其它为失败，错误信息通过desc描述

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getOverage() {
        return overage;
    }

    public void setOverage(String overage) {
        this.overage = overage;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getMobileCount() {
        return mobileCount;
    }

    public void setMobileCount(Integer mobileCount) {
        this.mobileCount = mobileCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
