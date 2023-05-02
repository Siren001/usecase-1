package com.itemWithData.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itemWithData.entities.Category;
import com.itemWithData.service.CategoryService;

@RestController
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@RequestMapping(method = RequestMethod.GET, value = "/categories/getall")
	public List<Category> returnAllCategories() {
		return categoryService.displayAllCategories();

	}

	@RequestMapping(method = RequestMethod.GET, value = "/categories/get/{categoryID}")
	public Optional<Category> getCategoryByID(@PathVariable Integer categoryID) {
		return categoryService.getCategory(categoryID);
	}

	@PostMapping("/categories/add")
	public void addItem(@RequestBody Category c) {
		categoryService.newcategory(c);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/categories/update/{categoryID}")
	public void updateItem(@RequestBody Category i, @PathVariable Integer categoryID) {
		categoryService.updateCategory(i, categoryID);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/categories/delete/{categoryID}")
	public void deleteItem(@RequestBody Category i, @PathVariable Integer categoryID) {
		categoryService.deleteCategoryById(i, categoryID);
	}
}
