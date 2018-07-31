package com.whiteplanet.admin.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author:wuzhiyuan
 * @description: 友盟推送配置类
 * @date: Created in 12:06 2017/12/8
 * @modified By:
 */
public class YMPushConfig {
    /**
     * appkey编码
     */
    @Value("${ym.appkey.val}")
    private String appkey;
    /**
     * masterSecret编码
     */
    @Value("${ym.master.secret.val}")
    private String masterSecret;

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getMasterSecret() {
        return masterSecret;
    }

    public void setMasterSecret(String masterSecret) {
        this.masterSecret = masterSecret;
    }
}
