package com.whiteplanet.web.controller.doctor;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.web.entry.*;
import com.whiteplanet.web.interceptor.Token;
import com.whiteplanet.web.service.doctor.AccountDoctorService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AccountDoctorController extends BaseDoctorController {

    /**
     * 账户服务
     */
    @Resource
    private AccountDoctorService accountDoctorService;

    /**
     * 账户登录
     * @param param
     * @return
     */
    @Token(false)
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ReturnResult login(@RequestBody JsonParam<LoginBean> param){
        return accountDoctorService.login(param.getData());
    }

    /**
     * 忘记密码
     * @param param
     * @return
     */
    @Token(false)
    @RequestMapping(value = "/forgot-password", method = RequestMethod.POST)
    public ReturnResult forgotPassword(@RequestBody JsonParam<ForgotPasswordBean> param){
        return accountDoctorService.forgotPassword(param.getData());
    }

    /**
     * 注册
     * @param param
     * @return
     */
    @Token(false)
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ReturnResult register(@RequestBody JsonParam<RegisterBean> param){
        return accountDoctorService.register(param.getData());
    }

    /**
     * 判断手机号是否注册
     * @param param
     * @return
     */
    @Token(false)
    @RequestMapping(value = "/check-phoneNo", method = RequestMethod.POST)
    public ReturnResult checkPhoneNo(@RequestBody JsonParam<String> param){
        return accountDoctorService.checkPhoneExist(param.getData());
    }

    /**
     * 校验手机号和验证码
     * @param data  phone = data.getCodeParam()  验证码 = data.getChnParam()
     * @return
     */
    @Token(false)
    @RequestMapping(value = "/check-phone-pin", method = RequestMethod.POST)
    public ReturnResult checkPhoneAndPin(@RequestBody JsonParam<DoubleStringBean> data){
        return accountDoctorService.checkPhoneAndPin(
                data.getData().getCodeParam(),data.getData().getChnParam());
    }

}
