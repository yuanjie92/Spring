package com.shsxt.dao.impl;

import org.springframework.stereotype.Component;

import com.shsxt.dao.UserDao;
import com.shsxt.model.User;

@Component
public class UserDaoImpl implements UserDao {
	
	private int daoId;

	@Override
	public void save(User user) {
		System.out.println("save user...");
	}

	public int getDaoId() {
		return daoId;
	}

	public void setDaoId(int daoId) {
		this.daoId = daoId;
	}
	
	public String toString(){
		return "daoId=" + daoId;
	}

}
