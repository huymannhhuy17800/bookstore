package com.huynm.bookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.huynm.bookstore.dto.CategoryDTO;
import com.huynm.bookstore.entities.Category;

@Service
public interface ICategoryService {

	// ham them 
	public Category addCategory(Category category);
	
	public Category updateCategory(int id, CategoryDTO dto);
	
	public void deleteCategory(int id);
	
	public List<Category> getAllCategory();
	
}
