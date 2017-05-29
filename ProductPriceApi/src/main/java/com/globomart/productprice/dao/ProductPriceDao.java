package com.globomart.productprice.dao;

import java.util.List;

import com.globomart.productprice.beans.Product;

public interface ProductPriceDao {

	public double getPrice(Product product);
}
