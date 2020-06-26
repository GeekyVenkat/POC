package com.hcl.poc.entities;

import java.util.List;

public class VaultTokenAuthResponse {

	private String request_id;
	private String lease_id;
	private String renewable;
	private String lease_duration;
	
	private TokenData data;
	
	private String wrap_info;
	private String warnings;
	
	private Auth auth;
	
	private List<Errors> errors;

	public String getRequest_id() {
		return request_id;
	}

	public List<Errors> getErrors() {
		return errors;
	}

	public void setErrors(List<Errors> errors) {
		this.errors = errors;
	}

	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}

	public String getLease_id() {
		return lease_id;
	}

	public void setLease_id(String lease_id) {
		this.lease_id = lease_id;
	}

	public String getRenewable() {
		return renewable;
	}

	public void setRenewable(String renewable) {
		this.renewable = renewable;
	}

	public String getLease_duration() {
		return lease_duration;
	}

	public void setLease_duration(String lease_duration) {
		this.lease_duration = lease_duration;
	}

	public TokenData getData() {
		return data;
	}

	public void setData(TokenData data) {
		this.data = data;
	}

	public String getWrap_info() {
		return wrap_info;
	}

	public void setWrap_info(String wrap_info) {
		this.wrap_info = wrap_info;
	}

	public String getWarnings() {
		return warnings;
	}

	public void setWarnings(String warnings) {
		this.warnings = warnings;
	}

	public Auth getAuth() {
		return auth;
	}

	public void setAuth(Auth auth) {
		this.auth = auth;
	}
}
