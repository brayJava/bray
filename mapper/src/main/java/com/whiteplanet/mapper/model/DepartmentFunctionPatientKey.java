package com.whiteplanet.mapper.model;

public class DepartmentFunctionPatientKey {
    private String departmentFunctionId;

    private String labelNotesId;

    public String getDepartmentFunctionId() {
        return departmentFunctionId;
    }

    public void setDepartmentFunctionId(String departmentFunctionId) {
        this.departmentFunctionId = departmentFunctionId == null ? null : departmentFunctionId.trim();
    }

    public String getLabelNotesId() {
        return labelNotesId;
    }

    public void setLabelNotesId(String labelNotesId) {
        this.labelNotesId = labelNotesId == null ? null : labelNotesId.trim();
    }
}