package com.whiteplanet.mapper.model;

import java.util.Date;

public class MessageLog {
    private Integer id;

    private String messageQueueInt;

    private String messageTemplateId;

    private String code;

    private Date createDate;

    private Integer kinde;

    private Integer objectKide;

    private String objectId;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessageQueueInt() {
        return messageQueueInt;
    }

    public void setMessageQueueInt(String messageQueueInt) {
        this.messageQueueInt = messageQueueInt == null ? null : messageQueueInt.trim();
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

    public Integer getKinde() {
        return kinde;
    }

    public void setKinde(Integer kinde) {
        this.kinde = kinde;
    }

    public Integer getObjectKide() {
        return objectKide;
    }

    public void setObjectKide(Integer objectKide) {
        this.objectKide = objectKide;
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