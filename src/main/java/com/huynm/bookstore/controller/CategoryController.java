package com.huynm.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huynm.bookstore.dto.CategoryDTO;
import com.huynm.bookstore.entities.Category;
import com.huynm.bookstore.repository.CategoryRepository;
import com.huynm.bookstore.service.ICategoryService;

@RestController
@RequestMapping("/v1/api/category")
public class CategoryController {

	@Autowired
	private ICategoryService iCategoryService;
	
	@GetMapping("/")
	public ResponseEntity<List<Category>> getAllCategorys(){
		List<Category> result = iCategoryService.getAllCategory();
		return ResponseEntity.ok()
				.header("X-Total-Count", String.valueOf(result.size()))
				.body(result);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Category> addCategory(@RequestBody CategoryDTO dto) {
		Category result = dto.convertToEntity();
		result = iCategoryService.addCategory(result);
		return ResponseEntity.ok()
				.body(result);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Category> updateCategory(@RequestBody CategoryDTO dto){
		Category result = dto.convertToEntity();
		result = iCategoryService.updateCategory(result);
		return ResponseEntity.ok()
				.body(result);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteCategory(@PathVariable(value = "id") int id) {
		iCategoryService.deleteCategory(id);
	}


	@GetMapping("/{id}")
	public ResponseEntity<Category> getCategoryById(@PathVariable("id") int id){
		Category result = iCategoryService.getCategoryById(id);
		return ResponseEntity.ok()
				.body(result);
	}
}
