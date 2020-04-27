package com.ecommerce.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ProductConsumer {
     
	@JsonIgnoreProperties(ignoreUnknown = true)
	private Long id;
	private String productName;
	private String productType;
	private String manfacturer;
	private String productPrice;
	
	
	
	public ProductConsumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductConsumer(Long id, String productName, String productType, String manfacturer, String productPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.productType = productType;
		this.manfacturer = manfacturer;
		this.productPrice = productPrice;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getManfacturer() {
		return manfacturer;
	}
	public void setManfacturer(String manfacturer) {
		this.manfacturer = manfacturer;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "ProductConsumer [id=" + id + ", productName=" + productName + ", productType=" + productType
				+ ", manfacturer=" + manfacturer + ", productPrice=" + productPrice + "]";
	}
	
	

	
}
