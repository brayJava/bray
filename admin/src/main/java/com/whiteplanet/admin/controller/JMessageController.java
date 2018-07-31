package com.whiteplanet.admin.controller;

import com.whiteplanet.admin.service.JMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:wuzhiyuan
 * @description:    IM消息相关控制器
 * @date: Created in 10:23 2018/6/21
 * @modified By:
 */
@Controller
@RequestMapping("/im")
public class JMessageController {
    /**
     * IM相关服务
     */
    @Autowired
    private JMessageService jMessageService;

    @PostMapping("/check")
    @ResponseBody
    public String authCode(String doctorId ,String userToken) {

        boolean b = jMessageService.checkJMessage(doctorId, userToken);
        if(b) {
            return "OK";
        } else {
            return "FAIL";
        }
    }
    @PostMapping("/send-push")
    @ResponseBody
    public void sendPush(String doctorId) {
        jMessageService.sendPushMessage(doctorId);
    }

}
