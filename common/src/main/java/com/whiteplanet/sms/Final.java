package com.whiteplanet.sms;

import java.text.SimpleDateFormat;

public interface Final {

    String PARAM_TOKEN = "token";
    String PARAM_ACCOUNT = "param_account";

    Integer DEL_TRUE = 1;   //删除标识

    Integer PERSONAL_ADD = 1; //个人添加

    /*--------------短信验证码相关----------------*/
    String SYS_FIND_PWD = "retrievePasswordVerification";//找回密码
    String SYS_REG = "registrationVerification";//注册
    String SYS_CHANGE_CASH_PWD = "provePasswordChangesVerification";//提现密码修改
    String SYS_BANDING_BANKCARD = "bundledBankCardVerification";//绑定银行卡
    String SYS_USER_CER_AUDIT_PASS = "doctorUserCerAuditPassVerification"; //用户证件审核通过
    String SYS_USER_CER_AUDIT_FAIL = "doctorUserCerAuditFailVerification"; //用户证件审核失败
    Integer SMS_TYPE_REG = 1;
    Integer SMS_TYPE_FIND_PWD = 2;

    String SMS_CODE_731 = "smsCode731";
    String SMS_CODE_732 = "smsCode732";
    String SMS_CODE_721 = "smsCode721";
    String SMS_CODE_722 = "smsCode722";
    String SMS_CODE_8111 = "smsCode8111";
    String SMS_CODE_8112 = "smsCode8112";
    String SMS_CODE_1412= "smsCode1412";
    String SMS_CODE_1413 = "smsCode1413";
    String SMS_CODE_1421 = "smsCode1421";
    String SMS_CODE_1442 = "smsCode1442";
    String SMS_CODE_1443 = "smsCode1443";
    String SMS_CODE_1444 = "smsCode1444";
    String SMS_CODE_1445 = "smsCode1445";
    String SMS_CODE_1451 = "smsCode1451";
    String SMS_CODE_1452 = "smsCode1452";

    String ATTR_ACCOUNT = "account";
    //日期
    SimpleDateFormat DATE_YYYYMMDD = new SimpleDateFormat("yyyyMMdd");

    //身份证
    String IDCARD = "IDCARD";
    String IDCARD_BACK = "IDCARD_B";
    String IDCARD_FRONT = "IDCARD_F";
    //工作证
    String WORKCARD = "WORKCARD";

    //资格证
    String PHYSICIA = "PHYSICIA";
    String PHYSICIA_BACK = "PHYSICIA_B";
    String PHYSICIA_FRONT = "PHYSICIA_F";

    //身份审核状态
    Integer ID_CHECK_STATUS_UNCHECK = 0;
    Integer ID_CHECK_STATUS_WAITING = 1;
    Integer ID_CHECK_STATUS_SUCCESS = 2;
    Integer ID_CHECK_STATUS_FAILED = 3;

    //部门CODE
    String PHYSICIAN_CODE = "A01";  //医师
    String TECHNICIAN_CODE = "A02"; //技师
    String NURSE_CODE = "A03";  //护士
    String PHARMACIST_CODE = "A04"; //药师
    String ADMINISTRATION_CODE = "A05"; //行政

    //看病类型
    Integer TREAT_TYPE_OP = 0;    //门诊看
    Integer TREAT_TYPE_PR = 1;    //病房看
    Integer TREAT_TYPE_OTHER = 2;    //其他
    //推送信息说明
    String PUSH_AUDIT_SUCCESS_ALERT = "你的实名认证已通过，点击进入诊所";
    String PUSH_AUDIT_FAIL_ALERT = "你的实名认证未通过，点击查看原因";
}
