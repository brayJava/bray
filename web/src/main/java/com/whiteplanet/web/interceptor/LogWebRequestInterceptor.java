package com.whiteplanet.web.interceptor;

import com.alibaba.fastjson.JSON;
import com.whiteplanet.web.Final;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LogWebRequestInterceptor implements HandlerInterceptor {

    protected Log logger = LogFactory.getLog(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getParameter(Final.PARAM_TOKEN);
        if(logger.isDebugEnabled()){
            logger.debug(String.format("Token: %s", token));
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // if (modelAndView.getModel() != null){
        //     if(logger.isDebugEnabled()){
        //         logger.debug(String.format("Output:[%s]", JSON.toJSON(modelAndView.getModel())));
        //     }
        // }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
