
class VideoStore{
	
	Video[] store;
	
	public VideoStore() {
		store=new Video[10]; //array of  size 10 to store 10 video's details
	}
	int count=0; //count will check no. of videos in the store
	//method to add new video in the store
	int getCount() {
		return count;
	}
	Video getLastAdded() {
		if (count!=0)
			return store[count-1];
		else
			return null;
	}
	void addVideo(String name) {

		if (count==0) {
			store[0]=new Video(name);
			count++;}
		else if(count==10)
			System.out.println("Maximum capacity reached...You cannot add more videos");
		else {
			store[count]=new Video(name);
			count++;
		}
		System.out.println("Video "+"\""+store[count-1].getName()+"\""+" added successfully.");
	}
	
	//method to update checkout on the basis of received video name
	void doCheckout(String name) {
		for(int i=0;i<count;i++) {
			if(store[i].getName().equals(name)) {
				store[i].doCheckout();
				System.out.println("Video "+"\""+store[i].getName()+"\""+" checked out successfully");
			}
			else {
				System.out.println("Video not found in inventory.....");
				break;}
		}
		
			
	}

	//method to update checkout value on return on the basis of received video name
	void doReturn(String name) {
		for (int i=0;i<count;i++) {
			if(store[i].getName().equals(name)) {
				store[i].doReturn();
				System.out.println("Video "+"\""+store[i].getName()+"\""+" returned successfully");
			}
			else {
				System.out.println("Video not found in inventory.....");
				break;}
		}
		
	}
	
	//method to update rating on the basis of received video name
	void receiveRating(String name, int rating) {
		for (int i=0;i<count;i++) {
			if(store[i].getName().equals(name)) {
				store[i].receiveRating(rating);
				System.out.println("Rating "+"\""+store[0].getRating()+"\""+" has been mapped to the video matrix");
			}
			else {
				System.out.println("Video not found in inventory.....");
				break;}
		}
	}
	
	
	//method to print the inventory
	void listInventory() {
		System.out.println("--------------------------------------");
		System.out.println("Video Name | Checkout Status | Rating");
		for(int i=0;i<count;i++)
			System.out.println(store[i].getName()+"\t|" +store[i].getCheckout()+ "\t|"+ store[i].getRating());
		System.out.println("--------------------------------------");
		
		
	}
}
