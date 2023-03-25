package com.huynm.bookstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.huynm.bookstore.model.Category;
import com.huynm.bookstore.repository.CategoryRepository;
import com.huynm.bookstore.service.ICategoryService;

public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	private CategoryRepository categoryRepository; 
	@Override
	public Category addCategory(Category category) {		
		return categoryRepository.save(category);
	}

	@Override
	public Category updateCategory(int id, Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCategory(int id) {		
		categoryRepository.deleteById(id);
	}

	@Override
	public List<Category> getAllCategory() {	
		return categoryRepository.findAll();
	}

}
