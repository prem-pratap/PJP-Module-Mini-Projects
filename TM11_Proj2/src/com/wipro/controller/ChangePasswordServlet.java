package com.wipro.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.bean.UserBean;
import com.wipro.dao.UserDAO;

/**
 * Servlet implementation class ChangePasswordServlet
 */
@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("uname");
		String oldpasswd=request.getParameter("oldpasswd");
		String newpasswd=request.getParameter("newpasswd");
		String renewpasswd=request.getParameter("renewpasswd");
		UserBean user=new UserBean();
		UserDAO dao=new UserDAO();
		user.setUserName(uname);
		user.setPassword(oldpasswd);
		String status=dao.checkUser(user);
		if(status.equalsIgnoreCase("Success")) {
			String result=dao.changePass(oldpasswd, newpasswd);
			if(result.equalsIgnoreCase("Success")) { 
				request.setAttribute("msg1", "Password changed successully");
				RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
				rd.forward(request, response);
			}
		}	
			else {
				request.setAttribute("msg2", "Error occured in changing password");
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
			
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
