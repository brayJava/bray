package com.whiteplanet.config;

/**
 * @author:wuzhiyuan
 * @description: 通知跳转界面类型
 * @date: Created in 14:20 2017/12/26
 * @modified By:
 */
public interface PushExtrasType {
    String EXTRAS_TYPE = "type";
    /**
     * 证件审核通过
     */
    String CERTIFICATES_AUDIT_SUCCESS = "CERTIFICATES_AUDIT_SUCCESS";
    /**
     * 证件审核失败
     */
    String CERTIFICATES_AUDIT_FAIL = "CERTIFICATES_AUDIT_FAIL";
    /**
     * 审核不通过原因
     */
    String IDENTIFY_REMARKS = "identifyRemarks";

}
