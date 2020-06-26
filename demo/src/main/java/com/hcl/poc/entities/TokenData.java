package com.hcl.poc.entities;

import java.util.List;

public class TokenData {

	private String accessor;
	private long creation_time;
	private int creation_ttl;
	
	private String display_name;
	private String entity_id;
	private String expire_time;
	
	private int explicit_max_ttl;
	
	private String id;
	private String issue_time;
	private Metadata meta;
	
	private int num_uses;
	private String orphan;
	private String path;
	
	private List<Policies> policies;
	private boolean renewable;
	private int ttl;
	private String type;
	
	public String getAccessor() {
		return accessor;
	}
	public void setAccessor(String accessor) {
		this.accessor = accessor;
	}
	public long getCreation_time() {
		return creation_time;
	}
	public void setCreation_time(long creation_time) {
		this.creation_time = creation_time;
	}
	public int getCreation_ttl() {
		return creation_ttl;
	}
	public void setCreation_ttl(int creation_ttl) {
		this.creation_ttl = creation_ttl;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public String getEntity_id() {
		return entity_id;
	}
	public void setEntity_id(String entity_id) {
		this.entity_id = entity_id;
	}
	public String getExpire_time() {
		return expire_time;
	}
	public void setExpire_time(String expire_time) {
		this.expire_time = expire_time;
	}
	public int getExplicit_max_ttl() {
		return explicit_max_ttl;
	}
	public void setExplicit_max_ttl(int explicit_max_ttl) {
		this.explicit_max_ttl = explicit_max_ttl;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIssue_time() {
		return issue_time;
	}
	public void setIssue_time(String issue_time) {
		this.issue_time = issue_time;
	}
	public Metadata getMeta() {
		return meta;
	}
	public void setMeta(Metadata meta) {
		this.meta = meta;
	}
	public int getNum_uses() {
		return num_uses;
	}
	public void setNum_uses(int num_uses) {
		this.num_uses = num_uses;
	}
	public String getOrphan() {
		return orphan;
	}
	public void setOrphan(String orphan) {
		this.orphan = orphan;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public List<Policies> getPolicies() {
		return policies;
	}
	public void setPolicies(List<Policies> policies) {
		this.policies = policies;
	}
	public boolean isRenewable() {
		return renewable;
	}
	public void setRenewable(boolean renewable) {
		this.renewable = renewable;
	}
	public int getTtl() {
		return ttl;
	}
	public void setTtl(int ttl) {
		this.ttl = ttl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
