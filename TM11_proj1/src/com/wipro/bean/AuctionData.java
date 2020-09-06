package com.wipro.bean;

public class AuctionData {
	private int itemid;
	private String itemname;
	private String uname;
	private String email;
	private int amount;
	private boolean autoincreement;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public boolean isAutoincreement() {
		return autoincreement;
	}
	public void setAutoincreement(boolean autoincreement) {
		this.autoincreement = autoincreement;
	}
	public AuctionData(int itemid, String itemname, String uname, String email, int amount, boolean autoincreement) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.uname = uname;
		this.email = email;
		this.amount = amount;
		this.autoincreement = autoincreement;
	}
	

}
