package com.huynm.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huynm.bookstore.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
