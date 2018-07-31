package com.whiteplanet.web.entry;

/**
 * @Author: HeWei
 * @Description:
 * @Date: Created in 13:52 2017
 * @Modified By:
 */
public class ForgotPasswordBean {
    private String phoneNo;

    private String verificationCode;

    private String newPassword;

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
