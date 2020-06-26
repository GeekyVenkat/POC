package com.hcl.poc.entities;

import java.util.List;

public class Auth {
	
	private String client_token;
	private String accessor;
	
	private List<Policies> policies;
	private List<TokenPolicies> token_policies;
	
	private Metadata metadata;
	
	private String lease_duration;
	private String renewable;
	private String entity_id;
	private String token_type;

	private String orphan;

	public String getClient_token() {
		return client_token;
	}

	public void setClient_token(String client_token) {
		this.client_token = client_token;
	}

	public String getAccessor() {
		return accessor;
	}

	public void setAccessor(String accessor) {
		this.accessor = accessor;
	}

	public String getLease_duration() {
		return lease_duration;
	}

	public void setLease_duration(String lease_duration) {
		this.lease_duration = lease_duration;
	}

	public String getRenewable() {
		return renewable;
	}

	public void setRenewable(String renewable) {
		this.renewable = renewable;
	}

	public String getEntity_id() {
		return entity_id;
	}

	public void setEntity_id(String entity_id) {
		this.entity_id = entity_id;
	}

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public String getOrphan() {
		return orphan;
	}

	public void setOrphan(String orphan) {
		this.orphan = orphan;
	}

	public List<Policies> getPolicies() {
		return policies;
	}

	public void setPolicies(List<Policies> policies) {
		this.policies = policies;
	}

	public List<TokenPolicies> getToken_policies() {
		return token_policies;
	}

	public void setToken_policies(List<TokenPolicies> token_policies) {
		this.token_policies = token_policies;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
