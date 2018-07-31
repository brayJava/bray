package com.whiteplanet.web.entry;

import java.io.Serializable;

public class JsonParam<T> extends PublicJsonParam<T> implements Serializable {

    private String ip;          //IP地址
    private String mobileModel;  //手机型号
    private String mobileScreen; //手机屏幕尺寸
    private String mobileCode;   //手机唯一编号
    private Double locationLong; //经度
    private Double locationLat;  //纬度
    private T data;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMobileModel() {
        return mobileModel;
    }

    public void setMobileModel(String mobileModel) {
        this.mobileModel = mobileModel;
    }

    public String getMobileScreen() {
        return mobileScreen;
    }

    public void setMobileScreen(String mobileScreen) {
        this.mobileScreen = mobileScreen;
    }

    public String getMobileCode() {
        return mobileCode;
    }

    public void setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
    }

    public Double getLocationLong() {
        return locationLong;
    }

    public void setLocationLong(Double locationLong) {
        this.locationLong = locationLong;
    }

    public Double getLocationLat() {
        return locationLat;
    }

    public void setLocationLat(Double locationLat) {
        this.locationLat = locationLat;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }
}
