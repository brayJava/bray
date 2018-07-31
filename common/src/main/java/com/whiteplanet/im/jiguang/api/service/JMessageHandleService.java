package com.whiteplanet.im.jiguang.api.service;

import com.whiteplanet.im.jiguang.api.message.MessageListResult;
/**
 * @author:wuzhiyuan
 * @description: 极光消息访问接口
 * @date: Created in 18:39 2018/02/01
 * @modified By:
 */
public interface JMessageHandleService {
    /**
     * 获取im历史消息（默认取1000条数据）
     * @param beginTime 消息创建开始时间
     * @param endTime   消息创建结束时间
     * @return messageListResult{total:"总条数" ，cursor：“游标值” ，count：”实际返回条数“ ，message:"返回消息集合"}
     */
    MessageListResult getMessageList(String beginTime, String endTime);
    /**
     * 获取指定用户消息
     * @param userId   消息用户id
     * @param count    查询条数
     * @param startTime 消息创建开始时间
     * @param endTime   消息创建结束时间
     * @return
     */
    MessageListResult getUserMessages(String userId,int count,String startTime,String endTime);
    /**
     * 后台发送自定义消息接口
     * @param userType    用户类型 {user：普通用户，admin：管理员用户}
     * @param messageType 消息类型 {single：单聊信息 ， group：群消息}
     * @param fromId     发送用户
     * @param targetId   接受用户
     * @param message    发送信息内容
     */
    void sendCustomMessage(String userType, String messageType, String fromId, String targetId, String message);

    /**
     * 获取文件、图片、语音，小视频存放路径
     * @param mediaId 存放富媒体消息id
     * @return 资源路径：{ url: http://dl.im.jiguang.cn/.....}
     */
    String getResource(String mediaId);
}
