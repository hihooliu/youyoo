package com.hihoo.doubleeasy.exception;

/**
 * �ظ�ԤԼ�쳣
 * 
 * @author Liuhx
 * 
 */
public class AppointException extends RuntimeException {

	public AppointException(String message, Throwable cause) {
		super(message, cause);
	}

	public AppointException(String message) {
		super(message);
	}

}
