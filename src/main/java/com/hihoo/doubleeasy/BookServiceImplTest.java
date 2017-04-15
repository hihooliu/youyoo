package com.hihoo.doubleeasy;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hihoo.doubleeasy.BaseTest;
import com.hihoo.doubleeasy.dto.AppointExecution;
import com.hihoo.doubleeasy.service.BookService;

/**
 * 预约业务测试类
 * 
 * @author Liuhx
 * 
 */
public class BookServiceImplTest extends BaseTest {

	@Autowired
	private BookService bookService;

	@Test
	public void testAppoint() throws Exception {
		long bookId = 1001;
		long studentId = 12345678910L;
		AppointExecution execution = bookService.appoint(bookId, studentId);
		System.out.println(execution);
	}
}
