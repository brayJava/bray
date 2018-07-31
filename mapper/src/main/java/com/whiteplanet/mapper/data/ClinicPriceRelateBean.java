package com.whiteplanet.mapper.data;

import java.math.BigDecimal;

/**
 * @author:wuzhiyuan
 * @description: 诊所价格相关统计
 * @date: Created in 11:28 2018/5/14
 * @modified By:
 */
public class ClinicPriceRelateBean {
    /**
     * 统计时间
     */
    private String time;
    /**
     * 设置0元的个数
     */
    private Integer zeroPriceCount;
    /**
     * 平均价格
     */
    private Integer avgMoney;
    /**
     * 最低价格
     */
    private Integer minMoney;
    /**
     * 最高价格
     */
    private Integer maxMoney;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getZeroPriceCount() {
        return zeroPriceCount;
    }

    public void setZeroPriceCount(Integer zeroPriceCount) {
        this.zeroPriceCount = zeroPriceCount;
    }

    public Integer getAvgMoney() {
        return avgMoney;
    }

    public void setAvgMoney(Integer avgMoney) {
        this.avgMoney = avgMoney;
    }

    public Integer getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(Integer minMoney) {
        this.minMoney = minMoney;
    }

    public Integer getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(Integer maxMoney) {
        this.maxMoney = maxMoney;
    }
}