package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {
	//method to find grade of valid student
	public String findGrade(Student studentobject) {
		int[] marks=studentobject.getMarks();
		String grade = null;
		int sum=0;
		for (int i:marks) {
			if(i<35)
				return grade="F";
			else
				sum=sum+i;
		}
		if(sum<=150)
			return grade="D";
		else if(sum>150 && sum <=200)
			return grade="C";
		else if(sum>200 && sum <=250)
			return grade="B";
		else if(sum>250 && sum <=300)
			return grade="A";
		return grade;
	}
	
	//method to find valid student
	public String validate(Student studentObject) throws NullStudentException,NullNameException,NullMarksArrayException{
		String grade=null;
			if(studentObject==null)
				throw new NullStudentException();
			else if(studentObject.getName()==null)
				throw new NullNameException();
			else if (studentObject.getMarks()==null)
				throw new NullMarksArrayException();
			else
				grade=findGrade(studentObject);
		return grade;
			
	}
}
