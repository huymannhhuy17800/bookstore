package com.huynm.bookstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huynm.bookstore.dto.CategoryDTO;
import com.huynm.bookstore.entities.Category;
import com.huynm.bookstore.repository.CategoryRepository;
import com.huynm.bookstore.service.ICategoryService;

@Component
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	private CategoryRepository categoryRepository; 
	@Override
	public Category addCategory(Category category) {		
		return categoryRepository.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		return categoryRepository.saveAndFlush(category);
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
