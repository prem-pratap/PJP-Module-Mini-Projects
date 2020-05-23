import java.util.Scanner;
public class VideoLauncher {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		VideoStore obj1=new VideoStore();
		do {
			System.out.println("MAIN MENU \n=========");
			System.out.println("1. Add Videos(maximum 10 videos can be added :");
			System.out.println("2. Check Out Video :");
			System.out.println("3. Return Video :");
			System.out.println("4. Receive Rating :");
			System.out.println("5. List Inventory :");
			System.out.println("6. Exit :");
			System.out.print("Enter your choice(1..6): ");
			ch=sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("Enter the name of the video you want to add: ");
					obj1.addVideo(sc.next());
					break;
				case 2:
					System.out.println("Enter the name of the video you want to checkout: ");
					obj1.doCheckout(sc.next());
					break;
				case 3:
					System.out.println("Enter the name of the video you want to return: ");
					obj1.doReturn(sc.next());
					break;
				case 4:
					System.out.println("Enter the name of the video you want to rate: ");
					System.out.println("Enter the rating for this video: ");
					obj1.receiveRating(sc.next(), sc.nextInt());
					break;
				case 5:
					obj1.listInventory();
					break;
				case 6:
					System.out.println("Exiting ...!! Thanks for using the application");
					System.exit(1);
					break;
			 
			}
		}while(ch!=6);

	}

}
