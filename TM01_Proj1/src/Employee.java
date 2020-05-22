public class Employee{
	public static void main(String[] args){
		if(args.length==0)
			System.out.println("Please enter valid employee id");
		else{
			//Initialization of array with given data
			String empdetail[] []=new String[7][8];
			empdetail[0]=new String[]{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"};
			empdetail[1]=new String[]{"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"};
			empdetail[2] = new String[]{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"};
		        empdetail[3] = new String[]{"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"};
		        empdetail[4] = new String[]{"1005","Rajan","16/07/2005","m","Engg","50000","20000","20000"};
        		empdetail[5] = new String[]{"1006","Suman","01/01/2000","e","Manufacturing","23000","9000","4400"};
        		empdetail[6] = new String[]{"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"};

			int check=-2,i;
			String empid=args[0];
			//finding index where input empid matches with empid in array
			for(i=0;i<empdetail.length;i++){
				if(empid.equals(empdetail[i][0]))
					check=i;
				}
			//obtaining DA and designation using index(check) obtain when input empid matches with empid in array
			if(check!=-2){
				String desigcode=empdetail[check][3];
				String desig="",DA="";
				switch(desigcode){
				case "e":
					desig="Engineer";
					DA="20000";
					break;
				case "c":
					desig="Consultant";
					DA="32000";
					break;
				case "k":
					desig="Clerk";
					DA="12000";
					break;
				case "r":
					desig="Receptionist";
					DA="15000";
					break;
				case "m":
					desig="Manager";
					DA="40000";
					break;
				}
				//calculation of salary on the basis of BASIC+HRA+DA-IT
				int salary=Integer.parseInt(empdetail[check][5])+Integer.parseInt(empdetail[check][6])+Integer.parseInt(DA)-Integer.parseInt(empdetail[check][7]);
				System.out.println("Emp No "+" Emp Name "+"Department "+"Designation "+"Salary ");
				System.out.println(empid+"\t"+empdetail[check][1]+"\t "+empdetail[check][4]+"\t    "+desig+"\t"+salary);
			}
			else
				System.out.println("There is no employee with empid:"+empid);
				
		}

	}

}
