package com.huynm.bookstore.service;

import java.util.List;
import java.util.Set;

import com.huynm.bookstore.model.Book;
import com.huynm.bookstore.model.Category;

public interface IBookService {
	// ham them 
		public Book addBook(Book book);
		
		public Book updateBook(int id, Book book);
		
		public boolean deleteBook(int id);
		
		public List<Book> getAllBook();
		
		public Book getBookById(int id);
		
		public Set<Book> searchBookByName(String name);
		
		public Set<Book> searchBookByAuthor(String author);
}
