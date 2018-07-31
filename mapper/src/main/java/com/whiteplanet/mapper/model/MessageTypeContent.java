package com.whiteplanet.mapper.model;

public class MessageTypeContent {
    private Integer id;

    private Integer msgWordType;

    private String msgWordContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMsgWordType() {
        return msgWordType;
    }

    public void setMsgWordType(Integer msgWordType) {
        this.msgWordType = msgWordType;
    }

    public String getMsgWordContent() {
        return msgWordContent;
    }

    public void setMsgWordContent(String msgWordContent) {
        this.msgWordContent = msgWordContent == null ? null : msgWordContent.trim();
    }
}