package com.whiteplanet.web.entry.doctor;

import com.whiteplanet.mapper.model.Clinic;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author:wuzhiyuan
 * @description:  返回诊所相关信息类
 * @date: Created in 18:13 2017/12/20
 * @modified By:
 */
public class ClinicInfoBean implements Serializable {
    /**
     * 医生信息
     */
    private DoctorClinicBean doctor;
    /**
     * 判断医生是否有诊所
     */
    private Boolean hasClinic;
    /**
     * 营业天数
     */
    private Integer businessDay;
    /**
     * 诊所创建时期
     */
    private Date createDate;
    /**
     * 诊所名称
     */
    private String name;
    /**
     * 诊所id
     */
    private String clinicId;
    /**
     * 诊所语录
     */
    private String notes;
    /**
     * 诊所是否开业
     */
    private Boolean isOpen;

    public ClinicInfoBean() {
    }
    public ClinicInfoBean(Clinic clinic) {
        this.hasClinic = true;
        this.businessDay = Objects.isNull(clinic) ? null :clinic.getBusinessDay();
        this.createDate = Objects.isNull(clinic) ? null : clinic.getCreateDate();
        this.name = Objects.isNull(clinic) ? null : clinic.getName();
        this.clinicId = Objects.isNull(clinic) ? null : clinic.getId();
        this.notes = clinic.getNote();
        this.isOpen = clinic.getBusiness();


    }
    public DoctorClinicBean getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorClinicBean doctor) {
        this.doctor = doctor;
    }

    public Boolean getHasClinic() {
        return hasClinic;
    }

    public void setHasClinic(Boolean hasClinic) {
        this.hasClinic = hasClinic;
    }

    public Integer getBusinessDay() {
        return businessDay;
    }

    public void setBusinessDay(Integer businessDay) {
        this.businessDay = businessDay;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }
}
