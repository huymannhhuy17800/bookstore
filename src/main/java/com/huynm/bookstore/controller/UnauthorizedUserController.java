package com.huynm.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huynm.bookstore.dto.RegisterDTO;
import com.huynm.bookstore.entities.User;
import com.huynm.bookstore.service.IUserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("v1/api/register")
@RequiredArgsConstructor
public class UnauthorizedUserController {

	@Autowired
	private IUserService iUserService;
	
	
	@PostMapping(value = "/")
	public ResponseEntity<User> register(@RequestBody RegisterDTO dto){
		User result = dto.convertToEntity();
		iUserService.registerUser(result);
		return ResponseEntity.ok().body(result);
	}
	
	
}
