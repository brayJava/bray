package com.whiteplanet.mapper.model;

public class PatientDepartmentIllnessKey {
    private String patientRecommendDoctorId;

    private String labelNotesId;

    public String getPatientRecommendDoctorId() {
        return patientRecommendDoctorId;
    }

    public void setPatientRecommendDoctorId(String patientRecommendDoctorId) {
        this.patientRecommendDoctorId = patientRecommendDoctorId == null ? null : patientRecommendDoctorId.trim();
    }

    public String getLabelNotesId() {
        return labelNotesId;
    }

    public void setLabelNotesId(String labelNotesId) {
        this.labelNotesId = labelNotesId == null ? null : labelNotesId.trim();
    }
}