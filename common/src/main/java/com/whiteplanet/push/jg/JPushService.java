package com.whiteplanet.push.jg;

import java.util.Map;

/**
 * @author:wuzhiyuan
 * @description: 极光推送相关服务接口
 * @date: Created in 13:40 2017/12/22
 * @modified By:
 */
public interface JPushService {
    /**
     * 向所有平台设备对绑定的别名用户发送通知消息
     * @param alias  别名设置{userId:用户id标识}
     * @param alert  消息通知
     * @param extras 通知类型设置(类型设置统一放在PushExtrasType接口中，统一传入)
     */
    public void sendPushWithNotificationByAliasToAllPlatform(String alias, String alert,String extras);
    /**
     * 向所有平台设备绑定的别名用户发送message消息
     * @param alias   别名{userId：用户id标识}
     * @param message message消息
     */
    public void sendPushWithMessageByAliasToAllPlatform(String alias, String message);
    /**
     * 向所有平台设备绑定的别名用户发送通知和message消息
     * @param alias 别名{userId：用户id标识}
     * @param alert 消息通知
     * @param message message通知
     * @param extras 通知类型设置(类型设置统一放在PushExtrasType接口中，统一传入)
     */
    public void sendPushWithNotificationAndMsgByAliasToAllPlatform(String alias, String alert, String message,String extras);
    /**
     * 向所有平台设备绑定的别名用户发送通知并添加额外信息
     * @param alias     别名{userId：用户id标识}
     * @param alert     消息通知
     * @param extrasMap 额外信息集合添加
     */
    public void sendPushWithNotificationAndExtrasMessageByAliasToAllPlatform(String alias, String alert, Map<String,String> extrasMap);

    /**
     * 向所有平台设备绑定的别名用户发送通知和额外审核状态备注消息（定制化接口）
     * @param alias 别名{userId：用户id标识}
     * @param alert 消息通知
     * @param extrasType 额外信息添加类型
     * @param extrasMessage 通知类型设置(类型设置统一放在PushExtrasType接口中，统一传入)
     */
    public void sendPushWithNotificationAndMessageByAliasToAllPlatform(String alias, String alert, String extrasType,String extrasMessage);
}
