package com.hihoo.doubleeasy.exception;

/**
 * �ظ�ԤԼ�쳣��
 */
public class RepeatAppointException extends RuntimeException {

	public RepeatAppointException(String message, Throwable cause) {
		super(message, cause);
	}

	public RepeatAppointException(String message) {
		super(message);
	}

}
