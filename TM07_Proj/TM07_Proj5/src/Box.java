
public class Box implements Comparable<Box>{
	private double length;
	private double width;
	private double height;
	
	public Box() {
		super();
	}
	
	public Box(double len,double wid,double hei) {
		this.length=len;
		this.width=wid;
		this.height=hei;
	}
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	
	public void setLength(double len) {
		this.length=len;
	}
	public void setWidth(double wid) {
		this.width=wid;
	}
	public void setHeight(double hei) {
		this.height=hei;
	}
	
	 @Override
	    public String toString() {
	        double volume = (length * width * height);
	        String str = String.format("Length="+ length + " Width=" + width +
	                " Height=" + height + " Volume=%.2f", volume);

	        return str;
	    }
	@Override
	public boolean equals(Object obj) {
        Box that =  (Box) obj;

        double thisVol = this.length * this.width * this.height;
        double thatVol = that.length * that.width * that.height;

        if (thisVol == thatVol) return true;
        else return false;
    }
	
	@Override
    public int compareTo(Box that) {
        double thisVol = this.length * this.width * this.height;
        double thatVol = that.length * that.width * that.height;

        if (thisVol > thatVol) return 1;
        else if (thisVol < thatVol) return -1;
        else return 0;
    }

}
