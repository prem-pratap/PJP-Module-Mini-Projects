import java.util.ArrayList;
import java.util.List;

public class Operations {
	
	private List<String> list=new ArrayList<String>();
	
	
	public List<String> stringOperations(String s1,String s2){
		//Character in each alternate index of s1 should be replace with s2
		StringBuilder sbobj=new StringBuilder();
		for (int i=0;i<s1.length();i+=2) {
			char ch=s1.charAt(i);
			sbobj.append(s2);
			sbobj.append(s1.charAt(i));
			}
		list.add(sbobj.toString());
		
		/*If s2 appears more than once in s1, replace the last occurrence of s2in s1 with the reverse
		 * ofs2 else s1+s2*/
		int count=s1.split(s2,-1).length-1;
		if(count >1)
			list.add(s1.substring(0, s1.lastIndexOf(s2)) + new StringBuilder(s2).reverse());
		else
			list.add(s1+s2);
		
		
		/*if s2 appears more than once in s1 then delete the first occurence of s2 in s1,else return s1*/
		if(count >1)
			list.add(s1.substring(0,s1.indexOf(s2))+s1.substring(s1.indexOf(s2)+s2.length()));
		else
			list.add(s1);
		
		/*Divide s2 into two halves and add the first half to the beginning of the s1 and 
		 * second half to the end of s1*/
		int halfLen=s2.length()%2==0 ?s2.length()/2:s2.length()/2+1;
		list.add(s2.substring(0,halfLen)+s1+s2.substring(halfLen));
		
		//If s1 contains characters that is in s2 change all the characters to *
		sbobj=new StringBuilder();
		for(int i=0;i<s1.length();i++) {
			if(s2.indexOf(s1.charAt(i))!=-1)
				sbobj.append('*');
			else
				sbobj.append(s1.charAt(i));
		}
		list.add(sbobj.toString());
		return list;
	}
	
	
}
