package com.sshe.exception;

/**ҵ���쳣
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class BizException extends RuntimeException{

	
	
	public BizException() {
		super();
	}


	public BizException(String message) {
		super(message);
	}

	public BizException(Throwable cause) {
		super(cause);
	}
	
	public BizException(String message, Throwable cause) {
		super(message, cause);
	}

	public BizException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
