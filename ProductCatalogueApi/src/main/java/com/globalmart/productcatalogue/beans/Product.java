package com.globalmart.productcatalogue.beans;

import javax.persistence.Entity;

/**
 * 
 * @author Sumit_Sonkhla
 * 
 *
 */
@Entity
public class Product {

	@javax.persistence.Id
	private String productId;
	
	private String productType;
	private String productName;
	private String description;
	
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
