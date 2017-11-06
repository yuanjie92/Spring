package com.shsxt.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.model.User;


public class UserServiceTest {

	@Test
	public void test() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		UserService userService = ctx.getBean(UserService.class);
		
		userService.save(new User());
		userService.save(new User());
		
		ctx.destroy();
		
	}

}
