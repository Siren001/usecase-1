package com.itemWithData.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	
	@RequestMapping("/categories")
	public List<Category> returnAllCategories() {
		return categoryService.displayAllCategories();
		
	}
	@RequestMapping("/categories/{categoryID}")
	public Optional<Category> getCategoryByID(@PathVariable String categoryID) {
		return categoryService.getCategory(categoryID);
	}
	@PostMapping("/categories")
	public void addItem(@RequestBody Category c) {
		categoryService.newcategory(c);

	}
	@RequestMapping(method = RequestMethod.PUT,value="/categories/{categoryID}")
	public void updateItem(@RequestBody Category i,@PathVariable String categoryID) {
		categoryService.updateCategory(i,categoryID);
	}
	@RequestMapping(method = RequestMethod.DELETE,value="/categories/{categoryID}")
	public void deleteItem(@RequestBody Category i,@PathVariable String categoryID) {
		categoryService.deleteCategoryById(i,categoryID);
	}
}
