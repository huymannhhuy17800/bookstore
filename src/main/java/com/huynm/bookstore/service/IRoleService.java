package com.huynm.bookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.huynm.bookstore.entities.Role;

@Service
public interface IRoleService {

	List<Role> getRoles();
	
	Role getOne(int id);
	
	void addRole(Role role);
	
	Role findRoleByName(String name);
}
