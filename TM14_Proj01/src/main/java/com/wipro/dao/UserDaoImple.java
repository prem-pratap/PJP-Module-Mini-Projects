package com.wipro.dao;

import java.util.List;

import org.hibernate.dialect.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.wipro.bean.LoginUserBean;
import com.wipro.bean.RegisterUserBean;

public class UserDaoImple implements UserDao{
	
	@Autowired
	  Database datasource;
	  @Autowired
	  JdbcTemplate jdbcTemplate;



	public int register(RegisterUserBean regUser) {
		String sql = "insert into users values(?,?,?,?)";

	    return jdbcTemplate.update(sql, new Object[] { regUser.getUsername(),regUser.getPassword(),regUser.getEmpNo(),regUser.getEmail()});

	}

	public RegisterUserBean validateUser(LoginUserBean user) {
	    String sql = "select * from users where username='" + user.getUsername() + "' and password='" + user.getPassword()
        + "'";
    List<RegisterUserBean> users = jdbcTemplate.query(sql, new UserMapper());

    return users.size() > 0 ? users.get(0) : null;
	}

}
