package com.huynm.bookstore.controller;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huynm.bookstore.config.jwt.JwtService;
import com.huynm.bookstore.dto.LoginDTO;
import com.huynm.bookstore.dto.RegisterDTO;
import com.huynm.bookstore.entities.User;
import com.huynm.bookstore.service.IUserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {

	@Autowired
	private final IUserService iUserService;
	
	private final JwtService jwtService;
	
	private final AuthenticationManager authenticationManager;
	
	//public static final Logger logger = Logger.getLogger(AuthenricationController.class);
	
	@PostMapping(value = "/authenticate")
	public String authenticate(@RequestBody LoginDTO dto){
		Authentication authentication =  authenticationManager.authenticate(new 
				UsernamePasswordAuthenticationToken(dto.getUsername(),dto.getPassword()));
//		if(!authentication.isAuthenticated()) {
//			//User user = dto.convertToEntity();
//			User user = iUserService.findByUsername(dto.getUsername());
//			user = dto.convertToEntity();
//			String jwtToken = jwtService.generateToken(user);
//			return jwtToken;
//		}else {
//			return "invalid";
//		}
//		
		return "invalid";
	}
	
	@PostMapping(value = "/register")
	public ResponseEntity<?> register(@RequestBody RegisterDTO dto){
		User result = dto.convertToEntity();
		iUserService.registerUser(result);
		String jwtToken = jwtService.generateToken(result);
		return ResponseEntity.ok().body(jwtToken);
	}
		
}
