package com.whiteplanet.mapper.model;

import java.util.Date;

public class DoctorJoinClinic extends DoctorJoinClinicKey {
    private Integer status;

    private Date updateDate;

    private Date createDate;

    private String note;

    private Integer readflag;

    private Boolean apply;

    private Boolean invitation;

    private Boolean okApply;

    private Boolean okInvitation;

    public Boolean getOkApply() {
        return okApply;
    }

    public void setOkApply(Boolean okApply) {
        this.okApply = okApply;
    }

    public Boolean getOkInvitation() {
        return okInvitation;
    }

    public void setOkInvitation(Boolean okInvitation) {
        this.okInvitation = okInvitation;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getReadflag() {
        return readflag;
    }

    public void setReadflag(Integer readflag) {
        this.readflag = readflag;
    }

    public Boolean getApply() {
        return apply;
    }

    public void setApply(Boolean apply) {
        this.apply = apply;
    }

    public Boolean getInvitation() {
        return invitation;
    }

    public void setInvitation(Boolean invitation) {
        this.invitation = invitation;
    }
}