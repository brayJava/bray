package com.whiteplanet.web.controller;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.web.entry.PublicJsonParam;
import com.whiteplanet.web.entry.VerificationCodeBean;
import com.whiteplanet.web.interceptor.Token;
import com.whiteplanet.web.service.common.AreaService;
import com.whiteplanet.web.service.common.SMSservice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @Author: HeWei
 * @Description: 公共Controller 处理公共业务
 * @Date: Created in 17:53 2017
 * @Modified By:
 */
@RequestMapping("/api")
public class PublicController extends BaseController{
    @Resource
    private SMSservice smSservice;
    @Resource
    private AreaService areaService;

    /**
     * 发送手机验证码
     * @param data
     * @return
     */
    @Token(false)
    @RequestMapping(value = "/sendSms", method = RequestMethod.POST)
    public ReturnResult sendSms(@RequestBody PublicJsonParam<VerificationCodeBean> data){
        return smSservice.sendSmsCode(data.getData());
    }

    /**
     * 获取区域信息(省、市)
     * @return
     */
    @Token(false)
    @RequestMapping(value = "/area", method = RequestMethod.POST)
    public ReturnResult area(){
        return areaService.getProAndCity();
    }
}
