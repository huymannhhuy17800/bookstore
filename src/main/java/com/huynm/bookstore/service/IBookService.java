package com.huynm.bookstore.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.huynm.bookstore.dto.BookDTO;
import com.huynm.bookstore.entities.Book;
import com.huynm.bookstore.entities.Category;

@Service
public interface IBookService {
	
		public Book addBook(Book book);
			
		public Book updateBook(int id, BookDTO dto);
		
		public void deleteBook(int id);
		
		public List<Book> getAllBook();
		
		public Book getBookById(int id);
		
		public Set<Book> searchBookByName(String name);
		
		public Set<Book> searchBookByAuthor(String author);
}
