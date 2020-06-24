package com.hcl.magenta.poc.entity;

public class AuthorisationResponseDTO {

	private String token;
	private String expirationTime;

	public AuthorisationResponseDTO() {

	}

	public AuthorisationResponseDTO(String token, String expirationTime) {
		super();
		this.token = token;
		this.expirationTime = expirationTime;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(String expirationTime) {
		this.expirationTime = expirationTime;
	}

}
