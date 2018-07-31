package com.whiteplanet.common.exception;

/**
* <p>File:ServerException </p>
* <p>Description: 系统服务异常</p>
* @date 2017/9/11 11:25
* @version 1.0
*/
public class ServerException extends Exception {
	private static final long serialVersionUID = 1L;

	public ServerException() {
		super();
	}

	public ServerException(String message) {
		super(message);
	}

	public ServerException(String message, Throwable cause) {
		super(message, cause);
	}
}
