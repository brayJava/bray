package com.whiteplanet.utils;

/**
* <p>File:HttpCode </p>
* <p>Description: http status 基本状态码常量</p>
* @date 2017/9/11 11:23
* @version 1.0
*/
public class HttpCode {
    /** http response status success **/
    public static final int HTTP_200=200;
    /** http response status，request error **/
    public static final int HTTP_400=400;
    /** http response status，no auth **/
    public static final int HTTP_403=403;

    public static final int HTTP_404=404;
    public static final int HTTP_405=405;

    /** Duplicate data processing **/
    public static final int HTTP_423=423;

    /** http response status，Service internal error  **/
    public static final int HTTP_500=500;
    public static final int HTTP_503=503;
    /*** timeout ****/
    public static final int HTTP_504=504;


    /** 成功 **/
    public static final int HTTP_2000=2000;
    /** 权限不足 **/
    public static final int HTTP_2003=2003;
    /** 对象为空 **/
    public static final int HTTP_2004=2004;

    /** 用户已经被逻辑移除 **/
    public static final int HTTP_4002=4002;

    /** 无权访问、权限不足 **/
    public static final int HTTP_4003=4003;
        /** 无权访问、请使用正确的请求方式(get/post) **/
        public static final int HTTP_40031=40031;


    /** 无法对当前路由 进行寻址请求 **/
    public static final int HTTP_4004=4004;

    /** 服务器内部错误 **/
    public static final int HTTP_5000=5000;
    /** 没有找到对应服务处理 **/
    public static final int HTTP_5003=5003;
    /** 服务器请求超时 **/
    public static final int HTTP_5004=5004;
}