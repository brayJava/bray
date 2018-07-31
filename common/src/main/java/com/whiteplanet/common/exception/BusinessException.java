package com.whiteplanet.common.exception;

/**
* <p>File:BusinessException </p>
* <p>Description: 业务异常</p>
* @date 2017/9/11 11:19
* @version 1.0
*/
public class BusinessException extends Exception {
	private static final long serialVersionUID = 1L;

	
	public BusinessException() {
		super();
	}

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	//simple
	public BusinessException(ReturnResult errorCode) {
		this(errorCode,(String)null,(Throwable)null);
	}

	public BusinessException(ReturnResult errorCode, Throwable cause) {
		this(errorCode,(String)null,(Throwable)null);
	}

	//gerenal
	public BusinessException(ReturnResult errorCode, String msg) {
		this(errorCode,msg,(Throwable)null);
	}

	public BusinessException(ReturnResult errorCode, String msg, Throwable cause) {
		super(msg==null?errorCode.toDetail():errorCode.toDetail(msg,cause!=null?cause.getMessage():msg),cause);
		if(cause!=null) {
			cause.fillInStackTrace();
		}
		new Exception(msg==null?errorCode.toDetail():errorCode.toDetail(msg,cause!=null?cause.getMessage():msg),cause);
	}
}
