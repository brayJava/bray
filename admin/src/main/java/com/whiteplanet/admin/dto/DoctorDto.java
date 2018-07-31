package com.whiteplanet.admin.dto;
import com.whiteplanet.mapper.data.DoctorCertificatesBean;
import com.whiteplanet.mapper.model.Certificates;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * @author:wuzhiyuan
 * @description: 医生对于的身份证件相关dto
 * @date: Created in 17:21 2017/11/26
 * @modified By:
 */
public class DoctorDto implements Serializable{

    private static final long serialVersionUID = 4360772498287283749L;
    /**
     * 医生用户信息
     */
    private DoctorCertificatesBean doctorCertificatesBean;
    /**
     * 所有证件相关集合
     */
    private List<Certificates> certificates;
    /**
     *  证件存放路径
     */
    private CertificatePathDto certificatePathDto;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 比较时间
     * @return
     */
    private Date compareTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Date getCompareTime() {
        return compareTime;
    }

    public void setCompareTime(Date compareTime) {
        this.compareTime = compareTime;
    }

    public CertificatePathDto getCertificatePathDto() {
        return certificatePathDto;
    }

    public void setCertificatePathDto(CertificatePathDto certificatePathDto) {
        this.certificatePathDto = certificatePathDto;
    }
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public DoctorCertificatesBean getDoctorCertificatesBean() {
        return doctorCertificatesBean;
    }

    public void setDoctorCertificatesBean(DoctorCertificatesBean doctorCertificatesBean) {
        this.doctorCertificatesBean = doctorCertificatesBean;
    }

    public List<Certificates> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificates> certificates) {
        this.certificates = certificates;
    }
}
