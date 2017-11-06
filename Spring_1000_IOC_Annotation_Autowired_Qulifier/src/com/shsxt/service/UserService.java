package com.shsxt.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.shsxt.dao.UserDao;
import com.shsxt.model.User;

public class UserService {

	@Autowired
	private UserDao userDao;
	
	public UserService(){}
	
	
	public void save(User user){
		userDao.save(user);
	}
	
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void init(){
		System.out.println("init");
	}
	
	public void destroy(){
		System.out.println("destroy");
	}
}
