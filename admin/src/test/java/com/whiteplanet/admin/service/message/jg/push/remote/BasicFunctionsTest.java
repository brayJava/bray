package com.whiteplanet.admin.service.message.jg.push.remote;

import cn.jiguang.common.DeviceType;
import cn.jiguang.common.resp.APIRequestException;
import com.whiteplanet.admin.service.message.jg.SlowTests;
import com.whiteplanet.push.jg.push.PushResult;
import com.whiteplanet.push.jg.push.model.Message;
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
public class BasicFunctionsTest extends BaseRemotePushTest {
	
	@Test
    public void sendSimpleNotification_Pall_Ndefault() throws Exception {
	    PushPayload payload = PushPayload.alertAll("Pall Nall default alert");
		PushResult result = _client.sendPush(payload);
        assertTrue(result.isResultOK());
	}
	
    @Test
    public void sendSimpleNotification_Pandroid_Nandroid() throws Exception {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.android())
                .setAudience(Audience.all())
                .setNotification(Notification.newBuilder()
                        .addPlatformNotification(AndroidNotification.alert("Pandroid Nandroid alert"))
                        .build())
                .build();
        PushResult result = _client.sendPush(payload);
        assertTrue(result.isResultOK());
    }
    
    @Test
    public void sendSimpleNotification_Pall_Nandroid() throws Exception {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.all())
                .setNotification(Notification.newBuilder()
                        .addPlatformNotification(AndroidNotification.alert("Pall Nandroid alert"))
                        .build())
                .build();
        PushResult result = _client.sendPush(payload);
        assertTrue(result.isResultOK());
    }
    
    @Test
    public void sendSimpleNotification_Pios_Nios() throws Exception {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.ios())
                .setAudience(Audience.all())
                .setNotification(Notification.newBuilder()
                        .addPlatformNotification(IosNotification.alert("Pios Nios alert"))
                        .build())
                .build();
        try {
            PushResult result = _client.sendPush(payload);
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void sendSimpleNotification_Pall_Nios() throws Exception {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.all())
                .setNotification(Notification.newBuilder()
                        .addPlatformNotification(IosNotification.alert("Pall Nios alert"))
                        .build())
                .build();
        try {
            PushResult result = _client.sendPush(payload);
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void sendSimpleNotification_Pwp_Nwp() throws Exception {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.winphone())
                .setAudience(Audience.all())
                .setNotification(Notification.newBuilder()
                        .addPlatformNotification(WinphoneNotification.alert("Pwp Nwp alert"))
                        .build())
                .build();
        try {
            PushResult result = _client.sendPush(payload);
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void sendSimpleNotification_Pall_Nwp() throws Exception {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.all())
                .setNotification(Notification.newBuilder()
                        .addPlatformNotification(WinphoneNotification.alert("Pall Nwp alert"))
                        .build())
                .build();
        try {
            PushResult result = _client.sendPush(payload);
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }
    
    
    @Test
    public void sendSimpleNotification_Pall_Nall() throws Exception {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.newBuilder()
                        .addDeviceType(DeviceType.IOS)
                        .addDeviceType(DeviceType.WinPhone)
                        .addDeviceType(DeviceType.Android).build())
                .setAudience(Audience.all())
                .setNotification(Notification.newBuilder()
                        .addPlatformNotification(WinphoneNotification.alert("Pall Nall wp alert"))
                        .addPlatformNotification(IosNotification.alert("Pall Nall ios alert"))
                        .addPlatformNotification(AndroidNotification.alert("Pall Nall android alert"))
                        .build())
                .build();
        PushResult result = _client.sendPush(payload);
        assertTrue(result.isResultOK());
    }
    
    @Test
    public void sendSimpleMessage_default() throws Exception {
        PushPayload payload = PushPayload.messageAll("Pall msg");
        PushResult result = _client.sendPush(payload);
        assertTrue(result.isResultOK());
    }
    
    @Test
    public void sendSimpleMessage_Pandroid() throws Exception {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.android())
                .setAudience(Audience.all())
                .setMessage(Message.content("Pandroid msg"))
                .build();
        PushResult result = _client.sendPush(payload);
        assertTrue(result.isResultOK());
    }
    
    @Test
    public void sendSimpleMessage_Pios() throws Exception {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.ios())
                .setAudience(Audience.all())
                .setMessage(Message.content("Pios msg"))
                .build();
        try {
            PushResult result = _client.sendPush(payload);
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }
    
    //@Test
    public void sendSimpleMessage_Pwinphone() throws Exception {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.winphone())
                .setAudience(Audience.all())
                .setMessage(Message.content("Pwp msg"))
                .build();
        PushResult result = _client.sendPush(payload);
        assertTrue(result.isResultOK());
    }
    
	
    @Test
    public void sendSimpleMessageAndNotification_Pall() throws Exception {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.all())
                .setNotification(Notification.alert("Pall Nall Mall alert"))
                .setMessage(Message.content("Pall Nall Mall msg"))
                .build();
        PushResult result = _client.sendPush(payload);
        assertTrue(result.isResultOK());
    }
    

    
}

