package com.hcl.magenta.poc.entity;

import org.springframework.lang.NonNull;

public class ServiceResponseDTO {
	
	
	@NonNull
	private float value;
	
	@NonNull
	private String quantative;
	
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
	
}
