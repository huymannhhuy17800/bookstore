package com.huynm.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huynm.bookstore.entities.Category;
import com.huynm.bookstore.entities.User;
import com.huynm.bookstore.service.IUserService;

@RestController
@RequestMapping("/v1/api/admin")
public class AdminController {

	@Autowired
	private IUserService iUserService;
	
	@GetMapping("/")
	public ResponseEntity<List<User>> getAallUser(){
		List<User> result = (List<User>) iUserService.getAllUser();
		return ResponseEntity.ok()
				.header("X-Total-Count", String.valueOf(result.size()))
				.body(result);
	}
}
