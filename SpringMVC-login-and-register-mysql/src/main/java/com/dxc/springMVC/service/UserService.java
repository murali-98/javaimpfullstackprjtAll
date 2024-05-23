package com.dxc.springMVC.service;

import com.dxc.springMVC.model.Login;
import com.dxc.springMVC.model.User;

public interface UserService {
	
	void register(User user);
	User validateUser(Login login);

}
