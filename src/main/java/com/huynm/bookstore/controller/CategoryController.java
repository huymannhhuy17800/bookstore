package com.huynm.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huynm.bookstore.model.Category;
import com.huynm.bookstore.repository.CategoryRepository;

@RestController
@RequestMapping("/v1/api/category")
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;
	
	@GetMapping("/")
	public ResponseEntity<List<Category>> getAllCategorys(){
		List<Category> result = (List<Category>) categoryRepository.findAll();
		return ResponseEntity.ok()
				.header("X-Total-Count", String.valueOf(result.size()))
				.body(result);
	}
	
	public ResponseEntity<Category> addCategory() {
		return null;
		
	}
}
