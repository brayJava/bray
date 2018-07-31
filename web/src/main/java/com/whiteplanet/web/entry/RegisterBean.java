package com.whiteplanet.web.entry;

/**
 * @Author: HeWei
 * @Description: 注册请求参数实体类
 * @Date: Created in 17:04 2017
 * @Modified By:
 */
public class RegisterBean {
    private String phoneNo;

    private String password;

    private String verificationCode;

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
