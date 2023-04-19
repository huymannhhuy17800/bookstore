package com.huynm.bookstore;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import com.huynm.bookstore.entities.Role;
import com.huynm.bookstore.entities.User;

@SpringBootTest
class BookstoreApplicationTests {

	@Test
	void contextLoads() {
	}

	public static void main(String[] args) {
		Authentication authentication =  authenticationManager.authenticate(new 
				UsernamePasswordAuthenticationToken(dto.getUsername(),dto.getPassword()));
		if(authentication.isAuthenticated()) {
			//User user = dto.convertToEntity();
			User user = iUserService.findByUsername(dto.getUsername());
			String jwtToken = jwtService.generateToken(user);
			return jwtToken;
	}
}
