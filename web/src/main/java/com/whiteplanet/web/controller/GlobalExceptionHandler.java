package com.whiteplanet.web.controller;

import com.alibaba.fastjson.JSON;
import com.whiteplanet.common.exception.BusinessException;
import com.whiteplanet.common.exception.ReturnResult;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    /**
     *
     * @param exception
     * @return
     * @throws Exception
     */
    @Order(1)
    @ExceptionHandler(value=BusinessException.class)
    public ReturnResult businessExceptionHandler(BusinessException exception) throws Exception {
        return JSON.parseObject(exception.getMessage(), ReturnResult.class);
    }

    /**
     *
     * @param exception
     * @return
     * @throws Exception
     */
    @Order(99)
    @ExceptionHandler(value=Exception.class)
    public ReturnResult allExceptionHandler(Exception exception) throws Exception {
        return ReturnResult.RESULT_ERROR;
    }
}
