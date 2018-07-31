/*
package com.whiteplanet.admin.service;

import com.alibaba.fastjson.JSON;
import com.whiteplanet.im.jiguang.api.service.JMessageHandleService;
import com.whiteplanet.mapper.MessageGroupMapper;
import com.whiteplanet.mapper.MessageTemplateMapper;
import com.whiteplanet.mapper.model.MessageGroup;
import com.whiteplanet.mapper.model.MessageTemplate;
import com.whiteplanet.push.jg.JPushService;
import com.whiteplanet.sms.SMSResult;
import com.whiteplanet.sms.SendSms;
import com.whiteplanet.utils.WPStringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
*/
/**
 * @author:wuzhiyuan
 * @description:
 * @date: Created in 14:10 2018/5/24
 * @modified By:
 *//*

@SpringBootTest(classes = TestApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class SmsServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private MessageGroupMapper messageGroupMapper;
    @Autowired
    private MessageTemplateMapper messageTemplateMapper;
//    @Autowired
//    private SmsSendService smsSendService;
    @Autowired
    private JPushService jPushService;
    @Autowired
    private JMessageHandleService jMessageHandleService;

    @Test
    public  void send(){
        String code = "code141-3";
        Map<String,String> paramMap = new LinkedHashMap<>();
        paramMap.put("patient","wuzhiyuan");
        MessageGroup messageGroup = messageGroupMapper.selectByCode(code);
        String transDocPhone = "";
        if(!Objects.isNull(messageGroup)) {
            List<MessageTemplate> messageTemplates = messageTemplateMapper.selectByGroup(messageGroup.getId(), 0);
            messageTemplates.forEach(messageTemplate -> {
                String msg = WPStringUtil.render(messageTemplate.getNote(),paramMap); //替换参数
                switch (messageTemplate.getKind()) {
                    case 0://app推送消息
                        jPushService.sendPushWithNotificationAndExtrasMessageByAliasToAllPlatform(userId
                                ,msg,extraMap);
                        if("4".equals(extraMap.get("type"))){
                            break;
                        }
                        break;
                    case 1://IM消息
                        jMessageHandleService.sendCustomMessage("admin","single"
                                ,"system",userId,msg,"备注");
                        break;
                    case 2://微信消息
                        break;
                    case 3://短信消息
                        sendSms("18507906861",msg);
                        break;
                }
            });
        }
    }
    */
/**
     * @param phoneNo  需发送的手机号码
     * @param msgContext 短信内容
     *//*

    public void sendSms(String phoneNo, String msgContext){

//        String smsTemp = handlerMsg(smsCode);
//        String msg = WPStringUtil.render(smsTemp,paramMap); //替换参数
        //发送短信
        logger.debug(">>>>>>>>>>开始向用户{}发送短信，短信内容:{}",phoneNo,msgContext);
        String result = SendSms.send(phoneNo,msgContext);
        SMSResult smsResult = JSON.parseObject(result, SMSResult.class);
        logger.info(">>>>>>>>>>短信发送结果:{}",smsResult.getDesc());
    }

}
*/
