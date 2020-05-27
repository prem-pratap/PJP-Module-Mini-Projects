package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	//method to count number of null marks
	public int findNumberOfNullMarks(Student data[])throws NullPointerException {
		int count=0;
		try {
		for(int i=0;i<data.length;i++) {
			if(data[i]!=null) {
				if(data[i].marks==null)
					count++;
				}	
			}
		}catch(NullPointerException ne) {
		}
	return count;
	}
	//method to count number of null names
	public int findNumberOfNullNames(Student data[])throws NullPointerException {
		int count=0;
		try {
			for(Student obj:data) {
				if(obj.getName()==null)
					count++;
			}
			
		}catch(NullPointerException ne) {
		}
	return count;
	}

	//method to count number of null objects
	public int findNumberOfNullObjects (Student data []) 
	{
		int count=0;
		for(int i=0;i<data.length;i++)
		{
			if(data[i]==null)
			count++;	
		}
		return count;
	}
}
