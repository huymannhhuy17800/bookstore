package com.huynm.bookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.huynm.bookstore.dto.CategoryDTO;
import com.huynm.bookstore.entities.Category;

@Service
public interface ICategoryService {

	// ham them 
	Category addCategory(Category category);
	
	Category updateCategory(Category category);
	
	void deleteCategory(int id);
	
	List<Category> getAllCategory();

	Category getCategoryById(int id);
	
}
