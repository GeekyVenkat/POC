package com.hcl.magenta.poc.entity;

import org.springframework.lang.NonNull;

public class ServiceResponseDTO {
	
	
	@NonNull
	private float value;
	
	@NonNull
	private String quantative;
	
	private String errorCode;
	
	private String errorMessage;
	
	public ServiceResponseDTO() {
		
	}
	
	public ServiceResponseDTO(float value, String quantative) {
		super();
		this.value = value;
		this.quantative = quantative;
	}
	
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public String getQuantative() {
		return quantative;
	}
	public void setQuantative(String quantative) {
		this.quantative = quantative;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
