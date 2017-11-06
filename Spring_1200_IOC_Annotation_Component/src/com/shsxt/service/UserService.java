package com.shsxt.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shsxt.dao.UserDao;
import com.shsxt.model.User;

@Component
public class UserService {

	@Resource
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
