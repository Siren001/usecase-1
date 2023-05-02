package com.itemWithData.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table

public class Item {
	@Id
//	@Column(name = "itemID")
	private String itemID;
	private String itemName;
	private String itemStatus;
	@ManyToOne(cascade = CascadeType.ALL)
	private Category category;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(String itemID, String itemName, String itemStatus, Category category) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemStatus = itemStatus;
		this.category = category;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", itemName=" + itemName + ", itemStatus=" + itemStatus + ", category="
				+ category + "]";
	}

}
