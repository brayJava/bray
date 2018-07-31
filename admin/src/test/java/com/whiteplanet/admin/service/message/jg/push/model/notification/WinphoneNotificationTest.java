package com.whiteplanet.admin.service.message.jg.push.model.notification;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.whiteplanet.admin.service.message.jg.FastTests;
import com.whiteplanet.push.jg.push.model.notification.WinphoneNotification;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(FastTests.class)
public class WinphoneNotificationTest {

    @Test
    public void testEmpty() {
        WinphoneNotification winphone = WinphoneNotification.newBuilder().build();
        Assert.assertEquals("", new JsonObject(), winphone.toJSON());
    }
    
    @Test
    public void testQuickAlert() {
        WinphoneNotification winphone = WinphoneNotification.alert("aaa");
        JsonObject json = new JsonObject();
        json.add("alert", new JsonPrimitive("aaa"));
        Assert.assertEquals("", json, winphone.toJSON());
    }

    @Test
    public void testTitle() {
        WinphoneNotification winphone = WinphoneNotification.newBuilder().setTitle("title").build();
        JsonObject json = new JsonObject();
        json.add("title", new JsonPrimitive("title"));
        Assert.assertEquals("", json, winphone.toJSON());
    }
    
    @Test
    public void testExtra() {
        WinphoneNotification winphone = WinphoneNotification.newBuilder()
                .addExtra("key2", 222)
                .addExtra("key", "value").build();
        JsonObject json = new JsonObject();
        JsonObject extra = new JsonObject();
        extra.add("key", new JsonPrimitive("value"));
        extra.add("key2", new JsonPrimitive(222));
        json.add("extras", extra);
        Assert.assertEquals("", json, winphone.toJSON());
    }
    

}


