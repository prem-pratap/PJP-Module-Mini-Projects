package com.wipro.dao;

import com.wipro.bean.LoginUserBean;
import com.wipro.bean.RegisterUserBean;

public interface UserDao {

	int register(RegisterUserBean regUser);
	
	RegisterUserBean validateUser(LoginUserBean user);
}
