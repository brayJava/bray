package com.whiteplanet.backward.excel.modules;

import com.whiteplanet.backward.excel.annotation.ExcelField;

/**
 * @author:wuzhiyuan
 * @description: 定价统计相关数据
 * @date: Created in 17:25 2018/5/11
 * @modified By:
 */
public class PriceStatisticsModule {
    // 价格区间（元）
    @ExcelField(title = "价格区间（元）", order = 1)
    private String priceRange;

    // 用户数（人）
    @ExcelField(title = "用户数（人）", order = 2)
    private int userCount;

    // 所占百分比
    @ExcelField(title = "所占百分比", order = 3)
    private String percentage;

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
}
