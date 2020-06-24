package com.hcl.magenta.poc.bean;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.hcl.magenta.poc.entity.ServiceResponseDTO;

@Component
public class RevenueAssistanceServiceDAO {

	private static HashMap<String, ServiceResponseDTO> revenueMap = new HashMap<String, ServiceResponseDTO>();

	static {
		revenueMap.put("HCL", new ServiceResponseDTO(9.93f, "Billion"));
		revenueMap.put("HCL ERS", new ServiceResponseDTO(5.0f, "Billion"));
		revenueMap.put("HCL TECH", new ServiceResponseDTO(2.0f, "Billion"));
	}

	public void save() {

	}

	public ServiceResponseDTO findRevenue(String organisation) {
		return revenueMap.get(organisation);
	}

}
