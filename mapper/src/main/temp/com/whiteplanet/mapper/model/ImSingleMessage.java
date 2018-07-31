package com.whiteplanet.mapper.model;

import java.util.Date;

public class ImSingleMessage {
    private Long id;

    private String fromType;

    private String fromId;

    private Date createTime;

    private String fromAppkey;

    private String targetType;

    private String msgExtras;

    private String msgText;

    private String msgType;

    private String msgRichmediaPath;

    private String localRechmediaPath;

    private String fromPlatform;

    private String targetId;

    private String version;

    private String msgid;

    private Date msgCtime;

    private String msgLevel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType == null ? null : fromType.trim();
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId == null ? null : fromId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFromAppkey() {
        return fromAppkey;
    }

    public void setFromAppkey(String fromAppkey) {
        this.fromAppkey = fromAppkey == null ? null : fromAppkey.trim();
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType == null ? null : targetType.trim();
    }

    public String getMsgExtras() {
        return msgExtras;
    }

    public void setMsgExtras(String msgExtras) {
        this.msgExtras = msgExtras == null ? null : msgExtras.trim();
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText == null ? null : msgText.trim();
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType == null ? null : msgType.trim();
    }

    public String getMsgRichmediaPath() {
        return msgRichmediaPath;
    }

    public void setMsgRichmediaPath(String msgRichmediaPath) {
        this.msgRichmediaPath = msgRichmediaPath == null ? null : msgRichmediaPath.trim();
    }

    public String getLocalRechmediaPath() {
        return localRechmediaPath;
    }

    public void setLocalRechmediaPath(String localRechmediaPath) {
        this.localRechmediaPath = localRechmediaPath == null ? null : localRechmediaPath.trim();
    }

    public String getFromPlatform() {
        return fromPlatform;
    }

    public void setFromPlatform(String fromPlatform) {
        this.fromPlatform = fromPlatform == null ? null : fromPlatform.trim();
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId == null ? null : targetId.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid == null ? null : msgid.trim();
    }

    public Date getMsgCtime() {
        return msgCtime;
    }

    public void setMsgCtime(Date msgCtime) {
        this.msgCtime = msgCtime;
    }

    public String getMsgLevel() {
        return msgLevel;
    }

    public void setMsgLevel(String msgLevel) {
        this.msgLevel = msgLevel == null ? null : msgLevel.trim();
    }
}