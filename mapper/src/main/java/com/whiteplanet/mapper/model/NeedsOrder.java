package com.whiteplanet.mapper.model;

import java.util.Date;

public class NeedsOrder {
    private String id;

    private String dockerId;

    private String caseIllnessId;

    private Integer status;

    private Integer cancel;

    private Boolean pay;

    private Boolean ref;

    private Date cancelDate;

    private Date createTime;

    private Date updateDate;

    private String cancelReason;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDockerId() {
        return dockerId;
    }

    public void setDockerId(String dockerId) {
        this.dockerId = dockerId == null ? null : dockerId.trim();
    }

    public String getCaseIllnessId() {
        return caseIllnessId;
    }

    public void setCaseIllnessId(String caseIllnessId) {
        this.caseIllnessId = caseIllnessId == null ? null : caseIllnessId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCancel() {
        return cancel;
    }

    public void setCancel(Integer cancel) {
        this.cancel = cancel;
    }

    public Boolean getPay() {
        return pay;
    }

    public void setPay(Boolean pay) {
        this.pay = pay;
    }

    public Boolean getRef() {
        return ref;
    }

    public void setRef(Boolean ref) {
        this.ref = ref;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }
}