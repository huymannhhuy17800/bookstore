package com.huynm.bookstore.controller;

import com.huynm.bookstore.entities.Book;
import com.huynm.bookstore.entities.OrderDetail;
import com.huynm.bookstore.service.CartService;
import com.huynm.bookstore.service.impl.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huynm.bookstore.service.BookService;

import java.util.Collection;

@RestController
@RequestMapping("/v1/api/cart")
public class CartController {

	@Autowired
	private BookService bookService;
	@Autowired
	private CartService cartService;

	@PostMapping("/")
	public ResponseEntity<?> viewCart() {
		Collection<OrderDetail> result = cartService.getAllCartItems();
		return ResponseEntity.ok().body(result);
	}

	@PutMapping("/add/{bookID}")
	public ResponseEntity<?> addToCart(Authentication auth,@PathVariable("bookID") int bookID) {
		Book book = bookService.getBookById(bookID);
		if(book != null){
			OrderDetail item = new OrderDetail();
			item.setBook(book);
			item.setPrice(book.getOriginalPrice());
			item.setQuantity(1);
			cartService.add(item);
		}
		return ResponseEntity.ok().body(auth.getName());
	}

	@PutMapping("/remove/{bookID}")
	public ResponseEntity<?> remove(@PathVariable("bookID") int bookID) {
		Book book = bookService.getBookById(bookID);
		if(book != null){
			OrderDetail item = new OrderDetail();
			item.setBook(book);
			item.setPrice(book.getOriginalPrice());
			item.setQuantity(1);
			cartService.add(item);
		}
		return ResponseEntity.ok().body(book);
	}

	@PutMapping("/clear/{bookID}")
	public ResponseEntity<?> clear(@PathVariable("bookID") int bookID) {
		Book book = bookService.getBookById(bookID);
		if(book != null){
			OrderDetail item = new OrderDetail();
			item.setBook(book);
			item.setPrice(book.getOriginalPrice());
			item.setQuantity(1);
			cartService.add(item);
		}
		return ResponseEntity.ok().body(book);
	}

}
