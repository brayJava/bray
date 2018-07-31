package com.whiteplanet.admin.service.message.jg.schedule.model;

import com.google.gson.JsonObject;
import com.whiteplanet.admin.service.message.jg.FastTests;
import com.whiteplanet.push.jg.push.model.PushPayload;
import com.whiteplanet.push.jg.schedule.model.SchedulePayload;
import com.whiteplanet.push.jg.schedule.model.TriggerPayload;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * SchedulePayload Tester.
 *
 * @version 1.0
 */
@Category(FastTests.class)
public class SchedulePayloadTest {

    @Test
    public void testToJson() {
        String name = "test_schedule";
        TriggerPayload trigger = TriggerPayload.newBuilder()
                .setSingleTime("2015-07-25 12:20:30")
                .buildSingle();

        PushPayload push = PushPayload.alertAll("test schedule");
        SchedulePayload payload = SchedulePayload.newBuilder()
                .setName(name)
                .setEnabled(true)
                .setTrigger(trigger)
                .setPush(push)
                .build();

        JsonObject json = new JsonObject();
        json.addProperty("name", name);
        json.addProperty("enabled", true);
        json.add("trigger", trigger.toJSON());
        json.add("push", push.toJSON());

        Assert.assertEquals("", json, payload.toJSON());
    }

} 
