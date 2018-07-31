package com.whiteplanet.admin.dto;

import com.whiteplanet.mapper.model.AppVersion;
import com.whiteplanet.mapper.model.AppVersionContent;

import java.util.Date;
import java.util.Objects;

/**
 * @Author:wuzhiyuan
 * @Description:
 * @Date: Created in 20:53 2018/7/16
 * @Modified By:
 */
public class AppVersionBean {

    private String version;

    private String updateUrl;

    private String marketUrl;

    private String updateType;

    private String[] contentAndroid;

    private String[] contentIos;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUpdateUrl() {
        return updateUrl;
    }

    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
    }

    public String getMarketUrl() {
        return marketUrl;
    }

    public void setMarketUrl(String marketUrl) {
        this.marketUrl = marketUrl;
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    public String[] getContentAndroid() {
        return contentAndroid;
    }

    public void setContentAndroid(String[] contentAndroid) {
        this.contentAndroid = contentAndroid;
    }

    public String[] getContentIos() {
        return contentIos;
    }

    public void setContentIos(String[] contentIos) {
        this.contentIos = contentIos;
    }

    public AppVersion getAppVersion(AppVersionBean appVersionBean) {
        if(Objects.isNull(appVersionBean)) return new AppVersion();
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion(appVersionBean.getVersion());
        appVersion.setConstranintUpdate("1".equals(appVersionBean.getUpdateType())? true: false);
        appVersion.setUpdateUrl(appVersionBean.getUpdateUrl());
        appVersion.setMarketUrl(appVersionBean.getMarketUrl());
        appVersion.setCreateTime(new Date());
        appVersion.setUpdateTime(new Date());
        return appVersion;
    }
}
