package com.whiteplanet.sms;

import com.alibaba.fastjson.JSON;
import com.whiteplanet.mapper.MessageTemplateMapper;
import com.whiteplanet.utils.WPStringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HeWei
 * @Description:
 * @Date: Created in 12:00 2017
 * @Modified By:
 */
@Component
@Transactional
public class SendSmsService extends BaseService {
    @Autowired
    MessageTemplateMapper messageTemplateMapper;

    public void sendSms(String phoneNo,String content,Integer smsType){
        String smsTemp = "";
        //根据类型选择短信模板code
        switch (smsType){
            case 1: // 注册
                smsTemp = handlerMsg(Final.SYS_REG);
                break;
            case 2: //找回密码
                smsTemp = handlerMsg(Final.SYS_FIND_PWD);
                break;
            case 3: //提现密码修改
                smsTemp = handlerMsg(Final.SYS_CHANGE_CASH_PWD);
                break;
            case 4: //绑定银行卡
                smsTemp = handlerMsg(Final.SYS_BANDING_BANKCARD);
                break;
            case 5: //用户证件审核通过
                smsTemp = handlerMsg(Final.SYS_USER_CER_AUDIT_PASS);
                break;
            case 6: //用户证件审核失败
                smsTemp = handlerMsg(Final.SYS_USER_CER_AUDIT_FAIL);
                break;
        }
        Map<String,String > map = new HashMap<String,String>();
        map.put("captcha",content);
        String msg = WPStringUtil.render(smsTemp,map); //替换参数

        //发送短信
        logger.debug(">>>>>>>>>>开始向用户{}发送短信，短信内容:{}",phoneNo,msg);
        String result = SendSms.send(phoneNo,msg);
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
