package com.whiteplanet.mapper.data;

import java.util.Date;

/**
 *
 */
public class OrderIllnessBean {
    private Date time;
    private String orderId;
    private String needsOrderId;
    private String illnessId;
    private String refDoctorId;
    private Boolean ref;
    private String name;
    private Integer age;
    private Boolean sex;
    private String phone;
    private String illness;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRefDoctorId() {
        return refDoctorId;
    }

    public void setRefDoctorId(String refDoctorId) {
        this.refDoctorId = refDoctorId;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getNeedsOrderId() {
        return needsOrderId;
    }

    public void setNeedsOrderId(String needsOrderId) {
        this.needsOrderId = needsOrderId;
    }

    public String getIllnessId() {
        return illnessId;
    }

    public void setIllnessId(String illnessId) {
        this.illnessId = illnessId;
    }

    public Boolean getRef() {
        return ref;
    }

    public void setRef(Boolean ref) {
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
