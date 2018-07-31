
package com.whiteplanet.admin.domain.result;
/**
 * @author:wuzhiyuan
 * @description:  状态编码与说明
 * @date: Created in 09:20 2017/12/07
 * @modified By:
 */
public enum ExceptionMsg {
	SUCCESS("000000", "操作成功"),
	FAILED("999999","操作失败"),
    ParamError("000001", "参数错误！"),
    
    LoginNameOrPassWordError("000100", "用户名或者密码错误！"),
    EmailUsed("000101","该邮箱已被注册"),
    UserNameUsed("000102","该登录名称已存在"),
    EmailNotRegister("000103","该邮箱地址未注册"), 
    LinkOutdated("000104","该链接已过期，请重新请求"),
    PassWordError("000105","密码输入错误"),
    UserNameLengthLimit("000106","用户名长度超限"),
    LoginNameNotExists("000107","该用户未注册"),
    UserNameSame("000108","新用户名与原用户名一致")
    ;
   private ExceptionMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    private String code;
    private String msg;
    
	public String getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}

    
}

