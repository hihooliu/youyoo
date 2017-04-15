package com.hihoo.doubleeasy.exception;

/**
 * 重复预约异常类
 */
public class RepeatAppointException extends RuntimeException {

	public RepeatAppointException(String message, Throwable cause) {
		super(message, cause);
	}

	public RepeatAppointException(String message) {
		super(message);
	}

}
