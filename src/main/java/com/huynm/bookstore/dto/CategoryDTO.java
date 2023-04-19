package com.huynm.bookstore.dto;

import com.huynm.bookstore.entities.Category;

public class CategoryDTO {

	private String name ;
	
	public Category convertToEntity() {
		Category category = new Category();
		category.setName(name);
		return category;
	}
	
	public CategoryDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
