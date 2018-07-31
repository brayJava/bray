package com.whiteplanet.mapper.model;

import java.util.Date;

public class ClinicInvocationStatistics {
    private Integer id;

    private Date time;

    private Integer invocationTotalCount;

    private Integer invocationRegisterCount;

    private String invocationSuccessPer;

    private Integer clinicAvgInvocation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getInvocationTotalCount() {
        return invocationTotalCount;
    }

    public void setInvocationTotalCount(Integer invocationTotalCount) {
        this.invocationTotalCount = invocationTotalCount;
    }

    public Integer getInvocationRegisterCount() {
        return invocationRegisterCount;
    }

    public void setInvocationRegisterCount(Integer invocationRegisterCount) {
        this.invocationRegisterCount = invocationRegisterCount;
    }

    public String getInvocationSuccessPer() {
        return invocationSuccessPer;
    }

    public void setInvocationSuccessPer(String invocationSuccessPer) {
        this.invocationSuccessPer = invocationSuccessPer == null ? null : invocationSuccessPer.trim();
    }

    public Integer getClinicAvgInvocation() {
        return clinicAvgInvocation;
    }

    public void setClinicAvgInvocation(Integer clinicAvgInvocation) {
        this.clinicAvgInvocation = clinicAvgInvocation;
    }
}