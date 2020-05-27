package com.mile1.bean;

public class Student {
	public String name;
	public int[] marks=new int[3];
	
	public Student() {
		super();
	}
	
	public Student(String name,int []marks) {
		this.name=name; 
		this.marks=marks;
	}
	
	public String getName() {
		return name;
	}
	
	public int[] getMarks() {
		return marks;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setMarks(int[] marks) { 
		this.marks=marks;
	}
	
	
}
