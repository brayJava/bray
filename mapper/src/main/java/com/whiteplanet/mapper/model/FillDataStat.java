package com.whiteplanet.mapper.model;

/**
 * @author:wuzhiyuan
 * @description: 填充资料统计
 * @date: Created in 11:31 2018/4/9
 * @modified By:
 */
public class FillDataStat {
    /**
     * 填充资料时间
     */
    private String FillDataTime;
    /**
     * 填充资料次数
     */
    private Integer FillDataCount;

    public String getFillDataTime() {
        return FillDataTime;
    }

    public void setFillDataTime(String fillDataTime) {
        FillDataTime = fillDataTime;
    }

    public Integer getFillDataCount() {
        return FillDataCount;
    }

    public void setFillDataCount(Integer fillDataCount) {
        FillDataCount = fillDataCount;
    }
}
