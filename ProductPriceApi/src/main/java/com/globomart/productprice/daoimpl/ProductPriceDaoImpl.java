package com.globomart.productprice.daoimpl;

import java.util.List;

import com.globomart.productprice.beans.Product;
import com.globomart.productprice.dao.ProductPriceDao;
import com.globomart.productprice.persistence.Price;
import com.globomart.productprice.repo.PriceRepository;

public class ProductPriceDaoImpl implements ProductPriceDao {
	
	private PriceRepository repo;
	
	public ProductPriceDaoImpl(PriceRepository repo){
		this.repo=repo;
	}

	@Override
	public double getPrice(Product product) {
		List<Price> price=repo.getByProductId(product.getProductId());
		if(price!=null && !price.isEmpty())
			return price.get(0).getPrice();
		return -1;
	}

}
