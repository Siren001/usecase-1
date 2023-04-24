package com.itemWithData.Item;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Item {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
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
	
//	@Override
//	public String toString() {
//		return "Store [id=" + id + ", location=" + location + ", quantity=" + quantity + "]";
//	}
}
