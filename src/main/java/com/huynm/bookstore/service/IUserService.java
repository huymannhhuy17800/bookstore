package com.huynm.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.huynm.bookstore.entities.User;

@Service
public interface IUserService {

	List<User> getAllUser();
	
	User registerUser(User user);
	
	User findByUsername(String username);
}
