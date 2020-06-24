package com.hcl.magenta.poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hcl.magenta.poc.entity.Credential;


@SpringBootApplication
public class DemoApplication {

	private static Credential credential;
	private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	
	
	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		credential = context.getBean(Credential.class);
		logger.info("UserName :"+credential.getUname());
		logger.info("Password :"+credential.getPassword());
		logger.info("Password :"+credential.getKey());
	}

}
