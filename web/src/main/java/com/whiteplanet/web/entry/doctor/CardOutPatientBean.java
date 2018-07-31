package com.whiteplanet.web.entry.doctor;

/**
 * @author:wuzhiyuan
 * @description: 医生主页诊所信息
 * @date: Created in 9:56 2017/12/28
 * @modified By:
 */
public class CardOutPatientBean {
    /**
     * 周日期
     */
    private Integer week;
    /**
     * 阶段时间
     */
    private Integer stage;
    /**
     * 门诊类型
     */
    private String kind;

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
