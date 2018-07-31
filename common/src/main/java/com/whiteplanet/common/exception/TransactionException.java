package com.whiteplanet.common.exception;

/**
 * <pre>
 * @File：TransactionException
 * @Version：1.0.0
 * @CreateDate：2016/10/4 16:22
 * @Modify：
 * @ModifyDate：2016/9/23
 * @Descript：业务异常
 * </pre>
 */

/**
* <p>Package:org.rayeye.util.exception </p>
* <p>File:TransactionException </p>
* <p>Description: 业务事务异常，处理事务回滚</p>
* @author Neil.Zhou
* @date 2017/9/11 11:24
* @version 1.0
*/
public class TransactionException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public TransactionException() {
		super();
	}

	public TransactionException(String message) {
		super(message);
	}

	public TransactionException(String message, Throwable cause) {
		super(message, cause);
	}

	//simple
	public TransactionException(ReturnResult errorCode) {
		this(errorCode,(String)null,(Throwable)null);
	}

	public TransactionException(ReturnResult errorCode, Throwable cause) {
		this(errorCode,(String)null,(Throwable)null);
	}

	//gerenal
	public TransactionException(ReturnResult errorCode, String msg) {
		this(errorCode,msg,(Throwable)null);
	}

	public TransactionException(ReturnResult errorCode, String msg, Throwable cause) {
		super(msg==null?errorCode.toDetail():errorCode.toDetail(msg,cause!=null?cause.getMessage():msg),cause);
		if(cause!=null) {
			cause.fillInStackTrace();
		}
		new Exception(msg==null?errorCode.toDetail():errorCode.toDetail(msg,cause!=null?cause.getMessage():msg),cause);
	}
}
