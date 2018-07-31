package com.whiteplanet.web.entry.doctor;

/**
 * @author:wuzhiyuan
 * @description: 他人主页卡片
 * @date: Created in 17:32 2017/12/28
 * @modified By:
 */
public class OtherDoctorClinicCardBean {
    /**
     * 他人主页用户信息
     */
    private CardDoctorBean doctor;
    /**
     * 他人主页诊所信息
     */
    private CardClinicBean clinic;
    /**
     * 他人用户合伙人信息
     */
    private PartnerBean partner;
    /**
     * 合伙人申请/邀请关系
     */
    private IsPartner status;

    public OtherDoctorClinicCardBean() {
    }

    public OtherDoctorClinicCardBean(CardDoctorBean doctor, CardClinicBean clinic, PartnerBean partner, IsPartner status) {
        this.doctor = doctor;
        this.clinic = clinic;
        this.partner = partner;
        this.status = status;
    }

    public CardDoctorBean getDoctor() {
        return doctor;
    }

    public void setDoctor(CardDoctorBean doctor) {
        this.doctor = doctor;
    }

    public CardClinicBean getClinic() {
        return clinic;
    }

    public void setClinic(CardClinicBean clinic) {
        this.clinic = clinic;
    }

    public PartnerBean getPartner() {
        return partner;
    }

    public void setPartner(PartnerBean partner) {
        this.partner = partner;
    }

    public IsPartner getStatus() {
        return status;
    }

    public void setStatus(IsPartner status) {
        this.status = status;
    }
}
