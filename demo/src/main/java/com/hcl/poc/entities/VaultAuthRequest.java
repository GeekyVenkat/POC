package com.hcl.poc.entities;

public class VaultAuthRequest {
	
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "{"
				+ "password=" + password + 
				"}";
	}


}
