package com.itemWithData.Category;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CategoryService  {
	@Autowired
	CategoryRepository categoryRepository;
	public List<Category> displayAllCategories(){
		List<Category> temp = new ArrayList<>();
		categoryRepository.findAll().forEach(temp::add);
		return temp;
	}
	public Optional<Category> getCategory(String categoryID) {
		Optional<Category> temp = categoryRepository.findById(categoryID);
		return temp;
	}
	public void newcategory(Category c) {
		categoryRepository.save(c);
	}
	public void updateCategory(Category c, String categoryID) {
		categoryRepository.save(c);
		
	}
	public void deleteCategoryById(Category c, String categoryID) {
		categoryRepository.deleteById(categoryID);
		
	}
	
}
