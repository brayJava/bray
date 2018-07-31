package com.whiteplanet.mapper.model;

import java.util.Date;

public class MessagePushHistory {
    private String id;

    private String doctorid;

    private String type;

    private String orderid;

    private String transid;

    private String receiveid;

    private String content;

    private String auditStatus;

    private String reason;

    private Date createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid == null ? null : doctorid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getTransid() {
        return transid;
    }

    public void setTransid(String transid) {
        this.transid = transid == null ? null : transid.trim();
    }

    public String getReceiveid() {
        return receiveid;
    }

    public void setReceiveid(String receiveid) {
        this.receiveid = receiveid == null ? null : receiveid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "MessagePushHistory{" +
                "id='" + id + '\'' +
                ", doctorid='" + doctorid + '\'' +
                ", type='" + type + '\'' +
                ", orderid='" + orderid + '\'' +
                ", transid='" + transid + '\'' +
                ", receiveid='" + receiveid + '\'' +
                ", content='" + content + '\'' +
                ", auditStatus='" + auditStatus + '\'' +
                ", reason='" + reason + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}