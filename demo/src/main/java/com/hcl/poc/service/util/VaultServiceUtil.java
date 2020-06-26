package com.hcl.poc.service.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.hcl.poc.entities.VaultAuthRequest;
import com.hcl.poc.entities.VaultAuthResponse;
import com.hcl.poc.entities.VaultAuthTokenRequest;
import com.hcl.poc.entities.VaultTokenAuthResponse;
import com.hcl.poc.util.IConstants;

public class VaultServiceUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(VaultServiceUtil.class);
	
	public static VaultAuthResponse valutAuthRequest(String userName, String password, String serviceTok) {
		
		String authUrl = "http://127.0.0.1:8200/v1/auth/userpass/login/" +userName;
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set(IConstants.XVaultToken, serviceTok);
		
		VaultAuthRequest authRequest = new VaultAuthRequest();
		authRequest.setPassword(password);
		
		HttpEntity<VaultAuthRequest> request = 
			      new HttpEntity<VaultAuthRequest>(authRequest, headers);
		
		VaultAuthResponse vaultAuthresp = 
				 restTemplate.postForObject(authUrl, request, VaultAuthResponse.class);
		 
		return vaultAuthresp;
		
	}
	public static VaultTokenAuthResponse authenticatevalutToken(String vaiultToken, String serviceToken) {
		
		String authUrl = "http://127.0.0.1:8200/v1/auth/token/lookup";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set(IConstants.XVaultToken, vaiultToken);
		
		VaultAuthTokenRequest authRequest = new VaultAuthTokenRequest();
		authRequest.setToken(serviceToken);
		
		HttpEntity<VaultAuthTokenRequest> request = 
			      new HttpEntity<VaultAuthTokenRequest>(authRequest, headers);
		VaultTokenAuthResponse vaultAuthresp = null;
		try {
			vaultAuthresp = restTemplate.postForObject(authUrl, request,
					VaultTokenAuthResponse.class);
		} catch (Exception e) {
			logger.debug("Error Authenticating the Token "+vaultAuthresp);
		}
		return vaultAuthresp;
	}

}
