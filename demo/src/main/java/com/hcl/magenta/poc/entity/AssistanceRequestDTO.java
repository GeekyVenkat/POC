package com.hcl.magenta.poc.entity;

public class AssistanceRequestDTO {

	private String intent;
	private String context;
	private String serviceToken;
	
	public AssistanceRequestDTO() {
		
	}

	public AssistanceRequestDTO(String intent, String context) {
		super();
		this.intent = intent;
		this.context = context;
	}

	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getServiceToken() {
		return serviceToken;
	}

	public void setServiceToken(String serviceToken) {
		this.serviceToken = serviceToken;
	}
	

}
