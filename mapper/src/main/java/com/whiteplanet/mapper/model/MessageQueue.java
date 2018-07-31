package com.whiteplanet.mapper.model;

import java.util.Date;

public class MessageQueue {
    private String id;

    private String messageTemplateId;

    private String code;

    private Date createDate;

    private Date sendDate;

    private Integer status;

    private Date updateDate;

    private Integer kinde;

    private Integer objectKinde;

    private String objectId;

    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMessageTemplateId() {
        return messageTemplateId;
    }

    public void setMessageTemplateId(String messageTemplateId) {
        this.messageTemplateId = messageTemplateId == null ? null : messageTemplateId.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getKinde() {
        return kinde;
    }

    public void setKinde(Integer kinde) {
        this.kinde = kinde;
    }

    public Integer getObjectKinde() {
        return objectKinde;
    }

    public void setObjectKinde(Integer objectKinde) {
        this.objectKinde = objectKinde;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}