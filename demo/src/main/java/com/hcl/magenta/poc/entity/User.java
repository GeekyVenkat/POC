package com.hcl.magenta.poc.entity;

public class User {

	String username;
	String password;

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public User() {
		
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}
