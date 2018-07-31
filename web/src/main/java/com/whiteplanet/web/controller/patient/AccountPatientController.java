package com.whiteplanet.web.controller.patient;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.web.entry.LoginBean;
import com.whiteplanet.web.entry.PublicJsonParam;
import com.whiteplanet.web.service.patient.AccountPatientService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 *
 */
@RestController
public class AccountPatientController extends BasePatientController{

    /**
     * 账户服务
     */
    @Resource
    private AccountPatientService accountPatientService;

    /**
     *
     * @param param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ReturnResult login(@RequestBody PublicJsonParam<LoginBean> param){
        return accountPatientService.login(param.getData());
    }

}
