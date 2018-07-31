package com.whiteplanet.admin.dto;

import java.io.Serializable;

/**
 * @author:wuzhiyuan
 * @description: 证件照类型封装类dto
 * @date: Created in 8:56 2017/11/30
 * @modified By:
 */
public class CertificatePathDto implements Serializable{
    /**
     *  身份证证明照
     */
    private String idCardF;
    /**
     * 身份证反面照
     */
    private String idCardB;
    /**
     * 医生执照证明照
     */
    private String physicilF;
    /**
     * 医生执照反面照
     */
    private String physicilB;
    /**
     * 医生工作证
     */
    private String card;

    public CertificatePathDto() {
    }

    public CertificatePathDto(String idCardF, String idCardB, String physicilF, String physicilB,String card) {
        this.idCardF = idCardF;
        this.idCardB = idCardB;
        this.physicilF = physicilF;
        this.physicilB = physicilB;
        this.card = card;
    }

    public String getIdCardF() {
        return idCardF;
    }

    public void setIdCardF(String idCardF) {
        this.idCardF = idCardF;
    }

    public String getIdCardB() {
        return idCardB;
    }

    public void setIdCardB(String idCardB) {
        this.idCardB = idCardB;
    }

    public String getPhysicilF() {
        return physicilF;
    }

    public void setPhysicilF(String physicilF) {
        this.physicilF = physicilF;
    }

    public String getPhysicilB() {
        return physicilB;
    }

    public void setPhysicilB(String physicilB) {
        this.physicilB = physicilB;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
