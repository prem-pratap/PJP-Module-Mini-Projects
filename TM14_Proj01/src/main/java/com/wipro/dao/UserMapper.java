package com.wipro.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wipro.bean.RegisterUserBean;

public class UserMapper implements RowMapper<RegisterUserBean> {

	public RegisterUserBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		RegisterUserBean user=new RegisterUserBean();
		user.setUsername(rs.getString("username"));
	    user.setPassword(rs.getString("password"));
	    user.setEmpNo(rs.getInt("empno"));
	    user.setEmail(rs.getString("email"));
	    
		return user;
	}

}
