package com.clp.CLPValidation.Task;

import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication

public class ClpValidationTaskApplication {

	public static final Logger logger=LoggerFactory.getLogger(ClpValidationTaskApplication.class); 
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	public static void main(String[] args) {
		logger.info("The spring boot application is starting");
		SpringApplication.run(ClpValidationTaskApplication.class, args)
		logger.info("Application is started");
		
	}

}
