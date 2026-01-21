package com.cbdcconsumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Cbdcconsumer1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cbdcconsumer1Application.class, args);
	}
	
	
//	@Bean
	public RestTemplate createObject() {
		return new RestTemplate();
	}

}
