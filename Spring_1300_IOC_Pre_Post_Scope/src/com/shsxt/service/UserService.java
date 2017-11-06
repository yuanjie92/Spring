package com.shsxt.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shsxt.dao.UserDao;
import com.shsxt.model.User;

@Component
public class UserService {

	@Resource
	private UserDao userDao;

	public UserService() {
	}

	public void save(User user) {
		userDao.save(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	@Scope("prototype")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@PostConstruct
	public void init() {
		System.out.println("init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
}
