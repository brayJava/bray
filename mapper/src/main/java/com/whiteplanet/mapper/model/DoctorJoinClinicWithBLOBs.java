package com.whiteplanet.mapper.model;

public class DoctorJoinClinicWithBLOBs extends DoctorJoinClinic {
    private String applyNote;

    private String invitationNote;

    public String getApplyNote() {
        return applyNote;
    }

    public void setApplyNote(String applyNote) {
        this.applyNote = applyNote == null ? null : applyNote.trim();
    }

    public String getInvitationNote() {
        return invitationNote;
    }

    public void setInvitationNote(String invitationNote) {
        this.invitationNote = invitationNote == null ? null : invitationNote.trim();
    }
}