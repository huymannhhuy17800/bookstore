package com.huynm.bookstore.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.huynm.bookstore.entities.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image,Integer>{

	//Set<Image> getImageByBookID (int bookID);
}
