package com.whiteplanet.common.exception;


import com.whiteplanet.utils.HttpCode;

import java.util.HashMap;
import java.util.Map;

/**
* <p>File:ReturnResult </p>
* <p>Description:
 * 错误代码汇总枚举
 * 所有错误代码及其描述统一都在这个枚举上添加，统一管理，方便查看，并与BizException联合使用
 * </p>
* @date 2017/9/11 11:19
* @version 1.0
*/
public final class ReturnResult {
    //返回结果
    public static final ReturnResult RESULT_SUCCESS = new ReturnResult(HttpCode.HTTP_200,"0", "成功");
    public static final ReturnResult RESULT_ERROR = new ReturnResult(HttpCode.HTTP_400,"-1", "失败");
    public static final ReturnResult RESULT_NONE = new ReturnResult(HttpCode.HTTP_200,"-2", "无数据");
    public static final ReturnResult DATA_EXIST = new ReturnResult(HttpCode.HTTP_200,"-3", "数据已存在");
    //用户相关
    public static final ReturnResult USER_EXIST = new ReturnResult(HttpCode.HTTP_400,"130", "用户已存在");
    public static final ReturnResult PHONE_NONE = new ReturnResult(HttpCode.HTTP_404,"132", "用户不存在");
    public static final ReturnResult PASSWORD_WRONG = new ReturnResult(HttpCode.HTTP_404,"133", "密码错误");
    //验证码相关
    public static final  ReturnResult CODE_SENDED = new ReturnResult(HttpCode.HTTP_200, "111","验证码已发送，请稍后重试");
    public static final  ReturnResult WRONG_CODE = new ReturnResult(HttpCode.HTTP_200, "116","验证码错误");
    public static final  ReturnResult OVERTIME_CODE = new ReturnResult(HttpCode.HTTP_200, "115","验证码已过期");

    public static final  ReturnResult UPLOAD_FAILED = new ReturnResult(HttpCode.HTTP_400, "200","文件上传失败");


    //诊所相关
    public static final  ReturnResult NONE_CLINIC = new ReturnResult(HttpCode.HTTP_200, "201","无诊所信息");
    public static final  ReturnResult NO_DEPARTMENT_VISITING = new ReturnResult(HttpCode.HTTP_200, "202","该部门无法接诊");
    public static final  ReturnResult NO_CERTICATES_VISITING = new ReturnResult(HttpCode.HTTP_200, "203","实名认证没有通过，无法开启");

    //医院相关
    public static final  ReturnResult HOSPITAL_DATA_EXIST = new ReturnResult(HttpCode.HTTP_400, "201","医院名称已存在");







    private int httpStatus;
    private String code;
    private String message;
    private Object data;
    private Map<String,Object> attr;
    private static final String PCC_CODE_PREFIX = "PCC_SERVER/";

    public ReturnResult(String code, String message){
        setHttpStatus(HttpCode.HTTP_200);
        setCode(code);
        setMessage(message);
    }

    public ReturnResult(String code, Object data, String message){
        setHttpStatus(HttpCode.HTTP_200);
        setCode(code);
        setMessage(message);
        setData(data);
    }

    public ReturnResult(Object data){
        setHttpStatus(HttpCode.HTTP_200);
        setCode("SUCCESS");
        setMessage("成功");
        setData(data);
    }

    public ReturnResult(Integer status,String code, String message){
        setHttpStatus(status);
        setCode(code);
        setMessage(message);
    }

    public int getHttpStatus() {
        return this.httpStatus;
    }

    public ReturnResult setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }

    public String getCode() {
        //return PCC_CODE_PREFIX + this.code;
        return this.code;
    }

    public ReturnResult setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public ReturnResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public ReturnResult setData(Object data){
        this.data = data;
        return this;
    }

    public Object getData(){
        return this.data;
    }

    @Override
    public String toString() {
        return "[" + this.code + "]" + this.message;
    }
    public String toString(String message) {
        this.message=message;
        return "[" + this.code + "]" + this.message;
    }

    public String toDetail() {
        return "{\"httpStatus\":"+this.getHttpStatus()+",\"code\":\""+this.getCode()+"\",\"message\":\""+this.getMessage();
    }
    public String toDetail(String message,String detailMsg) {
        return "{\"httpStatus\":"+this.getHttpStatus()+",\"code\":\""+this.getCode()+"\",\"message\":\""+message+"\",\"detailMsg\":\""+detailMsg.replaceAll("\r|\n", "").replace("\"","'")+"\"}";
    }

    public void putAttr(String key,Object value){
        this.attr = new HashMap<>();
        attr.put(key,value);
    }
}

