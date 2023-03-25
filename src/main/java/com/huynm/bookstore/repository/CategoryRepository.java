package com.huynm.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huynm.bookstore.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
