package com.whiteplanet.web.entry.doctor;

/**
 * @author:wuzhiyuan
 * @description: 诊所详情界面
 * @date: Created in 16:18 2017/12/21
 * @modified By:
 */
public class ClinicDetailBean {
    /**
     * 诊所理念标签
     */
    private String note;
    /**
     * 诊所姓名
     */
    private String name;
    /**
     *诊所照片数量
     */
    private Integer clinicImageCount;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClinicImageCount() {
        return clinicImageCount;
    }

    public void setClinicImageCount(Integer clinicImageCount) {
        this.clinicImageCount = clinicImageCount;
    }
}
