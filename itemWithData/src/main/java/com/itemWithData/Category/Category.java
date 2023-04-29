package com.itemWithData.Category;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Category {
	@Id
    @GeneratedValue
	private String categoryID;
	private String categoryName;
	private String categoryDescription;
	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	public Category(String categoryID, String categoryName, String categoryDescription) {
		super();
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
	}

	public String getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(String categoryID) {
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
	
}
