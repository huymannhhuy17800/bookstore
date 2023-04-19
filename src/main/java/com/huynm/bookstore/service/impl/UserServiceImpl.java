package com.huynm.bookstore.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.huynm.bookstore.config.jwt.JwtService;
import com.huynm.bookstore.entities.User;
import com.huynm.bookstore.repository.UserRepository;
import com.huynm.bookstore.service.IUserService;

@Component
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository userRepository;
	
	//private JwtService jwtService;

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User registerUser(User user) {
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		String encodePassword = bcrypt.encode(user.getPassword());
		user.setPassword(encodePassword);
		return userRepository.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username).get();
	}
}
