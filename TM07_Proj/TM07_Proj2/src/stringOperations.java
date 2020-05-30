/*Write a program to perform the basic operations like insert,delete,display and search in list. List contains string object items where these operations are to be performed.*/

import java.util.ArrayList;
import java.util.List;

public class stringOperations {
	private List<String> list=new ArrayList<String>();
	
	public boolean insertElement(String ele) {
		if(!list.contains(ele)) {
			list.add(ele);
			return true;}
		else
			return false;
	}
	
	public boolean searchElement(String ele) {
		if(list.contains(ele))
			return true;
		else
			return false;
	}
	
	public boolean deleteElement(String ele) {
		if (list.contains(ele)) {
			list.remove(ele);
			return true;
			}
		else
			return false;
		
	}
	
	public void display() {
		for(String element:list)
			System.out.println(element);
	}

	
}
