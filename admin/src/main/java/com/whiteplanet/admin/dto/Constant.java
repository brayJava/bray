package com.whiteplanet.admin.dto;

import java.io.Serializable;

/**
 * @author:wuzhiyuan
 * @description: 常量定义
 * @date: Created in 10:25 2017/12/6
 * @modified By:
 */
public class Constant implements Serializable{
    private static final long serialVersionUID = -7999236004605096989L;
    /**
     * 首页view
     */
    public static final String index = "index";
    /**
     * 用户详情列表view
     */
    public static final String INDEXLIST_T = "indexListT";
    /**
     * 表格布局view
     */
    public static final String LAYOUT = "layout";
    /**
     * 默认查看待审核的医生用户
     */
    public static final String  WAIT_AUDIT = "5";
    /**
     * 管理员登入对象常量
     */
    public static final String  ADMIN_USER = "adminUser";
    /**
     *  页面对象常量
     */
    public static final String  PAGEINFO = "pageInfo";
    /**
     *  页面对象dto常量
     */
    public static final String  PAGEINFO_DTO = "pageInfoDto";
    /**
     *  意思用户列表dto常量
     */
    public static final String  DOCTORDTOS = "doctorDtos";
    /**
     *  集合常量
     */
    public static final String  LIST = "list";
    /**
     * 证件照默认类型
     */
    public  static final  String DEFAULT_PATH = "00001";
    /**
     * 用户反馈信息列表dto常量
     */
    public  static final  String DOCTOR_FEEDBACK_DTOS = "doctorFeedBackDtos";
    /**
     * 版本更新信息列表dto常量
     */
    public  static final  String APP_VERSION_DTOS = "appVersions";
    /**
     * 版本更新信息列表dto常量
     */
    public  static final  String APP_SMS_DTOS = "appSmsDtos";
}
