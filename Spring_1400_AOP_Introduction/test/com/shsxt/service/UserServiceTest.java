package com.shsxt.service;

import java.lang.reflect.Proxy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.aop.LogInterceptor;
import com.shsxt.dao.UserDao;
import com.shsxt.dao.impl.UserDaoImpl;
import com.shsxt.model.User;


public class UserServiceTest {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		UserService userService = ctx.getBean(UserService.class);
		
		User u = new User();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		userService.save(u);
	}
	
	@Test
	public void testProxy(){
		UserDao userDao = new UserDaoImpl();
		LogInterceptor li = new LogInterceptor();
		li.setTarget(userDao);
		UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), li);
		System.out.println(userDaoProxy.getClass());
		userDaoProxy.delete();
		userDaoProxy.save(new User());
	}

}
