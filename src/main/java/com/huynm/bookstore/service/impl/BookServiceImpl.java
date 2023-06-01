package com.huynm.bookstore.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huynm.bookstore.entities.Book;
import com.huynm.bookstore.repository.BookRepository;
import com.huynm.bookstore.service.BookService;

@Component
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book updateBook(Book book) {		
		return bookRepository.saveAndFlush(book);
	}

	@Override
	public void deleteBook(int id) {		
			bookRepository.deleteById(id);;			
	}

	@Override
	public List<Book> getAllBook() {	
		return bookRepository.findAll();
	}

	@Override
	public Book getBookById(int id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public Set<Book> searchBookByName(String name) {
		return bookRepository.searchBookByName(name);
	}

	@Override
	public Set<Book> searchBookByAuthor(String author) {
		return bookRepository.searchBookByAuthor(author);
	}

	@Override
	public List<Book> getBooksByCategory(int categoryId) {
		return bookRepository.getBooksByCategory(categoryId);
	}

	@Override
	public Book addBook(Book book) {
		try {
			return bookRepository.save(book);
		} catch (Exception e) {
			return null;
		}
		
	}
}
