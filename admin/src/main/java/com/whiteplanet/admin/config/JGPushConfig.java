package com.whiteplanet.admin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author:wuzhiyuan
 * @description: 极光推送配置类
 * @date: Created in 18:12 2017/12/7
 * @modified By:
 */
@Component
public class JGPushConfig {
    /**
     * appkey编码
     */
    @Value("${jg.appkey.val}")
    private String appkey;
    /**
     * masterSecret编码
     */
    @Value("${jg.master.secret.val}")
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