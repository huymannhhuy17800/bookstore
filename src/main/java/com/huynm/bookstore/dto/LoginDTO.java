package com.huynm.bookstore.dto;

import java.io.Serializable;

import com.huynm.bookstore.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDTO implements Serializable{

	private String username;
	
	private String password;
	
	public User convertToEntity() {
		User user = new User();
		user.setUsername(this.username);
		user.setPassword(this.password);
		return user;
	}
	
}
