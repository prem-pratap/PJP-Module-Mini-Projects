package com.wipro.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.dao.EmployeeDaoImple;

/**
 * Servlet implementation class ModifyEmployeeController
 */
public class ModifyEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyEmployeeController() {
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
		int id1 = Integer.parseInt(request.getParameter("id"));
        int  eid = Integer.parseInt(request.getParameter("eidupdate"));
        String enameupdate = request.getParameter("enameupdate");
        String city=request.getParameter("city");
        String email=request.getParameter("email");
        empDaoImp.updateEmployee(id1, eid,enameupdate,city,email);
        request.setAttribute("msg","Modified Successfully");
        RequestDispatcher rd = request.getRequestDispatcher("modify.jsp");
        rd.forward(request, response);
        
	}

}
