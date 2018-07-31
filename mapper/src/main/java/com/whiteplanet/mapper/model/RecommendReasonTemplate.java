package com.whiteplanet.mapper.model;

import java.util.Date;

public class RecommendReasonTemplate {

    private String id;
    private String doctorName;
    private String recommendReasonId;
    private String recommendReason;
    private String from;
    private Integer source;
    private Boolean enable;
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getRecommendReasonId() {
        return recommendReasonId;
    }

    public void setRecommendReasonId(String recommendReasonId) {
        this.recommendReasonId = recommendReasonId;
    }

    public String getRecommendReason() {
        return recommendReason;
    }

    public void setRecommendReason(String recommendReason) {
        this.recommendReason = recommendReason;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
