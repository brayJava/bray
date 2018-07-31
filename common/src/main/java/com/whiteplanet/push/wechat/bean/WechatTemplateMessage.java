package com.whiteplanet.push.wechat.bean;

import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 微信通知拼接模板
 * @date: Created in 10:04 2018/5/10
 * @modified By:
 */
public class WechatTemplateMessage {

    private String touser;

    private String template_id;

    private String url;

    private TemplateKeyword data;

    public String getTouser() {
        return touser;
    }
    public void setTouser(String touser) {
        this.touser = touser;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TemplateKeyword getData() {
        return data;
    }

    public void setData(TemplateKeyword data) {
        this.data = data;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }
}
