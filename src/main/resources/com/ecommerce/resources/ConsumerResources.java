package com.ecommerce.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manfacturer")
public class ConsumerResources {
	
	
	public Products getProducts(@PathVariable("Id") String Id)
	{
		return new Products(Id, manfacturer:Dell);
	}

	
	
}
