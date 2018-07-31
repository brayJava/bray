package com.whiteplanet.web.interceptor;

import java.lang.annotation.*;

/**
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Token {
    boolean value() default true;
}
