package com.whiteplanet.mapper.data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by ningchengzeng on 2017/7/20.
 */
public class DoctorReceiveBean {
    private BigDecimal money;
    private Date createDate;
    private String doctorName;
    private String patientName;
    private String refDoctorName;
    private Boolean ref;

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getRefDoctorName() {
        return refDoctorName;
    }

    public void setRefDoctorName(String refDoctorName) {
        this.refDoctorName = refDoctorName;
    }

    public Boolean getRef() {
        return ref;
    }

    public void setRef(Boolean ref) {
        this.ref = ref;
    }
}
