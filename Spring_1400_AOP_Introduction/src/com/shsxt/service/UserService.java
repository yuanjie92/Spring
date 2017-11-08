package com.shsxt.service;

import javax.annotation.Resource;

import com.shsxt.dao.UserDao;
import com.shsxt.model.User;

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

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
