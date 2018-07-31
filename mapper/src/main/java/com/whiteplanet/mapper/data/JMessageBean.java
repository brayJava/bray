package com.whiteplanet.mapper.data;

/**
 * @author:wuzhiyuan
 * @description IM消息信息实体类
 * @date: Created in 19:23 2018/6/19
 * @modified By:
 */
public class JMessageBean {

    private String fromId;

    private String maxTime;

    private String msgExtras;

    private String msgText;

    private String msgType;

    private String targetId;

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(String maxTime) {
        this.maxTime = maxTime;
    }
    public String getMsgExtras() {
        return msgExtras;
    }

    public void setMsgExtras(String msgExtras) {
        this.msgExtras = msgExtras;
    }
}
