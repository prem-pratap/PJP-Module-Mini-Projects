package com.wipro.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.dao.EmployeeDaoImple;

/**
 * Servlet implementation class DeleteEmployeeController
 */
public class DeleteEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeDaoImple empDaoImp=new EmployeeDaoImple();
		int id2 = Integer.parseInt(request.getParameter("eid"));
        empDaoImp.deleteEmployee(id2);
        request.setAttribute("msg","Deleted Successfully");
         RequestDispatcher rd = request.getRequestDispatcher("deleteuser.jsp");
       rd.forward(request, response);
    }
	

}
