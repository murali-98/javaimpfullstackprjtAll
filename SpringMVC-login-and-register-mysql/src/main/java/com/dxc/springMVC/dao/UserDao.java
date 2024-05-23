package com.dxc.springMVC.dao;

import com.dxc.springMVC.model.Login;
import com.dxc.springMVC.model.User;

public interface UserDao {
	void register(User user);
	User validateUser(Login login);

}
