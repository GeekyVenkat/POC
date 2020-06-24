package com.hcl.magenta.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.magenta.poc.bean.RevenueAssistanceServiceDAO;
import com.hcl.magenta.poc.entity.AssistanceRequestDTO;
import com.hcl.magenta.poc.entity.ServiceResponseDTO;



@RestController
public class AssitanceService {
	
	private static final Logger logger = LoggerFactory.getLogger(AssitanceService.class);
	
	@Autowired(required=true)
	private RevenueAssistanceServiceDAO _service;

	@RequestMapping(value = "/assistanceSerivice/getRevenue")
	public String getRevenue() {
		return "9.93$ Billion";
	}

	@RequestMapping(value = "/assistanceService/getInfo", method = RequestMethod.POST)
	public ServiceResponseDTO getInfo(@RequestBody AssistanceRequestDTO request) {
		logger.info("Inside getInfo Service "+request.getIntent());
		ServiceResponseDTO resp =_service.findRevenue(request.getContext());
		logger.info("Inside getInfo Service "+resp.getValue());
		return _service.findRevenue(request.getContext());
	}
	

}
