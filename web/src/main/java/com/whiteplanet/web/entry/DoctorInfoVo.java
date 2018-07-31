package com.whiteplanet.web.entry;

import java.math.BigDecimal;

/**
 * @Author: HeWei
 * @Description:
 * @Date: Created in 11:44 2017
 * @Modified By:
 */
public class DoctorInfoVo {

    private String departmentId;                //职称id

    private String getDepartmentName;           //职称名称

    private String departmentFunctionId;        //科室id

    private String departmentFunctionName;      //科室名称

    private String hospitalName;                //医院名称

    private String hospitalId;                  //医院id

    private String realName;                    //真实姓名

    private BigDecimal treatmentMoney;          //诊费

    private Integer sex;                        //性别

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getGetDepartmentName() {
        return getDepartmentName;
    }

    public void setGetDepartmentName(String getDepartmentName) {
        this.getDepartmentName = getDepartmentName;
    }

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

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public BigDecimal getTreatmentMoney() {
        return treatmentMoney;
    }

    public void setTreatmentMoney(BigDecimal treatmentMoney) {
        this.treatmentMoney = treatmentMoney;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
