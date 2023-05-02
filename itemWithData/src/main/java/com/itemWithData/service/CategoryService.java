package com.itemWithData.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itemWithData.repository.CategoryRepository;
import com.itemWithData.entities.Category;
import com.itemWithData.entities.Item;
import com.itemWithData.repository.ItemRepository;



@Service
public class CategoryService  {
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	ItemRepository itemRepository;
	public List<Category> displayAllCategories(){
	List<Category> temp = new ArrayList<>();
		categoryRepository.findAll().forEach(temp::add);
		return temp;
		
	}
	public Optional<Category> getCategory(Integer categoryID) {
		Optional<Category> temp = categoryRepository.findById(categoryID);
		return temp;
	}
	public void newcategory(Category c) {
		categoryRepository.save(c);
	}
	public void updateCategory(Category c, Integer categoryID) {
		Optional<Category> temp =  categoryRepository.findById(categoryID);
		if (temp.isPresent()) {
			categoryRepository.save(c);
		}
		
		else return;
		
		
	}
	public void deleteCategoryById(Category c, Integer categoryID) {
		Optional<Category> temp =  categoryRepository.findById(categoryID);
		if (temp.isPresent()) {
			categoryRepository.deleteById(categoryID);
		}
		else return ;
		
	}
	
}
