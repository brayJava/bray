package com.whiteplanet.push.wechat;

import com.whiteplanet.push.wechat.bean.TemplateParam;

/**
 * @author:wuzhiyuan
 * @description: 微信模板接口
 * @date: Created in 17:56 2018/5/28
 * @modified By:
 */
public interface WechatTemplateMessageServcie {

    /**
     * @param openId   openId值
     * @param id  自定义id
     * @param jumpType  跳转类型
     * @param templateParam  模板参数值
     */
    void sendTemplateMessage(String openId,String id ,String jumpType,TemplateParam templateParam);
}
