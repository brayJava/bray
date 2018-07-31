package com.whiteplanet.web.entry;

/**
 * @Author: HeWei
 * @Description:
 * @Date: Created in 9:35 2017
 * @Modified By:
 */
public class VerificationCodeBean {
    private boolean doctor;    //是否医生端
    private String phone;      //手机号码
    private Integer smsType;        //短信类型

    public boolean isDoctor() {
        return doctor;
    }

    public void setDoctor(boolean doctor) {
        this.doctor = doctor;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSmsType() {
        return smsType;
    }

    public void setSmsType(Integer smsType) {
        this.smsType = smsType;
    }
}
