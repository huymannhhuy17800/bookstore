package com.huynm.bookstore.service.impl;

import com.huynm.bookstore.entities.SubCategory;
import com.huynm.bookstore.repository.SubCategoryRepository;
import com.huynm.bookstore.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubCategoryServiceImpl implements SubCategoryService {

    @Autowired
    private SubCategoryRepository subCategoryRepository;
    @Override
    public List<SubCategory> getAll() {
        return subCategoryRepository.findAll();
    }

    @Override
    public SubCategory getOne(int id) {
        return subCategoryRepository.findById(id).get();
    }
}
