package com.whiteplanet.mapper.model;

import java.util.Date;

public class DepartmentFunctionPatient extends DepartmentFunctionPatientKey {
    private Date createTime;

    private Integer status;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}