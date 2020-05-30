import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Employee> empList=new ArrayList<Employee>();
		Employee emp=new Employee();
		System.out.println("Enter the Number of Employees:");
		int empCount=sc.nextInt();
		for(int i=0;i<empCount;i++) {
			System.out.println("Enter Employee "+(i+1)+" Details:");
			System.out.println("Enter the Firstname:");
			String firstName = sc.next();
			System.out.println("Enter the Lastname:");
			String lastName=sc.next();
			System.out.println("Enter the mobile number:");
			long num=sc.nextLong();
			System.out.println("Enter the Email:");
			String email=sc.next();
			System.out.println("Enter the Address:");
			String addr=sc.next();
			empList.add(new Employee(firstName,lastName,num,email,addr));
		}
		
		Collections.sort(empList);
		Iterator<Employee> iter=empList.iterator();
		
		System.out.println("Employee List:\n");
		System.out.format("%-15s%-15s%-15s%-30s%-15s\n","Firstname","Secondname","Mobile","Email","Address");
		while(iter.hasNext()) {
			Employee em=iter.next();
			System.out.format("%-15s%-15s%-15s%-30s%-15s\n",em.getFname(),em.getLname(),em.getMobileNum(),em.getEmail(),em.getAddress());
		}

	}

}
