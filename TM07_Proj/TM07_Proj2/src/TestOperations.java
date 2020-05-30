import java.util.Scanner;

public class TestOperations {

	public static void main(String[] args) {
		stringOperations obj=new stringOperations();
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("1.Insert");
			System.out.println("2.Search");
			System.out.println("3.Delete");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			System.out.println("Enter your choice :");
			ch=sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("Enter the item to be inserted:");
					if(obj.insertElement(sc.next()))
						System.out.println("Inserted successfully");
					else
						System.out.println("Item already present in list");
			
					break;
				case 2:
					System.out.println("Enter the item to search:");
					if(obj.searchElement(sc.next()))
						System.out.println("Item found in the list");
					else
						System.out.println("Item not found in the list");
					break;
				case 3:
					System.out.println("Enter the item to delete:");
					if(obj.deleteElement(sc.next()))
						System.out.println("Deleted successfully");
					else
						System.out.println("Item not found in the list");
					break;
				case 4:
					System.out.println("The items in the list are:" ); 
					obj.display();
					break;
				case 5:
					System.out.println("Exiting the system");
					
			}
		}while(ch!=5);
	}

}
