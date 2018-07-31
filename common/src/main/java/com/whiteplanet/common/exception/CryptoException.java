package com.whiteplanet.common.exception;

/**
* <p>File:CryptoException </p>
* <p>Description: 加密解密处理异常</p>
* @date 2017/9/11 11:19
* @version 1.0
*/
public class CryptoException extends Exception {
	private static final long serialVersionUID = 1L;

	public CryptoException() {
		super();
	}

	public CryptoException(String message) {
		super(message);
	}

	public CryptoException(String message, Throwable cause) {
		super(message, cause);
	}

	//simple
	public CryptoException(ReturnResult errorCode) {
		this(errorCode,(String)null,(Throwable)null);
	}

	public CryptoException(ReturnResult errorCode, Throwable cause) {
		this(errorCode,(String)null,(Throwable)null);
	}

	//gerenal
	public CryptoException(ReturnResult errorCode, String msg) {
		this(errorCode,msg,(Throwable)null);
	}

	public CryptoException(ReturnResult errorCode, String msg, Throwable cause) {
		super(msg==null?errorCode.toDetail():errorCode.toDetail(msg,cause!=null?cause.getMessage():msg),cause);
		if(cause!=null) {
			cause.fillInStackTrace();
		}
		new Exception(msg==null?errorCode.toDetail():errorCode.toDetail(msg,cause!=null?cause.getMessage():msg),cause);
	}
}
