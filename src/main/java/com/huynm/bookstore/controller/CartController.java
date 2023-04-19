package com.huynm.bookstore.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huynm.bookstore.service.IBookService;

@RestController
@RequestMapping("/v1/api/cart")
public class CartController {

	@Autowired
	private IBookService iBookService;

	@PostMapping("/get")
	public void getCart() {
		
	}

	@PutMapping("/add") public ResponseEntity<?> addToCart(@PathVariable("bookID") int bookID) {
		return (ResponseEntity<?>) ResponseEntity.ok();
	}

}
