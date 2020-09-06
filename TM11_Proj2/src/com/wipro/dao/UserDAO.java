package com.wipro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.wipro.bean.UserBean;
import com.wipro.util.DBUtil;

public class UserDAO {
	
	public String checkUser(UserBean user) {
		String status="Fail";
		try {
			String sql= "Select * from user_table where username=? and password=?";
			Connection con= DBUtil.getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1,user.getUserName());
			pstmt.setString(2, user.getPassword());
			ResultSet rset= pstmt.executeQuery();
			if(rset.next()) 
				status="Success";
			
			pstmt.close();
			con.close();
		}
		catch(Exception e) {e.printStackTrace();}
		return status;
	}
	
	public String changePass(String oldpasswd,String newpasswd) {
		String status="Fail";
		try {
			String sql="Update user_table set password=? where password=?";
			Connection con= DBUtil.getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, newpasswd);
			pstmt.setString(2, oldpasswd);
			pstmt.executeQuery();
			status="success";
			pstmt.close();
			con.close();
			
		}catch(Exception e) {e.printStackTrace();}
		return status;
	}
	
	public String addUser(UserBean user) {
		String status="fail";
		try {
			String sql="Insert into user_table (username,password) values (?,?)";
			Connection con= DBUtil.getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2,user.getPassword());
			ResultSet rset= pstmt.executeQuery();
			if(rset.next()) 
				status="Success";
			
			pstmt.close();
			con.close();
		}
		catch(Exception e) {e.printStackTrace();}
		return status;
		
		}
	
}

