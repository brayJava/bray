package com.whiteplanet.push.wechat;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.whiteplanet.push.wechat.bean.*;
import com.whiteplanet.utils.HttpUtil;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.io.IOException;

/**
 * @author:wuzhiyuan
 * @description:  微信公众号-模板信息接口
 * @date: Created in 0:14 2018/5/10
 * @modified By:
 */
@Component
public class WechatTemplateMessageServiceImpl implements WechatTemplateMessageServcie {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * @param openId   openId值
     * @param id  自定义id
     * @param jumpType  跳转类型
     * @param templateParam  模板参数值
     */
    public  void sendTemplateMessage(String openId,String id,String jumpType,TemplateParam templateParam) {
        DataInfo first = new DataInfo(templateParam.getTitle(), "");
        DataInfo keyword1 = new DataInfo(templateParam.getNoticeTime(), "");
        DataInfo keyword2 = new DataInfo(templateParam.getNoticeContent(), "");
        DataInfo remark = new DataInfo(templateParam.getRemark(), "#173177");
        TemplateKeyword templateKeyword = new TemplateKeyword(first, keyword1, keyword2, remark);
        //设置模板参数
        WechatTemplateMessage wechatTemplateMessage = new WechatTemplateMessage();
//        wechatTemplateMessage.setOpenId("o_BJDwEk_c8HkvYS4NR9U71-imeQ");
        wechatTemplateMessage.setTouser(openId);
        wechatTemplateMessage.setTemplate_id(WechatConstant.TEMPLATE_ID);
        if(Constant.IM_WECHAT.equals(jumpType)) {
            wechatTemplateMessage.setUrl(WechatConstant.IM_WECHAT_URL+id);
            logger.info("下行通知连接地址：url>>>>{}",WechatConstant.IM_WECHAT_URL+id);
        } else {
            wechatTemplateMessage.setUrl(WechatConstant.WECHAT_URL+id);
            logger.info("下行通知连接地址：url>>>>{}",WechatConstant.WECHAT_URL+id);
        }
        wechatTemplateMessage.setData(templateKeyword);
        String jsonParam = String.valueOf(JSONObject.toJSON(wechatTemplateMessage));
        //获取access_token的值
        String url = HttpUtil.doGet(WechatConstant.ACCESS_TOKEN_URL);
        JSONObject jsonObject = JSON.parseObject(url);
        Object access_token = jsonObject.get("access_token");
        MediaType JSON = MediaType.parse(WechatConstant.YTPE);
        RequestBody body = RequestBody.create(JSON, jsonParam);
        Request request = new Request.Builder()
                .url(WechatConstant.URL+"?access_token="+String.valueOf(access_token))
                .post(body)
                .build();
        Call call = new OkHttpClient().newCall(request);
        try {
            Response response = call.execute();
            System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}