package com.huynm.bookstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huynm.bookstore.entities.Role;
import com.huynm.bookstore.entities.User;
import com.huynm.bookstore.repository.RoleRepository;
import com.huynm.bookstore.service.IRoleService;

@Component
public class RoleServiceImpl implements IRoleService{

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public List<Role> getRoles() {
		return roleRepository.findAll();
	}

	@Override
	public Role getOne(int id) {
		return roleRepository.findById(id).get();
	}

	@Override
	public void addRole(Role role) {
		roleRepository.save(role);
	}

	@Override
	public Role findRoleByName(String name) {
		
		return roleRepository.findByName(name).get();
	}

}
