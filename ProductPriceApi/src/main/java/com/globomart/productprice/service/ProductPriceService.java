package com.globomart.productprice.service;

import java.util.List;

import com.globomart.productprice.beans.Product;

public interface ProductPriceService {
	
	public String getPrice(List<Product> products);

}
