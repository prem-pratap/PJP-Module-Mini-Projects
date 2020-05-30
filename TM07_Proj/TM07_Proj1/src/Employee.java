
public class Employee implements Comparable<Employee>{
	private String fName;
	private String lName;
	private long mNo;
	private String email;
	private String address;
	
	public Employee() {
		super();
	}
	
	public Employee(String fname,String lname,long mNo,String email,String address) {
		this.fName=fname;
		this.lName=lname;
		this.mNo=mNo;
		this.email=email;
		this.address=address;
				
	}
	
	
	public String getFname() {
		return fName;
	}
	public String getLname() {
		return lName;
	}
	public long getMobileNum() {
		return mNo;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}


	@Override
	public int compareTo(Employee emp) {
		int x= fName.compareTo(emp.getFname());
		return x;
	}
	
}
