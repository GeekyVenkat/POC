package com.hcl.poc.entities;

public class TokenPolicies {

	private String Default;
	

	public TokenPolicies(String default1) {
		super();
		Default = default1;
	}
	
	public TokenPolicies() {
		
	}

	public String getDefault() {
		return Default;
	}

	public void setDefault(String default1) {
		Default = default1;
	}
}
