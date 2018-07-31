package com.whiteplanet.mapper.model;

import java.util.Date;

public class RecommendReasonShareDoctor {

    private String id;
    private String groupId;
    private String doctorId;
    private String recommendReasonId;
    private String recommendReasonDoctorName;
    private String recommendReason;
    private String from;
    private Integer source;
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getRecommendReasonId() {
        return recommendReasonId;
    }

    public void setRecommendReasonId(String recommendReasonId) {
        this.recommendReasonId = recommendReasonId;
    }

    public String getRecommendReasonDoctorName() {
        return recommendReasonDoctorName;
    }

    public void setRecommendReasonDoctorName(String recommendReasonDoctorName) {
        this.recommendReasonDoctorName = recommendReasonDoctorName;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
