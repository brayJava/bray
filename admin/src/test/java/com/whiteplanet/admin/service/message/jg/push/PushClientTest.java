package com.whiteplanet.admin.service.message.jg.push;

import cn.jiguang.common.ClientConfig;
import cn.jiguang.common.ServiceHelper;
import cn.jiguang.common.connection.HttpProxy;
import cn.jiguang.common.connection.NettyHttpClient;
import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jiguang.common.resp.ResponseWrapper;
import com.whiteplanet.admin.service.message.jg.BaseTest;
import com.whiteplanet.config.PushExtrasType;
import com.whiteplanet.push.jg.JPushClient;
import com.whiteplanet.push.jg.push.CIDResult;
import com.whiteplanet.push.jg.push.PushClient;
import com.whiteplanet.push.jg.push.PushResult;
import com.whiteplanet.push.jg.push.model.Options;
import com.whiteplanet.push.jg.push.model.Platform;
import com.whiteplanet.push.jg.push.model.PushPayload;
import com.whiteplanet.push.jg.push.model.audience.Audience;
import com.whiteplanet.push.jg.push.model.notification.AndroidNotification;
import com.whiteplanet.push.jg.push.model.notification.IosNotification;
import com.whiteplanet.push.jg.push.model.notification.Notification;
import com.whiteplanet.sms.Final;
import io.netty.handler.codec.http.HttpMethod;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.URISyntaxException;

import static com.whiteplanet.push.jg.push.model.Platform.android_ios;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class PushClientTest extends BaseTest {

    protected static final Logger LOG = LoggerFactory.getLogger(PushClientTest.class);

    public final static String USER_ID = "bae0ce2030dc46daaa9905cc270511c4";
    /**
     *  通过别名，发送给特定用户的设备，包括ios和android
     */
    @Test
    public void testSendPushSuccess() {
        ClientConfig clientConfig = ClientConfig.getInstance();
        JPushClient jpushClient = new JPushClient(MASTER_SECRET, APP_KEY, null, clientConfig);
        PushPayload payload = buildPushObject_android_ios_alias_alert(USER_ID
                , Final.PUSH_AUDIT_SUCCESS_ALERT,PushExtrasType.CERTIFICATES_AUDIT_SUCCESS);
        sendPushWithResultMessage(jpushClient, payload);
    }
    @Test
    public void testSendPushFail() {
        ClientConfig clientConfig = ClientConfig.getInstance();
        JPushClient jpushClient = new JPushClient(MASTER_SECRET, APP_KEY, null, clientConfig);
        PushPayload payload = buildPushObject_android_ios_alias_alert(USER_ID
                , Final.PUSH_AUDIT_FAIL_ALERT,PushExtrasType.CERTIFICATES_AUDIT_FAIL);
        sendPushWithResultMessage(jpushClient, payload);
    }
    @Test
    public void testSendMessagePushSuccess() {
        ClientConfig clientConfig = ClientConfig.getInstance();
        JPushClient jpushClient = new JPushClient(MASTER_SECRET, APP_KEY, null, clientConfig);
        PushPayload payload = buildPushObject_android_ios_alias_alert_message(USER_ID
                , Final.PUSH_AUDIT_SUCCESS_ALERT,PushExtrasType.CERTIFICATES_AUDIT_SUCCESS, Final.PUSH_AUDIT_SUCCESS_ALERT);
        sendPushWithResultMessage(jpushClient, payload);
    }
    @Test
    public void testSendMessagePushFail() {
        ClientConfig clientConfig = ClientConfig.getInstance();
        JPushClient jpushClient = new JPushClient(MASTER_SECRET, APP_KEY, null, clientConfig);
        PushPayload payload = buildPushObject_android_ios_alias_alert_message(USER_ID
                , Final.PUSH_AUDIT_FAIL_ALERT,PushExtrasType.CERTIFICATES_AUDIT_FAIL, Final.PUSH_AUDIT_FAIL_ALERT);
        sendPushWithResultMessage(jpushClient, payload);
    }
    /**
     *
     */
    @Test
    public void testSendPushWithCallback() {
        ClientConfig clientConfig = ClientConfig.getInstance();
        String host = (String) clientConfig.get(ClientConfig.PUSH_HOST_NAME);
        final NettyHttpClient client = new NettyHttpClient(ServiceHelper.getBasicAuthorization(APP_KEY, MASTER_SECRET),
                null, clientConfig);
        try {
            URI uri = new URI(host + clientConfig.get(ClientConfig.PUSH_PATH));
            PushPayload payload = buildPushObject_all_alias_alert();
            client.sendRequest(HttpMethod.POST, payload.toString(), uri, new NettyHttpClient.BaseCallback() {
                @Override
                public void onSucceed(ResponseWrapper responseWrapper) {
                    LOG.info("Got result: " + responseWrapper.responseContent);
                }
            });
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }


    public static PushPayload buildPushObject_all_alias_alert() {

        return PushPayload.newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.alias("53d9332ef51444d2be3c0ae41d2f46c6"))
                .setNotification(Notification.alert(ALERT))
//                .setMessage(Message.content(StringEscapeUtils.escapeJava(MSG_CONTENT_JSON_IM)))
                .build();
    }
    public PushPayload buildPushObject_android_ios_alias_alert(String alias, String alert, String extras){
        return  PushPayload.newBuilder()
                .setPlatform(android_ios())                               //设置平台
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
    public PushPayload buildPushObject_android_ios_alias_alert_message(String alias, String alert, String extras,String message){
        return  PushPayload.newBuilder()
                .setPlatform(android_ios())                               //设置平台
                .setAudience(Audience.alias(alias))                                //推送目标
                .setNotification(Notification.newBuilder()                         //通知内容
                        .addPlatformNotification(AndroidNotification.newBuilder()  //android通知内容
                                .addExtra(PushExtrasType.EXTRAS_TYPE, extras)     //android额外参数
                                .addExtra("identifyRemarks",message)
                                .setAlert(alert)
                                .build())
                        .addPlatformNotification(IosNotification.newBuilder()      //ios通知内容
                                .addExtra(PushExtrasType.EXTRAS_TYPE, extras)      //ios额外参数
                                .addExtra("identifyRemarks",message)
                                .setAlert(alert)
                                .build())
                        .build())
                .setOptions(Options.newBuilder()  //设置参数
                        .setApnsProduction(true) //true-推送生产环境 false-推送开发环境（测试使用参数）
                        .build())
                .build();
    }
    @Test(expected = IllegalArgumentException.class)
    public void test_invalid_json() {
        PushClient pushClient = new PushClient(MASTER_SECRET, APP_KEY);

        try {
            pushClient.sendPush("{aaa:'a}");
        } catch (APIConnectionException e) {
            e.printStackTrace();
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_empty_string() {
        PushClient pushClient = new PushClient(MASTER_SECRET, APP_KEY);

        try {
            pushClient.sendPush("");
        } catch (APIConnectionException e) {
            e.printStackTrace();
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_empty_password() {
        new HttpProxy("127.0.0.1", 8080, "", null);
    }

    @Test
    public void test_validate() {
        PushClient pushClient = new PushClient(MASTER_SECRET, APP_KEY);

        try {
            PushResult result = pushClient.sendPushValidate(PushPayload.alertAll("alert"));
            assertTrue("", result.isResultOK());
        } catch (APIRequestException e) {
            fail("Should not fail");
        } catch (APIConnectionException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCidList() {
        JPushClient jPushClient = new JPushClient(MASTER_SECRET, APP_KEY);
        try {
            CIDResult result = jPushClient.getCidList(3, "push");
            LOG.info("Got result - " + result);
        } catch (APIConnectionException e) {
            LOG.error("Connection error. Should retry later. ", e);
        } catch (APIRequestException e) {
            LOG.error("Error response from JPush server. Should review and fix it. ", e);
            LOG.info("HTTP Status: " + e.getStatus());
            LOG.info("Error Code: " + e.getErrorCode());
            LOG.info("Error Message: " + e.getErrorMessage());
        }
    }
    /*
     * 通过别名，发送给特定用户的设备，包括ios和android
     */
    @Test
    public void testSendPushWithCid() {
        JPushClient jPushClient = new JPushClient(MASTER_SECRET, APP_KEY);
        PushPayload pushPayload = buildPushObject_android_cid();
        try {
            PushResult result = jPushClient.sendPush(pushPayload);
            LOG.info("Got result - " + result);
        } catch (APIConnectionException e) {
            LOG.error("Connection error. Should retry later. ", e);
        } catch (APIRequestException e) {
            LOG.error("Error response from JPush server. Should review and fix it. ", e);
            LOG.info("HTTP Status: " + e.getStatus());
            LOG.info("Error Code: " + e.getErrorCode());
            LOG.info("Error Message: " + e.getErrorMessage());
        }
    }

    public static PushPayload buildPushObject_android_cid() {
        return PushPayload.newBuilder()
                .setPlatform(Platform.android())
                .setAudience(Audience.registrationId("18071adc030dcba91c0"))
                .setNotification(Notification.alert(ALERT))
                .setCid("d4ee2375846bc30fa51334f5-21f305e0-4a52-42f3-a3dd-d2e49bdf0499")
                .build();
    }
    private void sendPushWithResultMessage(JPushClient jpushClient, PushPayload payload) {
        try {
            PushResult result = jpushClient.sendPush(payload);
            int status = result.getResponseCode();
            LOG.info("Got result - " + result);

        } catch (APIConnectionException e) {
            LOG.error("Connection error. Should retry later. ", e);
            LOG.error("Sendno: " + payload.getSendno());

        } catch (APIRequestException e) {
            LOG.error("Error response from JPush server. Should review and fix it. ", e);
            LOG.info("HTTP Status: " + e.getStatus());
            LOG.info("Error Code: " + e.getErrorCode());
            LOG.info("Error Message: " + e.getErrorMessage());
            LOG.info("Msg ID: " + e.getMsgId());
            LOG.error("Sendno: " + payload.getSendno());
        }
    }
}
