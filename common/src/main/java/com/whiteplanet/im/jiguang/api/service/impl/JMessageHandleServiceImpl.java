package com.whiteplanet.im.jiguang.api.service.impl;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import com.whiteplanet.config.JPushConfig;
import com.whiteplanet.im.jiguang.api.common.model.message.MessageBody;
import com.whiteplanet.im.jiguang.api.common.model.message.MessagePayload;
import com.whiteplanet.im.jiguang.api.message.MessageClient;
import com.whiteplanet.im.jiguang.api.message.MessageListResult;
import com.whiteplanet.im.jiguang.api.message.MessageType;
import com.whiteplanet.im.jiguang.api.message.SendMessageResult;
import com.whiteplanet.im.jiguang.api.resource.DownloadResult;
import com.whiteplanet.im.jiguang.api.resource.ResourceClient;
import com.whiteplanet.im.jiguang.api.service.JMessageHandleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author:wuzhiyuan
 * @description:  处理极光消息类接口实现
 * @date: Created in 17:20 2018/02/01
 * @modified By:
 */
@Component
public class JMessageHandleServiceImpl implements JMessageHandleService {


    Logger logger = LoggerFactory.getLogger(JMessageHandleServiceImpl.class);

    private MessageClient messageClient = null;
    private ResourceClient resourceClient = null;
    private final static int DEFAULT_COUNT = 1000;//默认查询1000条消息数据

    public JMessageHandleServiceImpl() {
        //实例化message获取客户端
        messageClient = new MessageClient(JPushConfig.APP_KEY,JPushConfig.MASTER_SECRET);
        //资源路径获取客户端
        resourceClient = new ResourceClient(JPushConfig.APP_KEY,JPushConfig.MASTER_SECRET);
    }

    /**
     * 获取历史消息
     * @param beginTime 消息创建开始时间
     * @param endTime   消息创建结束时间
     * @return
     */
    public MessageListResult getMessageList(String beginTime,String endTime) {
            MessageListResult result = null;
            try {
            result = messageClient.getMessageList(DEFAULT_COUNT, beginTime, endTime);
            String cursor = result.getCursor();
            logger.info("Cursor: " + cursor);
        } catch (APIConnectionException e) {
            logger.error("Connection error. Should retry later. ", e);
        } catch (APIRequestException e) {
            logger.error("Error response from JPush server. Should review and fix it. ", e);
            logger.info("HTTP Status: " + e.getStatus());
            logger.info("Error Message: " + e.getMessage());
        }
        return result;
    }

    /**
     * @param userId   消息用户id
     * @param count    查询条数
     * @param startTime 消息创建开始时间
     * @param endTime   消息创建结束时间
     * @return
     */
    public MessageListResult getUserMessages(String userId,int count,String startTime,String endTime) {
        MessageListResult result = null;
        try {
            result = messageClient.getUserMessages(userId, count, startTime, endTime);
            String cursor = result.getCursor();
            logger.info("Cursor: " + cursor);
        } catch (APIConnectionException e) {
            logger.error("Connection error. Should retry later. ", e);
        } catch (APIRequestException e) {
            logger.error("Error response from JPush server. Should review and fix it. ", e);
            logger.info("HTTP Status: " + e.getStatus());
            logger.info("Error Message: " + e.getMessage());
        }
        return result;
    }

    /**
     * 管理员单聊发送自定义消息
     * @param userType    用户类型 {user：普通用户，admin：管理员用户}
     * @param messageType 消息类型 {single：单聊信息 ， group：群消息}
     * @param fromId   发送用户
     * @param targetId 接受用户
     * @param message  发送信息
     */
    @Override
    public void sendCustomMessage(String userType,String messageType,String fromId, String targetId, String message) {
        MessageBody messageBody = new MessageBody.Builder()
                .setText(message)
                .addExtra("extra", "")
                .build();
        MessagePayload payload = MessagePayload.newBuilder()
                .setVersion(1)
                .setTargetType(messageType)
                .setTargetId(targetId)
                .setFromType(userType)
                .setFromId(fromId)
                .setMessageType(MessageType.TEXT)
                .setMessageBody(messageBody)
                .build();
        try {
            logger.info(">>>>>>>>>>>>>>>>>>> 开始向用户推送im消息:"+message);
            SendMessageResult res = messageClient.sendMessage(payload);
            logger.info(">>>>>>>>>>>>>>>>>>> im消息发送成功");
        } catch (APIConnectionException e) {
            logger.error("Connection error. Should retry later. ", e);
        } catch (APIRequestException e) {
            logger.error("Error response from JPush server. Should review and fix it. ", e);
            logger.info("HTTP Status: " + e.getStatus());
            logger.info("Error Message: " + e.getMessage());
        }

    }
    /**
     * 获取资源信息
     * @param mediaId 存放富媒体消息id
     */
    @Override
    public String getResource(String mediaId) {
        String url = null;
        try {
            DownloadResult result = resourceClient.downloadFile(mediaId);
            url = result.getUrl();
            logger.info("Url: " + url);
        } catch (APIConnectionException e) {
            logger.error("Connection error. Should retry later. ", e);
        } catch (APIRequestException e) {
            logger.error("Error response from JPush server. Should review and fix it. ", e);
            logger.info("HTTP Status: " + e.getStatus());
            logger.info("Error Message: " + e.getMessage());
        }
        return url;
    }
}
