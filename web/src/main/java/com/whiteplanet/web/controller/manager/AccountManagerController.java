package com.whiteplanet.web.controller.manager;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.web.entry.LoginBean;
import com.whiteplanet.web.interceptor.Token;
import com.whiteplanet.web.service.manager.AccountManagerService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 管理系统
 */
@RestController
public class AccountManagerController extends BaseManagerController{

    /**
     * 账户服务
     */
    @Resource
    private AccountManagerService accountManagerService;

    /**
     * 管理账户登录
     *
     * @param loginAccount
     * @return
     */
    @Token(false)
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ReturnResult login(@RequestBody LoginBean loginAccount){
        return accountManagerService.login(loginAccount);
    }

    
}
