package com.huynm.bookstore.controller;

import java.util.ArrayList;
import java.util.List;

import com.huynm.bookstore.entities.Category;
import com.huynm.bookstore.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huynm.bookstore.dto.BookDTO;
import com.huynm.bookstore.entities.Book;
import com.huynm.bookstore.service.BookService;



@RestController
@RequestMapping("/v1/api/book")
public class BookController {

	@Autowired
	private BookService iBookService;

	
	@GetMapping("")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> result = iBookService.getAllBook();
		return ResponseEntity.ok()
				.header("X-Total-Count", String.valueOf(result.size()))
				.body(result);
	}
	
	
	@PostMapping("/add")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public ResponseEntity<Book> addBook(@RequestBody BookDTO dto){
		Book book = dto.convertToEntity();
		Book result = iBookService.addBook(book);
		List<Category> list = new ArrayList<>();
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

	@GetMapping("/category/{id}")
	public ResponseEntity<List<Book>> getBooksByCategory(@PathVariable int id){
		List<Book> result = iBookService.getBooksByCategory(id);
		return ResponseEntity.ok()
				.header("X-Total-Count", String.valueOf(result.size()))
				.body(result);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable int id){
		Book result =  iBookService.getBookById(id);
		return ResponseEntity.ok()
				.body(result);
	}


}
