package com.whiteplanet.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public abstract class BaseController {
    /**
     * 日志系统
     */
    protected Log logger = LogFactory.getLog(this.getClass());
}
