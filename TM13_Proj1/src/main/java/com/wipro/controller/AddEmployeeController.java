package com.wipro.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.bean.EmployeeBean;
import com.wipro.dao.EmployeeDao;
import com.wipro.dao.EmployeeDaoImple;

/**
 * Servlet implementation class AddEmployeeController
 */
public class AddEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		EmployeeDaoImple empDaoImp=new EmployeeDaoImple();
		EmployeeDao dao;
		int eid=Integer.parseInt(request.getParameter("eid"));
        String ename=request.getParameter("ename");
        String desig=request.getParameter("designation");
        int salary=Integer.parseInt(request.getParameter("salary"));
        String email =request.getParameter("email");
        String gender=request.getParameter("gender");
        String city=request.getParameter("city");
        int contact=Integer.parseInt(request.getParameter("contact"));
        EmployeeBean employee=new EmployeeBean(eid,ename,desig,salary,gender,city,email,contact);
        empDaoImp.saveEmployee(employee);
        request.setAttribute("msg","Added Successfully");
        RequestDispatcher rd = request.getRequestDispatcher("adduser.jsp");
        rd.forward(request, response);
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
