package com.whiteplanet.web.interceptor;


import com.whiteplanet.common.exception.BusinessException;
import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.web.Final;
import com.whiteplanet.web.cache.AccountCache;
import com.whiteplanet.web.entry.Account;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthWebRequestInterceptor implements HandlerInterceptor {

    @Resource
    private AccountCache accountCache;

    protected Log logger = LogFactory.getLog(this.getClass());

    /**
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(!(handler instanceof HandlerMethod)){
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Token token = handlerMethod.getMethod().getAnnotation(Token.class);
        if(token != null && !token.value()){
            logger.debug(String.format("不需要权限接口[%s]", request.getServletPath()));
            return true;
        }
        else {
            String paramToken = request.getParameter(Final.PARAM_TOKEN);

            if(StringUtils.isEmpty(paramToken)){     //没有登录
                logger.debug(String.format("缺少参数[token][%s]", request.getServletPath()));
                throw new BusinessException(ReturnResult.RESULT_ERROR);
            }

            Account account = accountCache.get(paramToken);
            if(account == null){                    //重新登录
                logger.debug(String.format("没有访问权限[%s]", request.getServletPath()));
                throw new BusinessException(ReturnResult.RESULT_ERROR);
            }

            request.setAttribute(Final.PARAM_ACCOUNT, account);
            return true;
        }
    }

    /**
     *
     * @param request
     * @param response
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
    }

    /**
     *
     * @param request
     * @param response
     * @param o
     * @param e
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {
    }
}
