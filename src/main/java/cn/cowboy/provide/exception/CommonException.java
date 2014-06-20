package cn.cowboy.provide.exception;

public class CommonException extends Exception{
	private String errorCode;
	public CommonException() {
		super();
	}

	public CommonException(String msg, String errorCode) {
		super(msg);
		this.errorCode = errorCode;
	}

	public CommonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CommonException(String message, Throwable cause) {
		super(message, cause);
	}

	public CommonException(String message) {
		super(message);
	}

	public CommonException(Throwable cause) {
		super(cause);
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}
