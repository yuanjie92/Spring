package com.shsxt.dao.impl;

import com.shsxt.model.User;

public class UserDaoImpl2 extends UserDaoImpl {
	
	@Override
	public void save(User user) {
		System.out.println("save start...");
		super.save(user);
	}

}
