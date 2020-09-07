package com.wipro.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wipro.bean.EmployeeBean;
import com.wipro.util.HibernateUtil;

public class EmployeeDaoImple implements EmployeeDao {
	

	public List<EmployeeBean> showAllEmployees() {
		
		List<EmployeeBean> employeeList = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("From EmployeeBean");
        employeeList = query.list();
        return employeeList;
	}

	public void updateEmployee(int id ,int empid, String empname,String city,String email) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        EmployeeBean empobj=(EmployeeBean)session.load(EmployeeBean.class, id);
        empobj.setEmpid(empid);
        empobj.setEmpname(empname);
        empobj.setCity(city);
        empobj.setEmail(email);
        session.update(empobj);
        transaction.commit();
        session.close();
        
	}

	public void deleteEmployee(int eid) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        EmployeeBean employee =(EmployeeBean)session.load(EmployeeBean.class, new Integer(eid));
        session.delete(employee);
        transaction.commit();
        session.close();
		
	}

	public void saveEmployee(EmployeeBean employee) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();
		
	}
	
	public EmployeeBean getUserById(int eid) {
		EmployeeBean emp=null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		String hqlQuery = "from user_table where id = :id";
		Query query = session.createQuery(hqlQuery);
        query.setParameter("id", eid);
        emp=(EmployeeBean)query.getSingleResult();
        return emp;
		
	}
	

}
