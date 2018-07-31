package com.whiteplanet.mapper.model;

public class CaseIllnessFileKey {
    private String caseIllnessInfoId;

    private String pubFileId;

    public String getCaseIllnessInfoId() {
        return caseIllnessInfoId;
    }

    public void setCaseIllnessInfoId(String caseIllnessInfoId) {
        this.caseIllnessInfoId = caseIllnessInfoId == null ? null : caseIllnessInfoId.trim();
    }

    public String getPubFileId() {
        return pubFileId;
    }

    public void setPubFileId(String pubFileId) {
        this.pubFileId = pubFileId == null ? null : pubFileId.trim();
    }
}