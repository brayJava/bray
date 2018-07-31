package com.whiteplanet.mapper.model;

public class NeedsOrderInfo extends NeedsOrder {

    private String caseIllnessIllness;
    private String caseIllnessName;

    public String getCaseIllnessName() {
        return caseIllnessName;
    }

    public String getCaseIllnessIllness() {
        return caseIllnessIllness;
    }

    public void setCaseIllnessIllness(String caseIllnessIllness) {
        this.caseIllnessIllness = caseIllnessIllness;
    }

    public void setCaseIllnessName(String caseIllnessName) {
        this.caseIllnessName = caseIllnessName;
    }
}
