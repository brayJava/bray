package com.whiteplanet.sms;

import com.alibaba.fastjson.JSON;
import com.whiteplanet.utils.HttpUtil;
import com.whiteplanet.utils.MD5Crypto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HeWei
 * @Description: 发送短信
 * @Date: Created in 15:47 2017
 * @Modified By:
 */
public class SendSms {

    public static String send(String phoneNo,String content) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("account", "98ad05");
        map.put("password", MD5Crypto.encrypByMd5("hi56do78c3").toUpperCase());
        map.put("mobile", phoneNo);
        map.put("content", content);
        map.put("sendTime", "");
        map.put("extno", "");
        return HttpUtil.doGet("http://api.chanzor.com/send", map);
        //return JSON.parseObject(result, SMSResult.class);
    }


    public static void main(String[] args) throws Exception {
//        System.out.println(SendSms.send("15906224335","【C医O】注册验证码是：1546，您正在注册成为C医O的用户，3分钟内有效，如不是本人操作，请无视。"));
        System.out.println(SendSms.send("18507906861","【拜托了C医O】退款通知：您取消了小哥哥的约诊申请，根据平台协议，平台将在1-3个工作日内，退还您所支付约诊费的75%（0.75元）。或拨打客服电话：021-64225665。打开拜托了C医O公众号>约诊记录>查看详情 "));
    }
}

