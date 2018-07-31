package com.whiteplanet.push.jg.impl;

import cn.jiguang.common.ClientConfig;
import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import com.whiteplanet.config.PushExtrasType;
import com.whiteplanet.push.jg.JPushClient;
import com.whiteplanet.push.jg.JPushService;
import com.whiteplanet.push.jg.push.PushResult;
import com.whiteplanet.push.jg.push.model.Message;
import com.whiteplanet.push.jg.push.model.Options;
import com.whiteplanet.push.jg.push.model.Platform;
import com.whiteplanet.push.jg.push.model.PushPayload;
import com.whiteplanet.push.jg.push.model.audience.Audience;
import com.whiteplanet.push.jg.push.model.notification.AndroidNotification;
import com.whiteplanet.push.jg.push.model.notification.IosNotification;
import com.whiteplanet.push.jg.push.model.notification.Notification;
import com.whiteplanet.config.JPushConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author:wuzhiyuan
 * @description: 极光推送相关服务接口实现
 * @date: Created in 13:41 2017/12/22
 * @modified By:
 */
@Service
public class JpushServiceImpl implements JPushService {

    protected  final Logger logger = LoggerFactory.getLogger(JpushServiceImpl.class);
    /**
     * 初始化极光推送默认参数对象
     */
    private ClientConfig clientConfig = ClientConfig.getInstance();
    /**
     * push发送通知给所有平台
     * @param alias  别名设置{userId:用户id标识}
     * @param alert  消息通知
     */
    @Override
    public void sendPushWithNotificationByAliasToAllPlatform(String alias, String alert,String extras) {
        JPushClient jpushClient = new JPushClient(JPushConfig.MASTER_SECRET,JPushConfig.APP_KEY, null, clientConfig);
        PushPayload pushPayload = this.buildPushObject_android_ios_alias_alert(alias, alert,extras);
        sendPushResultLogger(jpushClient, pushPayload,alert);
    }
    /**
     * push发送通知给所有平台添加信息额外说明
     * @param alias  别名设置{userId:用户id标识}
     * @param alert  消息通知
     * @param extrasType 额外信息添加类型
     * @param extrasMessage 额外信息添加
     */
    @Override
    public void sendPushWithNotificationAndMessageByAliasToAllPlatform(String alias, String alert,String extrasType,String extrasMessage) {
        JPushClient jpushClient = new JPushClient(JPushConfig.MASTER_SECRET,JPushConfig.APP_KEY, null, clientConfig);
        PushPayload pushPayload = this.buildPushObject_android_ios_alias_alert_extrasMessage(alias, alert,extrasType,extrasMessage);
        sendPushResultLogger(jpushClient, pushPayload,alert);
    }
    /**
     * push发送通知给所有平台添加信息额外说明(传json参数)
     * @param alias  别名设置{userId:用户id标识}
     * @param alert  消息通知
     * @param extrasMap 额外信息集合添加
     */
    @Override
    public void sendPushWithNotificationAndExtrasMessageByAliasToAllPlatform(String alias, String alert, Map<String, String> extrasMap) {
        JPushClient jpushClient = new JPushClient(JPushConfig.MASTER_SECRET,JPushConfig.APP_KEY, null, clientConfig);
        PushPayload pushPayload = this.buildPushObject_android_ios_alias_alert_extrasMap(alias, alert,extrasMap);
        sendPushResultLogger(jpushClient, pushPayload,alert);
    }
    /**
     * push发送message给所有平台
     * @param alias   别名{userId：用户id标识}
     * @param message message消息
     */
    @Override
    public void sendPushWithMessageByAliasToAllPlatform(String alias, String message) {
        JPushClient jpushClient = new JPushClient(JPushConfig.MASTER_SECRET,JPushConfig.APP_KEY, null, clientConfig);
        PushPayload pushPayload = this.buildPushObject_all_alias_message(alias,message);
        sendPushResultLogger(jpushClient, pushPayload,message);
    }
    /**
     * push发送通知和message给所有平台
     * @param alias 别名{userId：用户id标识}
     * @param alert 消息通知
     * @param message message通知
     */
    @Override
    public void sendPushWithNotificationAndMsgByAliasToAllPlatform(String alias, String alert, String message,String extras) {
        JPushClient jpushClient = new JPushClient(JPushConfig.MASTER_SECRET,JPushConfig.APP_KEY, null, clientConfig);
        PushPayload pushPayload = this.buildPushObject_all_alias_alert_message(alias,alert,message,extras);
        sendPushResultLogger(jpushClient, pushPayload,alert);
    }
    /**
     * 通知消息，附带额外参数，发送至android和ios设备
     * @param alias  别名
     * @param alert  通知内容
     * @param extras 额外参数
     * @return
     */
    public PushPayload buildPushObject_android_ios_alias_alert(String alias,String alert,String extras){
        return PushPayload.newBuilder()
                .setPlatform(Platform.android_ios())                               //设置平台
                .setAudience(Audience.alias(alias))                                //推送目标
                .setNotification(Notification.newBuilder()                         //通知内容
                        .addPlatformNotification(AndroidNotification.newBuilder()  //android通知内容
                                .addExtra(PushExtrasType.EXTRAS_TYPE, extras)      //android额外参数
                                .setAlert(alert)
                                .build())
                        .addPlatformNotification(IosNotification.newBuilder()      //ios通知内容
                                .addExtra(PushExtrasType.EXTRAS_TYPE, extras)      //ios额外参数
                                .setAlert(alert)
                                .build())
                        .build())
                .setOptions(Options.newBuilder()  //设置参数
                        .setApnsProduction(false) //true-推送生产环境 false-推送开发环境（测试使用参数）
//                        .setTimeToLive(90)        //消息在JPush服务器的失效时间（测试使用参数）
                        .build())
                .build();
    }
    /**
     * 通知消息，附带额外参数，发送至android和ios设备
     * @param alias  别名
     * @param alert  通知内容
     * @param extrasType 状态更新
     * @param message 更新状态说明
     * @return
     */
    public PushPayload buildPushObject_android_ios_alias_alert_extrasMessage(String alias,String alert,String extrasType,String message){
        return PushPayload.newBuilder()
                .setPlatform(Platform.android_ios())                               //设置平台
                .setAudience(Audience.alias(alias))                             //推送目标
                .setNotification(Notification.newBuilder()                         //通知内容
                        .addPlatformNotification(AndroidNotification.newBuilder()  //android通知内容
                                .addExtra(PushExtrasType.EXTRAS_TYPE, extrasType)  //android额外参数
                                .addExtra(PushExtrasType.IDENTIFY_REMARKS,message) //审核不同通过原因
                                .setAlert(alert)
                                .build())
                        .addPlatformNotification(IosNotification.newBuilder()      //ios通知内容
                                .addExtra(PushExtrasType.EXTRAS_TYPE, extrasType)  //ios额外参数
                                .addExtra(PushExtrasType.IDENTIFY_REMARKS,message) //审核不同通过原因
                                .setAlert(alert)
                                .build())
                        .build())
                .setOptions(Options.newBuilder()  //设置参数
                        .setApnsProduction(true) //true-推送生产环境 false-推送开发环境（测试使用参数）
                        .build())
                .build();
    }
    /**
     * 构建所有平台发送通知并附带额外消息的PushPayload对象
     * @param alias
     * @param alert
     * @param extrasMap
     * @return
     */
    private PushPayload buildPushObject_android_ios_alias_alert_extrasMap(String alias, String alert, Map<String, String> extrasMap) {
        return PushPayload.newBuilder()
                .setPlatform(Platform.android_ios())                               //设置平台
                .setAudience(Audience.alias(alias))                                //推送目标
                .setNotification(Notification.newBuilder()                         //通知内容
                        .addPlatformNotification(AndroidNotification.newBuilder()  //android通知内容
                                .addExtras(extrasMap)
                                .setAlert(alert)
                                .build())
                        .addPlatformNotification(IosNotification.newBuilder()      //ios通知内容
                                .addExtras(extrasMap)
                                .setAlert(alert)
                                .build())
                        .build())
                .setOptions(Options.newBuilder()  //设置参数
                        .setApnsProduction(true) //true-推送生产环境 false-推送开发环境（测试使用参数）
                        .build())
                .build();
    }
    /**
     * 构建所有平台发送message的PushPayload对象
     * @param alias
     * @param message
     * @return
     */
    private PushPayload buildPushObject_all_alias_message(String alias, String message) {

        return PushPayload.newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.alias(alias))
                .setMessage(Message.content(message))
                .build();
    }
    /**
     * 构建所有平台发送通知和message的PushPayload对象
     * @param alias
     * @param message
     * @param extras
     * @return
     */
    private PushPayload buildPushObject_all_alias_alert_message(String alias, String alert,String message,String extras) {

        return PushPayload.newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.alias(alias))
                .setNotification(Notification.newBuilder()                         //通知内容
                        .addPlatformNotification(AndroidNotification.newBuilder()  //android通知内容
                                .addExtra(PushExtrasType.EXTRAS_TYPE, extras)      //android额外参数
                                .setAlert(alert)
                                .build())
                        .addPlatformNotification(IosNotification.newBuilder()      //ios通知内容
                                .addExtra(PushExtrasType.EXTRAS_TYPE, extras)      //ios额外参数
                                .setAlert(alert)
                                .build())
                        .build())
                .setMessage(Message.content(message))
                .build();
    }
    /**
     * 推送push并输出返回结果日志信息
     * @param jpushClient
     * @param pushPayload
     */
    private void sendPushResultLogger(JPushClient jpushClient, PushPayload pushPayload,String message) {
        try {
            //推送push接口（此接口采用的是NativeHttpClient方式推送）
            logger.info(">>>>>>>>>>>>>>>>>>>开始推送消息: " + message);
            PushResult result = jpushClient.sendPush(pushPayload);
            logger.info(">>>>>>>>>>>>>>>>>>>消息推送成功");
            int status = result.getResponseCode();
        } catch (APIConnectionException e) {
            logger.error(">>>>>>>>>>>>>>>>>>Connection error. Should retry later. ", e);
            logger.error(">>>>>>>>>>>>>>>>>>Sendno: " + pushPayload.getSendno());

        } catch (APIRequestException e) {
            logger.error(">>>>>>>>>>>>>>>>>>Error response from JPush server. Should review and fix it. ", e);
            logger.info(">>>>>>>>>>>>>>>>>>>HTTP Status: " + e.getStatus());
            logger.info(">>>>>>>>>>>>>>>>>>>Error Code: " + e.getErrorCode());
            logger.info(">>>>>>>>>>>>>>>>>>>Error Message: " + e.getErrorMessage());
            logger.info(">>>>>>>>>>>>>>>>>>>Msg ID: " + e.getMsgId());
            logger.error(">>>>>>>>>>>>>>>>>>Sendno: " + pushPayload.getSendno());
        }
    }
}
