package com.whiteplanet.sms;

import com.alibaba.fastjson.JSON;
import com.whiteplanet.mapper.MessageTemplateMapper;
import com.whiteplanet.utils.WPStringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author:wuzhiyuan
 * @description: 短信发送接口
 * @date: Created in 13:58 2018/4/26
 * @modified By:
 */
@Component
public class SmsSendService {

    //日志 slf4j
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MessageTemplateMapper messageTemplateMapper;
    /**
     *
     * @param phoneNo  需发送的手机号码
     * @param paramMap map对象参数
     * @param smsCode  短信内容获取编码
     */
    public void sendSms(String phoneNo, Map<String,String> paramMap, String smsCode){

        String smsTemp = handlerMsg(smsCode);
        String msg = WPStringUtil.render(smsTemp,paramMap); //替换参数
        //发送短信
        logger.debug(">>>>>>>>>>开始向用户{}发送短信，短信内容:{}",phoneNo,msg);
        String result = SendSms.send(phoneNo,msg);
        SMSResult smsResult = JSON.parseObject(result, SMSResult.class);
        logger.info(">>>>>>>>>>短信发送结果:{}",smsResult.getDesc());
    }
    /**
     * @param phoneNo  需发送的手机号码
     * @param msgContext 短信内容
     */
    public void sendSms(String phoneNo, String msgContext){

//        String smsTemp = handlerMsg(smsCode);
//        String msg = WPStringUtil.render(smsTemp,paramMap); //替换参数
        //发送短信
        logger.debug(">>>>>>>>>>开始向用户{}发送短信，短信内容:{}",phoneNo,msgContext);
        String result = SendSms.send(phoneNo,msgContext);
        SMSResult smsResult = JSON.parseObject(result, SMSResult.class);
        logger.info(">>>>>>>>>>短信发送结果:{}",smsResult.getDesc());
    }
    /**
     * 根据模板code 查找模板内容
     * @param smsTempCode
     * @return
     */
    private String handlerMsg(String smsTempCode){
        return messageTemplateMapper.selectNoteByCode(smsTempCode);
    }
}
