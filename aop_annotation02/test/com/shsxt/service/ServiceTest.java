package com.shsxt.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		UserService userService = ac.getBean(UserService.class);
		userService.save();
	}

}
