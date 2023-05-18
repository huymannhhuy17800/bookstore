package com.huynm.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.huynm.bookstore.dto.BookDTO;
import com.huynm.bookstore.entities.Book;
import com.huynm.bookstore.entities.User;
import com.huynm.bookstore.repository.BookRepository;
import com.huynm.bookstore.service.IBookService;



@RestController
@RequestMapping("/v1/api/book")
public class BookController {

	@Autowired
	private IBookService iBookService;
	
	@GetMapping("")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> result = (List<Book>) iBookService.getAllBook();
		return ResponseEntity.ok()
				.header("X-Total-Count", String.valueOf(result.size()))
				.body(result);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<Book> addBook(@RequestBody BookDTO dto){
		Book book = dto.convertToEntity();
		Book result = (Book) iBookService.addBook(book);
		return ResponseEntity.ok()
				.body(result);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Book> updateBook(@RequestBody BookDTO dto){
		Book result = dto.convertToEntity();
		result = iBookService.updateBook(result);
		return ResponseEntity.ok()
				.body(result);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable(value = "id") int id){
		iBookService.deleteBook(id);
	}
}
