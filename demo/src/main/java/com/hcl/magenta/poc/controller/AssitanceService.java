package com.hcl.magenta.poc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.magenta.poc.bean.RevenueAssistanceServiceDAO;
import com.hcl.magenta.poc.entity.AssistanceRequestDTO;
import com.hcl.magenta.poc.entity.AuthenticationRequest;
import com.hcl.magenta.poc.entity.AuthenticationResponse;
import com.hcl.magenta.poc.entity.ServiceResponseDTO;
import com.hcl.poc.entities.VaultAuthResponse;
import com.hcl.poc.entities.VaultTokenAuthResponse;
import com.hcl.poc.service.util.VaultServiceUtil;
import com.hcl.poc.util.IConstants;



@RestController
public class AssitanceService {
	
	private static final Logger logger = LoggerFactory.getLogger(AssitanceService.class);
	
	@Autowired(required=true)
	private RevenueAssistanceServiceDAO _service;

	@RequestMapping(value = "/assistanceSerivice/getRevenue")
	public String getRevenue() {
		return "9.93$ Billion";
	}
	
	@Autowired
	private Environment env;

	@RequestMapping(value = "/assistanceService/getInfo", method = RequestMethod.POST)
	public ServiceResponseDTO getInfo(@RequestBody AssistanceRequestDTO request) {
		logger.info("Inside getInfo Service "+request.getIntent());
		VaultTokenAuthResponse response = VaultServiceUtil.authenticatevalutToken(getPropertyValue(IConstants.vaultServiceToken), request.getServiceToken());
		
		if(response ==null || response.getData() == null) {
			ServiceResponseDTO serviceresp = new ServiceResponseDTO();
			serviceresp.setErrorCode("E02");
			serviceresp.setErrorMessage("Authentication Failed InValid Token");
			return serviceresp;
		}
		logger.info(response.getData().getAccessor());
		logger.info(response.getData().getExpire_time());
		
		ServiceResponseDTO resp =_service.findRevenue(request.getContext());
		logger.info("Inside getInfo Service "+resp.getValue());
		return _service.findRevenue(request.getContext());
	}
	
	@RequestMapping(value = "/assistanceService/authenticate", method = RequestMethod.POST)
	public AuthenticationResponse authenticte(@RequestBody AuthenticationRequest request) {
		
		AuthenticationResponse response = new AuthenticationResponse();
		VaultAuthResponse vaultAuthResponse = VaultServiceUtil.valutAuthRequest(request.getUsername(), request.getPassword(), getPropertyValue(IConstants.vaultServiceToken));
		
		if (vaultAuthResponse== null) {
			logger.info("Error when authenticating with User"+request.getUsername());
			response.setErrorCode("01");
			response.setErrorMessage("Error while Authenticating with user name ");
		}
		logger.info("Error when authenticating with User"+vaultAuthResponse.getAuth().getClient_token());
		response.setServiceToken(vaultAuthResponse.getAuth().getClient_token());
		
		return response;
	}
	 
	@GetMapping("/property")
	public String getPropertyValue(@RequestParam("key") String key) {
		String returnValue = "No value";
		
		String keyValue = env.getProperty(key);

		if (keyValue != null && !keyValue.isEmpty()) {
			returnValue = keyValue;
		}
		return returnValue;
	}
	 
}
