package com.huynm.bookstore.service;

import java.util.List;

import com.huynm.bookstore.model.Category;

public interface ICategoryService {

	// ham them 
	public Category addCategory(Category category);
	
	public Category updateCategory(int id, Category category);
	
	public void deleteCategory(int id);
	
	public List<Category> getAllCategory();
	
}
