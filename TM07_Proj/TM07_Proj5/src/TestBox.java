import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestBox {

	public static void main(String[] args) {
		Set<Box> set=new TreeSet<Box>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of boxes:");
		int noOfBox=sc.nextInt();
		for(int i=1;i<=noOfBox;i++) {
			System.out.println("Enter the box "+i+" details");
			System.out.println("Enter length:");
			double len=sc.nextDouble();
			System.out.println("Enter width:");
			double wid=sc.nextDouble();
			System.out.println("Enter height:");
			double hei=sc.nextDouble();
			Box bobj=new Box();
			bobj.setLength(len);
			bobj.setWidth(wid);
			bobj.setHeight(hei);
			set.add(bobj);
			
		}
		System.out.println("Unique boxes in set are:");
		for(Box b:set) 
			System.out.println(b);
			
		
	}

}
