package com.hcl.poc.util;

import com.hcl.magenta.poc.entity.Credential;

public class AssistanceComposite {

	private static AssistanceComposite _instance;
	private Credential credentials;
	

	private AssistanceComposite() {

	}

	public static AssistanceComposite getInstance() {
		if (_instance == null) {
			synchronized(AssistanceComposite.class) {
				if (_instance == null) {
					_instance = new AssistanceComposite();
				}
			}
		}
		return _instance;
	}

	public void setDBCredentails(Credential credentials) {
		this.credentials = credentials;
	}

	public Credential getDBCredentails() {
		return credentials;
	}
}
