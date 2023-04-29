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
