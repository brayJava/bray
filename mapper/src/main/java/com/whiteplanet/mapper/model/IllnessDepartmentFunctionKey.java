package com.whiteplanet.mapper.model;

public class IllnessDepartmentFunctionKey {
    private String illnessId;

    private String departmentFunctionId;

    public String getIllnessId() {
        return illnessId;
    }

    public void setIllnessId(String illnessId) {
        this.illnessId = illnessId == null ? null : illnessId.trim();
    }

    public String getDepartmentFunctionId() {
        return departmentFunctionId;
    }

    public void setDepartmentFunctionId(String departmentFunctionId) {
        this.departmentFunctionId = departmentFunctionId == null ? null : departmentFunctionId.trim();
    }
}