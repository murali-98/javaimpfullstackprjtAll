package com.dxc.springMVC.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dxc.springMVC.dao.UserDao;
import com.dxc.springMVC.model.Login;
import com.dxc.springMVC.model.User;

public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	public void register(User user) {
		userDao.register(user);
		
	}
	
	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}

}
