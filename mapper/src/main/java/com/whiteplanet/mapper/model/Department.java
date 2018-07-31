package com.whiteplanet.mapper.model;

import java.util.Date;

public class Department {
    private String id;

    private String code;

    private String name;

    private String pid;

    private Integer minMoney;

    private Integer maxMoney;

    private Boolean coustom;

    private Integer status;

    private Integer useCount;

    private Date createDate;

    private Date updateDate;

    private Boolean visiting;

    public Boolean getVisiting() {
        return visiting;
    }

    public void setVisiting(Boolean visiting) {
        this.visiting = visiting;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Integer getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(Integer minMoney) {
        this.minMoney = minMoney;
    }

    public Integer getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(Integer maxMoney) {
        this.maxMoney = maxMoney;
    }

    public Boolean getCoustom() {
        return coustom;
    }

    public void setCoustom(Boolean coustom) {
        this.coustom = coustom;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}