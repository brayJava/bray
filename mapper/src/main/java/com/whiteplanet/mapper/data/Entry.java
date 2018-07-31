package com.whiteplanet.mapper.data;

import java.math.BigDecimal;

/**
 * Created by ningchengzeng on 2017/7/27.
 */
public class Entry {
    private BigDecimal money;
    private Integer count = 0;

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
