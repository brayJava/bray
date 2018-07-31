package com.whiteplanet.mapper.model;

import java.util.Date;

public class CaseIllnessInfo {
    private String id;

    private String caseIllnessId;

    private String illness;

    private String notes;

    private Date createDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCaseIllnessId() {
        return caseIllnessId;
    }

    public void setCaseIllnessId(String caseIllnessId) {
        this.caseIllnessId = caseIllnessId == null ? null : caseIllnessId.trim();
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness == null ? null : illness.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}