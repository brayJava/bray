package com.whiteplanet.mapper.data;

import com.whiteplanet.mapper.model.Doctor;

import java.util.Date;

/**
 * @author:wuzhiyuan
 * @description: 医生用户与证件映射类
 * @date: Created in 0:11 2017/12/2
 * @modified By:
 */
public class DoctorCertificatesBean extends Doctor {
    /**
     * 证件更新时间
     */
    private Date uploadDate;
    /**
     * 身份证号
     * @return
     */
    private String idcardNum;
    /**
     * 执照类型
     * @return
     */
    private String licenseType;
    /**
     * 执照编码
     * @return
     */
    private String licenseCode;

    public String getIdcardNum() {
        return idcardNum;
    }

    public void setIdcardNum(String idcardNum) {
        this.idcardNum = idcardNum;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getLicenseCode() {
        return licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }
}
