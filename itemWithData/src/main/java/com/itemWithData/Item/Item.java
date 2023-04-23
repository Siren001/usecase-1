package com.itemWithData.Item;

public class Item {
	private String itemID;
	private String itemName;
	private String itemStatus;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(String itemID, String itemName, String itemStatus) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemStatus = itemStatus;
	}
	public String getitemID() {
		return itemID;
	}
	public void setitemID(String itemID) {
		this.itemID = itemID;
	}
	public String getitemName() {
		return itemName;
	}
	public void setitemName(String itemName) {
		this.itemName = itemName;
	}
	public String getitemStatus() {
		return itemStatus;
	}
	public void setitemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	
	
}
