package com.huynm.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.huynm.bookstore.repository.UserRepository;

@Controller
public class LoginController {

	@Autowired
	UserRepository userRepository;
	
	@PostMapping("checkLogin")
	public String checkLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
		userRepository.findByUsername(username);
		if(userRepository..equals(username))
		return "cart.html";
	}
}
