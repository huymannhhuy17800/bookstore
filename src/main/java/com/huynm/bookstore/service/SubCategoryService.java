package com.huynm.bookstore.service;

import com.huynm.bookstore.entities.SubCategory;

import java.util.List;

public interface SubCategoryService {
    List<SubCategory> getAll();

    SubCategory getOne(int id);
}
