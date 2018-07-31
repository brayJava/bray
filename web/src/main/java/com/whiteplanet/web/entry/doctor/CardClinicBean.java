package com.whiteplanet.web.entry.doctor;

import com.whiteplanet.mapper.model.Clinic;
import com.whiteplanet.mapper.model.ClinicImage;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:wuzhiyuan
 * @description: 医生主页诊所信息
 * @date: Created in 9:41 2017/12/28
 * @modified By:
 */
public class CardClinicBean {
    /**
     * 诊所id
     */
    private String id;
    /**
     * 诊所名称
     */
    private String name;
    /**
     * 诊所医生关联数量
     */
    private Integer doctorCount;
    /**
     * 医生关联数量
     */
    private Integer doctorRef;
    /**
     * 医生行业
     */
    private Integer doctorRecive;
    /**
     * 部门数量
     */
    private Integer departmentCount;
    /**
     * 诊所理念
     */
    private String note;
    /**
     * 营业天数
     */
    private Integer businessDay;
    /**
     * 诊所图片
     */
    private List<ClinicImage> clinicImages;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getBusinessDay() {
        return businessDay;
    }

    public void setBusinessDay(Integer businessDay) {
        this.businessDay = businessDay;
    }

    public List<ClinicImage> getClinicImages() {
        return clinicImages;
    }

    public void setClinicImages(List<ClinicImage> clinicImages) {
        this.clinicImages = clinicImages;
    }

    public CardClinicBean() {
    }
    public CardClinicBean(Clinic clinic,List<ClinicImage> clinicImages) {
        this.id = clinic.getId();
        this.name = clinic.getName();
        this.doctorCount = clinic.getDoctorCount();
        this.doctorRef = clinic.getDoctorRefCount();
        this.doctorRecive = clinic.getDoctorReciveCount();
        this.departmentCount = clinic.getDoctorDepartmentCount();
        this.note = clinic.getNote();
        this.businessDay = clinic.getBusinessDay();
        this.clinicImages = CollectionUtils.isEmpty(clinicImages) ? new ArrayList<>() : clinicImages;
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

    public Integer getDoctorCount() {
        return doctorCount;
    }

    public void setDoctorCount(Integer doctorCount) {
        this.doctorCount = doctorCount;
    }

    public Integer getDoctorRef() {
        return doctorRef;
    }

    public void setDoctorRef(Integer doctorRef) {
        this.doctorRef = doctorRef;
    }

    public Integer getDoctorRecive() {
        return doctorRecive;
    }

    public void setDoctorRecive(Integer doctorRecive) {
        this.doctorRecive = doctorRecive;
    }

    public Integer getDepartmentCount() {
        return departmentCount;
    }

    public void setDepartmentCount(Integer departmentCount) {
        this.departmentCount = departmentCount;
    }
}
