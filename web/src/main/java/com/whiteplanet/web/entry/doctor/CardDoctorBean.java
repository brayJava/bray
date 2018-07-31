package com.whiteplanet.web.entry.doctor;

import com.whiteplanet.mapper.model.Doctor;
import com.whiteplanet.mapper.model.DoctorImage;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 医生主页医生信息
 * @date: Created in 14:38 2017/12/27
 * @modified By:
 */
public class CardDoctorBean {
    /**
     * 用户id
     */
    private String id;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 头像照片
     */
    private String faceImage;
    /**
     * 背景图片
     */
    private String bgImage;
    /**
     * 门诊标题信息
     */
    private String title;
    /**
     * 所属部门
     */
    private String department;
    /**
     * 治疗费用
     */
    private BigDecimal money;
    /**
     * 医院
     */
    private String hospital;
    /**
     * 医生介绍
     */
    private String node;
    /**
     * 医生积分
     */
    private BigDecimal credits;
    /**
     * 点赞数量
     */
    private Integer thumbsUp;
    /**
     * 审核状态
     */
    private Integer identifyStatus;
    /**
     * 审核备注
     */
    private String identifyRemarks;
    /**
     * 医生图片
     */
    private DoctorImage[] images;

    public CardDoctorBean() {
    }
    public CardDoctorBean(Doctor doctor, List<DoctorImage> doctorImages) {
        this.id = doctor.getId();
        this.name = doctor.getRealName();
        this.faceImage = doctor.getFaceimg();
        this.bgImage = doctor.getBgimg();
        this.title = doctor.getDepartmentName();
        this.department  = doctor.getDepartmentFunctionName();
        this.money = doctor.getTreatmentMoney();
        this.hospital = doctor.getHospitalName();
        this.node = doctor.getIntroduce();
        this.credits = doctor.getCredits();
        this.thumbsUp = doctor.getThumbsUp();
        this.identifyStatus = doctor.getIdentifyStatus();
        this.identifyRemarks = doctor.getIdentifyRemarks();
        this.images = CollectionUtils.isEmpty(doctorImages) ? new DoctorImage[]{} :
                doctorImages.toArray(new DoctorImage[doctorImages.size()]);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    public String getBgImage() {
        return bgImage;
    }

    public void setBgImage(String bgImage) {
        this.bgImage = bgImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public BigDecimal getCredits() {
        return credits;
    }

    public void setCredits(BigDecimal credits) {
        this.credits = credits;
    }

    public Integer getThumbsUp() {
        return thumbsUp;
    }

    public void setThumbsUp(Integer thumbsUp) {
        this.thumbsUp = thumbsUp;
    }

    public Integer getIdentifyStatus() {
        return identifyStatus;
    }

    public void setIdentifyStatus(Integer identifyStatus) {
        this.identifyStatus = identifyStatus;
    }

    public String getIdentifyRemarks() {
        return identifyRemarks;
    }

    public void setIdentifyRemarks(String identifyRemarks) {
        this.identifyRemarks = identifyRemarks;
    }

    public DoctorImage[] getImages() {
        return images;
    }

    public void setImages(DoctorImage[] images) {
        this.images = images;
    }
}





































