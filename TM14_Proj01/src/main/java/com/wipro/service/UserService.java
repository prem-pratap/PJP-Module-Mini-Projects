package com.wipro.service;

import com.wipro.bean.LoginUserBean;
import com.wipro.bean.RegisterUserBean;

public interface UserService {

	int register(RegisterUserBean user);

	   RegisterUserBean validateUser(LoginUserBean login) ;
	
}
