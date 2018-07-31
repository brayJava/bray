package com.whiteplanet.admin.service.message.jg.push.remote;

import com.whiteplanet.push.jg.push.PushResult;
import com.whiteplanet.push.jg.push.model.Message;
import com.whiteplanet.push.jg.push.model.Platform;
import com.whiteplanet.push.jg.push.model.PushPayload;
import com.whiteplanet.push.jg.push.model.audience.Audience;
import com.whiteplanet.push.jg.push.model.notification.Notification;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SingleTest extends BaseRemotePushTest {
    
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

