package com.whiteplanet.web.entry;

import java.io.Serializable;

public class PublicJsonParam<T> implements Serializable {

    private Long time;           //每次访问时间
    private String mobileType;   //android,ios,html,wx
    private T data;              //发送数据

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getMobileType() {
        return mobileType;
    }

    public void setMobileType(String mobileType) {
        this.mobileType = mobileType;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
