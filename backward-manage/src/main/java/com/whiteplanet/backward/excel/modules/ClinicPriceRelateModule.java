package com.whiteplanet.backward.excel.modules;
import com.whiteplanet.backward.excel.annotation.ExcelField;
import com.whiteplanet.mapper.data.ClinicPriceRelateBean;
/**
 * @author:wuzhiyuan
 * @description: 诊所价格相关统计
 * @date: Created in 13:18 2018/5/14
 * @modified By:
 */
public class ClinicPriceRelateModule {
    /**
     * 统计时间
     */
    @ExcelField(title = "日期", order = 1)
    private String time;
    /**
     * 设置0元的个数
     */
    @ExcelField(title = "设置0元人数", order = 2)
    private Integer zeroPriceCount;
    /**
     * 平均价格
     */
    @ExcelField(title = "平均价", order = 3)
    private Integer avgMoney;
    /**
     * 最低价格
     */
    @ExcelField(title = "最低价", order = 4)
    private Integer minMoney;
    /**
     * 最高价格
     */
    @ExcelField(title = "最高价", order = 5)
    private Integer maxMoney;

    public ClinicPriceRelateModule(ClinicPriceRelateBean clinicPriceRelateBean) {
        this.time = clinicPriceRelateBean.getTime();
        this.zeroPriceCount = clinicPriceRelateBean.getZeroPriceCount();
        this.avgMoney = clinicPriceRelateBean.getAvgMoney();
        this.maxMoney = clinicPriceRelateBean.getMaxMoney();
        this.minMoney = clinicPriceRelateBean.getMinMoney();
    }

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