//package com.huynm.bookstore.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.huynm.bookstore.model.LoginDTO;
//import com.huynm.bookstore.repository.UserRepository;
//
//@Controller
//public class LoginController {
//
//	@Autowired
//	UserRepository userRepository;
//	
//	@RequestMapping(value="/login")
//	public String getLoginForm() {
//		return "login.html";
//	}
//	
//	@PostMapping(value="/login")
//	public String checkLogin(@ModelAttribute(name="loginDTO") LoginDTO loginDTO,Model model) {
//		String username = loginDTO.getUsernameOrEmail();
//		String password = loginDTO.getPassword();
//	
//	}
//	
//}
