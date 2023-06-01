package com.huynm.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.huynm.bookstore.entities.Category;
import com.huynm.bookstore.entities.User;
import com.huynm.bookstore.service.IUserService;

@RestController
@RequestMapping("/v1/api/admin")
@Validated
public class AdminController {

	@Autowired
	private IUserService iUserService;
	
	@GetMapping("/")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public ResponseEntity<List<User>> getAllUser(){
		List<User> result = (List<User>) iUserService.getAllUser();
		return ResponseEntity.ok()
				.header("X-Total-Count", String.valueOf(result.size()))
				.body(result);
	}

	@GetMapping("/{id}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public ResponseEntity<User> getUserById(@PathVariable int id){
		User result = iUserService.findUserById(id);
		return ResponseEntity.ok().body(result);
	}

//	@PutMapping("/disable/{id}")
//	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
//	public ResponseEntity<?> disable(@PathVariable int id){
//		User user = iUserService.findUserById(id);
//		if(user.isEnabled()==true){
//		}
//
//	}
}
