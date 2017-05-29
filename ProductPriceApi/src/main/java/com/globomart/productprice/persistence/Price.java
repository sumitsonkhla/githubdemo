package com.globomart.productprice.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Price {

	@Id
	private long id;
	private String productId;
	private double price;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
