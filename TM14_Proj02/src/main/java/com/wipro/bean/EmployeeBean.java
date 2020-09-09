package com.wipro.bean;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeBean {
	@Id @GeneratedValue
    int id;
	
	@Column(name="empid",length=10)
	private int empid;
	
	@Column(name="empname",length=255)
	private String empname;
	
	@Column(name="designation",length=255)
	private String designation;
	
	@Column(name="salary",length=10)
	private int salary;
	
	@Column(name="gender",length=10)
	private String gender;
	
	@Column(name="city",length=20)
	private String city;
	
	@Column(name="email",length=20)
	private String email;
	
	@Column(name="contact",length=20)
	private int contact ;

	public EmployeeBean() {
		super();
	}
	public EmployeeBean(int empid, String empname, String designation, int salary, String gender, String city,
			String email, int contact) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.designation = designation;
		this.salary = salary;
		this.gender = gender;
		this.city = city;
		this.email = email;
		this.contact = contact;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}
}
