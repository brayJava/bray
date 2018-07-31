package com.whiteplanet.admin.service.message.jg.push.model.audience;

import com.google.gson.JsonArray;
import com.google.gson.JsonPrimitive;
import com.whiteplanet.admin.service.message.jg.FastTests;
import com.whiteplanet.push.jg.push.model.audience.AudienceTarget;
import com.whiteplanet.push.jg.push.model.audience.AudienceType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(FastTests.class)
public class AudienceTargetTest {

    @Test(expected = IllegalArgumentException.class)
    public void testIllegal() {
        AudienceTarget.newBuilder().setAudienceType(AudienceType.ALIAS).build();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIllegal2() {
        AudienceTarget.newBuilder().addAudienceTargetValue("aaa").build();
    }
    
    @Test
    public void testAlias() {
        JsonArray arr = new JsonArray();
        arr.add(new JsonPrimitive("aaa"));
        
        AudienceTarget target = AudienceTarget.alias("aaa");
        Assert.assertEquals("", arr, target.toJSON());
    }

    

}
