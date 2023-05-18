package com.huynm.bookstore.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huynm.bookstore.dto.BookDTO;
import com.huynm.bookstore.entities.Book;
import com.huynm.bookstore.repository.BookRepository;
import com.huynm.bookstore.service.IBookService;

@Component
public class BookServiceImpl implements IBookService{

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Book> searchBookByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Book> searchBookByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
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
