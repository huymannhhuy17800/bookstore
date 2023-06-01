package com.huynm.bookstore.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.huynm.bookstore.entities.JwtResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huynm.bookstore.config.jwt.JwtService;
import com.huynm.bookstore.dto.LoginDTO;
import com.huynm.bookstore.dto.RegisterDTO;
import com.huynm.bookstore.entities.Role;
import com.huynm.bookstore.entities.User;
import com.huynm.bookstore.service.IRoleService;
import com.huynm.bookstore.service.IUserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {

	@Autowired
	private final IUserService iUserService;
	@Autowired
	private final IRoleService iRoleService;

	private final JwtService jwtService;

	private final AuthenticationManager authenticationManager;
	
	private final BCryptPasswordEncoder bcrypt;


	@PostMapping(value = "/authenticate")
	public ResponseEntity<?> authenticate(@RequestBody LoginDTO dto) {
		Authentication authentication =authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword()));
		User user = iUserService.findByUsername(dto.getUsername());
		user = (User) authentication.getPrincipal();
		List<String> roles = user.getAuthorities().stream().map(item -> item.getAuthority()).collect(Collectors.toList());	
		String jwtToken = jwtService.generateToken(user);
		return ResponseEntity.ok().body(new JwtResponse(jwtToken,user.getUsername(),user.getRoles()));

	}

	@PostMapping(value = "/register")
	public ResponseEntity<?> register(@RequestBody RegisterDTO dto) {
		User user = dto.convertToEntity();
		List<Role> roles = new ArrayList<>();
		roles.add(iRoleService.findRoleByName("ROLE_CUSTOMER"));
		user.setRoles(roles);
		user.setPassword(bcrypt.encode(user.getPassword()));
		iUserService.registerUser(user);
		String jwtToken = jwtService.generateToken(user);
		return ResponseEntity.ok().body(jwtToken);
	}

}
