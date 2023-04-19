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
	public Category updateCategory(int id, CategoryDTO dto) {
		if(categoryRepository.findById(id).isPresent()) {
			Category existingCategory = categoryRepository.findById(id).get();
			existingCategory.setName(dto.getName());
			Category updatedCategory = dto.convertToEntity();
			updatedCategory = categoryRepository.save(existingCategory);
			return updatedCategory;
		}
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
