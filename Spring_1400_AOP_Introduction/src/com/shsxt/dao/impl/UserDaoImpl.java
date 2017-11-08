package com.shsxt.dao.impl;

import com.shsxt.dao.UserDao;
import com.shsxt.model.User;

public class UserDaoImpl implements UserDao {
	
	@Override
	public void save(User user) {
		System.out.println("save user...");
	}

	@Override
	public void delete() {
		System.out.println("delete user...");
	}

}
