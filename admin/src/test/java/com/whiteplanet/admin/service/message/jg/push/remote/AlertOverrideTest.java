package com.whiteplanet.admin.service.message.jg.push.remote;

import cn.jiguang.common.resp.APIRequestException;
import com.whiteplanet.admin.service.message.jg.SlowTests;
import com.whiteplanet.push.jg.push.PushResult;
import com.whiteplanet.push.jg.push.model.Platform;
import com.whiteplanet.push.jg.push.model.PushPayload;
import com.whiteplanet.push.jg.push.model.audience.Audience;
import com.whiteplanet.push.jg.push.model.notification.AndroidNotification;
import com.whiteplanet.push.jg.push.model.notification.IosNotification;
import com.whiteplanet.push.jg.push.model.notification.Notification;
import com.whiteplanet.push.jg.push.model.notification.WinphoneNotification;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertTrue;

@Category(SlowTests.class)
public class AlertOverrideTest extends BaseRemotePushTest {
    
    @Test
    public void sendAlert_all() throws Exception {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.all())
                .setNotification(Notification.newBuilder()
                        .setAlert("alert")
                        .addPlatformNotification(AndroidNotification.alert("android alert"))
                        .addPlatformNotification(IosNotification.alert("ios alert"))
                        .addPlatformNotification(WinphoneNotification.alert("winphone alert"))
                        .build())
                .build();
        PushResult result = _client.sendPush(payload);
        assertTrue(result.isResultOK());
    }
    
    @Test
    public void sendAlert_android() throws Exception {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.android())
                .setAudience(Audience.all())
                .setNotification(Notification.newBuilder()
                        .setAlert("alert")
                        .addPlatformNotification(AndroidNotification.alert("android alert"))
                        .build())
                .build();
        PushResult result = _client.sendPush(payload);
        assertTrue(result.isResultOK());
    }
    
    @Test
    public void sendAlert_ios() throws Exception {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.ios())
                .setAudience(Audience.all())
                .setNotification(Notification.newBuilder()
                        .setAlert("alert")
                        .addPlatformNotification(IosNotification.alert("ios alert"))
                        .build())
                .build();
        try {
            PushResult result = _client.sendPush(payload);
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void sendAlert_wp() throws Exception {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.winphone())
                .setAudience(Audience.all())
                .setNotification(Notification.newBuilder()
                        .setAlert("alert")
                        .addPlatformNotification(WinphoneNotification.alert("winphone alert"))
                        .build())
                .build();
        try {
            PushResult result = _client.sendPush(payload);
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }
    
	
}

