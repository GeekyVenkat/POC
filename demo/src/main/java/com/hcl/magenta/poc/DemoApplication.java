package com.hcl.magenta.poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hcl.magenta.poc.entity.Credential;
import com.hcl.poc.util.AssistanceComposite;


@SpringBootApplication
public class DemoApplication {

	private static Credential credentials;
	private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);
		
	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		credentials = context.getBean(Credential.class);
		logger.info("UserName :"+credentials.getUname());
		logger.info("Password :"+credentials.getPassword());
		logger.info("Password :"+credentials.getKey());
		AssistanceComposite.getInstance().setDBCredentails(credentials);
	}
	
}
