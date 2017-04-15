package com.hihoo.doubleeasy.dao;

import org.apache.ibatis.annotations.Param;

import com.hihoo.doubleeasy.entity.Appointment;

public interface AppointmentDao {

	/**
	 * ����ԤԼͼ���¼
	 * 
	 * @param bookId
	 * @param studentId
	 * @return ���������
	 */
	int insertAppointment(@Param("bookId") long bookId,
			@Param("studentId") long studentId);

	/**
	 * ͨ��������ѯԤԼͼ���¼������Я��ͼ��ʵ��
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	Appointment queryByKeyWithBook(@Param("bookId") long bookId,
			@Param("studentId") long studentId);
}