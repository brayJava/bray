package com.whiteplanet.mapper.data;

import java.util.Date;

/**
 * Created by ningchengzeng on 2017/8/18.
 */
public class OrderVisTime {
    private String orderId;
    private Date time;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
