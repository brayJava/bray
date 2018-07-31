package com.whiteplanet.mapper.model;

/**
 * @author:wuzhiyuan
 * @description: 注册相关统计
 * @date: Created in 11:22 2018/4/9
 * @modified By:
 */
public class RegisterStat {
    /**
     * 注册时间
     */
    private String registerTime;
    /**
     * 注册次数
     */
    private Integer registerCount;

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getRegisterCount() {
        return registerCount;
    }

    public void setRegisterCount(Integer registerCount) {
        this.registerCount = registerCount;
    }
}
