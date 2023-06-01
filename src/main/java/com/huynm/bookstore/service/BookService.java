package com.huynm.bookstore.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.huynm.bookstore.entities.Book;

@Service
public interface BookService {
	
		Book addBook(Book book);
		
		Book updateBook(Book book);
		
		void deleteBook(int id);
		
		List<Book> getAllBook();
		
		Book getBookById(int id);
		
		Set<Book> searchBookByName(String name);
		
		Set<Book> searchBookByAuthor(String author);

		List<Book> getBooksByCategory(int categoryId);
}
