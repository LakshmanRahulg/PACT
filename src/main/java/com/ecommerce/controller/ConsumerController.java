package com.ecommerce.controller;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.entities.ProductConsumer;
import com.ecommerce.service.ProductImpl;

@RestController
@RequestMapping("/myapp")
public class ConsumerController {
	
	@Autowired
	ProductConsumerService productConsumerService;
	private RestTemplate restTemplate;
	
	/*@GetMapping("keepAlive")
    public ResponseEntity<String> keepAlive() {
        return ResponseEntity.ok("Keep_alive");
    }*/
	
	@GetMapping("/products")
	public List<ProductConsumer> getProducts()
	{
		
		String url = "http://localhost:8080/products";
		ProductConsumer[] products = restTemplate.getForObject(url, ProductConsumer[].class);
		return Arrays.asList(products);
		}
	
	
		
    }
	
	
	

