//video class having getters and setter for variables
public class Video {
	String videoName;
	boolean checkout;
	int rating;
	
	//constructor to set the videoName
	Video(String name){
		videoName=name;
	}
	
	//method to retrieve videoName
	String getName(){
		return videoName;	
	}
	
	//method to do checkout
	void doCheckout() {
		checkout=true;
	}
	
	//method to update checkout value on return
	void doReturn() {
		checkout=false;
	}
	
	//method to set the rating of video
	void receiveRating(int rating) {
		this.rating=rating;
	}
	
	//method to retrieve rating of video
	int getRating() {
		return rating;
	}
	
	//method to retrieve checkout value
	boolean getCheckout() {
		return checkout;
	}
}
