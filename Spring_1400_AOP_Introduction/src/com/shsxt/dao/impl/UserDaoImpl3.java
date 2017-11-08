package com.shsxt.dao.impl;


import com.shsxt.aop.LogInterceptor;
import com.shsxt.dao.UserDao;
import com.shsxt.model.User;

public class UserDaoImpl3 implements UserDao {
	
	/**
	 * 组合
	 */
	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public void save(User user) {
		new LogInterceptor().beforeMethod(null);
		userDao.save(user);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
