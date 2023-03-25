package com.huynm.bookstore.dto;

public class LoginDTO {

	private String username;
	
	private String password;
	
	private boolean renemberMe;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isRenemberMe() {
		return renemberMe;
	}

	public void setRenemberMe(boolean renemberMe) {
		this.renemberMe = renemberMe;
	}

	@Override
	public String toString() {
		return "LoginDTO [username=" + username + ", password=" + password + ", renemberMe=" + renemberMe + "]";
	}
	
	
}
