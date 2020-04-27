package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EcommerceApplication1Application {
	
	
	@Bean
	public RestTemplate getRestTemplate ()
	{
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication1Application.class, args);
	}

}
