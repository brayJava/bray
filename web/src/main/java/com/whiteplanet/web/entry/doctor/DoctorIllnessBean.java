package com.whiteplanet.web.entry.doctor;

/**
 * @author:wuzhiyuan
 * @description: 医生擅长的疾病bean
 * @date: Created in 10:13 2017/12/26
 * @modified By:
 */
public class DoctorIllnessBean {
    /**
     * 功能科室id
     */
    private String departmentFunctionId;
    /**
     * 功能科室名称
     */
    private String departmentFunctionName;
    /**
     * 疾病名称bean
     */
    private IllnessBean illness;

    public String getDepartmentFunctionId() {
        return departmentFunctionId;
    }

    public void setDepartmentFunctionId(String departmentFunctionId) {
        this.departmentFunctionId = departmentFunctionId;
    }

    public String getDepartmentFunctionName() {
        return departmentFunctionName;
    }

    public void setDepartmentFunctionName(String departmentFunctionName) {
        this.departmentFunctionName = departmentFunctionName;
    }

    public IllnessBean getIllness() {
        return illness;
    }

    public void setIllness(IllnessBean illness) {
        this.illness = illness;
    }
}
