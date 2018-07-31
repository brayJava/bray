package com.whiteplanet.admin.service.message.jg;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TestOrder {
    public int order();
}