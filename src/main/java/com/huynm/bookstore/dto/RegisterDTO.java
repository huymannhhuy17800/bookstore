package com.huynm.bookstore.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.huynm.bookstore.entities.Role;
import com.huynm.bookstore.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDTO {

	private String username;
	
	private String password;
	
	private String email;
	
	private String phone;
	
	private String firstName;
	
	private String lastName;
	
	private Set<Role> roles = new HashSet<>();
	
	
	public User convertToEntity() {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setPhone(phone);
		user.setFirstname(firstName);
		user.setLastname(lastName);
		return user;
	}	
}
