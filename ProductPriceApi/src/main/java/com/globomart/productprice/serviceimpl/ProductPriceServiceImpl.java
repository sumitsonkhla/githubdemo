package com.globomart.productprice.serviceimpl;

import java.util.List;

import com.globomart.productprice.beans.Product;
import com.globomart.productprice.dao.ProductPriceDao;
import com.globomart.productprice.service.ProductPriceService;

public class ProductPriceServiceImpl implements ProductPriceService{
	
	private ProductPriceDao dao;
	
	private static final String ERROR="No Product Found";
	
	public ProductPriceServiceImpl(ProductPriceDao dao){
		this.dao=dao;
		
	}

	@Override
	public String getPrice(List<Product> products) {
		if(products!=null && products.isEmpty()){
			return ERROR;
		}
		double value=dao.getPrice(products.get(0));
		if(value==-1){
			return ERROR;
		}else{
			return String.valueOf(value);
		}
	}

}
