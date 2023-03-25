package com.huynm.bookstore.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.huynm.bookstore.model.Image;

public interface ImageRepository extends JpaRepository<Image,Integer>{

	Set<Image> getImageByBookID (int bookID);
}
