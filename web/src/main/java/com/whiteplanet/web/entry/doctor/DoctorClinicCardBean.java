package com.whiteplanet.web.entry.doctor;

import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 医生主页信息
 * @date: Created in 14:34 2017/12/27
 * @modified By:
 */
public class DoctorClinicCardBean {
    /**
     * 医生主页医生信息
     */
    private CardDoctorBean doctor;
    /**
     * 医生主页诊所信息
     */
    private CardClinicBean clinic;
    /**
     * 医生擅长疾病项目
     */
    private List<CardIllnessBean> illness;
    /**
     * 门诊信息
     */
    private List<CardOutPatientBean> outpatient;

    public DoctorClinicCardBean() {
    }

    public DoctorClinicCardBean(CardDoctorBean doctor, CardClinicBean clinic, List<CardIllnessBean> illness, List<CardOutPatientBean> outpatient) {
        this.doctor = doctor;
        this.clinic = clinic;
        this.illness = illness;
        this.outpatient = outpatient;
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

    public List<CardIllnessBean> getIllness() {
        return illness;
    }

    public void setIllness(List<CardIllnessBean> illness) {
        this.illness = illness;
    }

    public List<CardOutPatientBean> getOutpatient() {
        return outpatient;
    }

    public void setOutpatient(List<CardOutPatientBean> outpatient) {
        this.outpatient = outpatient;
    }
}
