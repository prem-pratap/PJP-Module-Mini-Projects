package com.wipro.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.bean.LoginUserBean;
import com.wipro.bean.RegisterUserBean;
import com.wipro.dao.UserDao;

public class UserServiceImple implements UserService {
	@Autowired
	  public UserDao userDao;
	public int register(RegisterUserBean user) {
	
		return userDao.register(user);
	}

	public RegisterUserBean validateUser(LoginUserBean login) {
		
		return userDao.validateUser(login);
	}

}
