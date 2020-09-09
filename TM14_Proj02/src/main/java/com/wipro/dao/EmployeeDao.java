package com.wipro.dao;

import java.util.List;

import com.wipro.bean.EmployeeBean;

public interface EmployeeDao {
	public void saveEmployee (EmployeeBean employee);
    public List<EmployeeBean> showAllEmployees();
    public void updateEmployee (int id,int empid, String empname,String city,String email);
    public void deleteEmployee (int eid);
    public EmployeeBean getUserById(int eid);
    
	
}
