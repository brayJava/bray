package com.whiteplanet.web.entry.doctor;

/**
 * @author:wuzhiyuan
 * @description: 医生诊所照片上传参bean
 * @date: Created in 11:15 2017/12/25
 * @modified By:
 */
public class DoctorClinicImageBean {
    /**
     * base64编码
     */
    private String base64;
    /**
     * 排序方式
     */
    private Integer sort;

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
