package com.hihoo.doubleeasy.dto;

/**
 * ��װjson�������з��ؽ����ʹ����
 * 
 * @author Liuhx
 * 
 * @param <T>
 */
public class Result<T> {

	private boolean success;// �Ƿ�ɹ���־

	private T data;// �ɹ�ʱ���ص�����

	private String error;// ������Ϣ

	public Result() {
	}

	// �ɹ�ʱ�Ĺ�����
	public Result(boolean success, T data) {
		this.success = success;
		this.data = data;
	}

	// ����ʱ�Ĺ�����
	public Result(boolean success, String error) {
		this.success = success;
		this.error = error;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success
	 *            the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}
}
