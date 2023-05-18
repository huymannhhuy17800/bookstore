package com.huynm.bookstore.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.huynm.bookstore.dto.BookDTO;
import com.huynm.bookstore.entities.Book;
import com.huynm.bookstore.entities.Category;

@Service
public interface IBookService {
	
		Book addBook(Book book);
		
		Book updateBook(Book book);
		
		void deleteBook(int id);
		
		List<Book> getAllBook();
		
		Book getBookById(int id);
		
		Set<Book> searchBookByName(String name);
		
		Set<Book> searchBookByAuthor(String author);
}
