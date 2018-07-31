package com.whiteplanet.admin.controller;
import com.whiteplanet.admin.domain.result.ExceptionMsg;
import com.whiteplanet.admin.domain.result.Response;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public abstract class BaseController {
    /**
     * 取request对象
     * 日志系统
     */
    protected Log logger = LogFactory.getLog(this.getClass());
    /**
     * 获取request请求
     * @return
     */
    protected HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }
    /**
     * 取session
     * @return
     */
    protected HttpSession getSession() {
        return getRequest().getSession();
    }
    /**
     * 返回结果response封装
     * @param msg
     * @return
     */
    protected Response result(ExceptionMsg msg){
        return new Response(msg);
    }
    /**
     * 默认返回错误编码response
     * @return
     */
    protected Response result(){
        return new Response();
    }
}