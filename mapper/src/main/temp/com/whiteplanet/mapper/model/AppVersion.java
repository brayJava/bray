package com.whiteplanet.mapper.model;

import java.util.Date;

public class AppVersion {
    private Integer id;

    private String version;

    private Byte isConstranintUpdate;

    private Date creatTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Byte getIsConstranintUpdate() {
        return isConstranintUpdate;
    }

    public void setIsConstranintUpdate(Byte isConstranintUpdate) {
        this.isConstranintUpdate = isConstranintUpdate;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}