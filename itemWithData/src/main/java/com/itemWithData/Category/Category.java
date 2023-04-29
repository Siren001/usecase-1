package com.itemWithData.Category;
import java.util.List;

import com.itemWithData.Item.Item;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "category")
public class Category {
	@Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer categoryID;
	private String categoryName;
	private String categoryDescription;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "itemID")
	private List<Item> Item;

	public Category() {
		// TODO Auto-generated constructor stub
	}
public Category(Integer categoryID, String categoryName, String categoryDescription, List<com.itemWithData.Item.Item> item) {
	super();
	this.categoryID = categoryID;
	this.categoryName = categoryName;
	this.categoryDescription = categoryDescription;
	Item = item;
}
public Integer getCategoryID() {
	return categoryID;
}
public void setCategoryID(Integer categoryID) {
	this.categoryID = categoryID;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getCategoryDescription() {
	return categoryDescription;
}
public void setCategoryDescription(String categoryDescription) {
	this.categoryDescription = categoryDescription;
}
public List<com.itemWithData.Item.Item> getItem() {
	return Item;
}
public void setItem(List<com.itemWithData.Item.Item> item) {
	Item = item;
}
@Override
public String toString() {
	return "Category [categoryID=" + categoryID + ", categoryName=" + categoryName + ", categoryDescription="
			+ categoryDescription + ", Item=" + Item + "]";
}
	
}
