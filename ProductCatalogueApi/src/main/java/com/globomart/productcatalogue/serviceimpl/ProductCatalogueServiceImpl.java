package com.globomart.productcatalogue.serviceimpl;

import java.util.List;

import com.globalmart.productcatalogue.beans.Product;
import com.globomart.productcatalogue.dao.ProductCatalogueDao;
import com.globomart.productcatalogue.service.ProductCatalogueService;

public class ProductCatalogueServiceImpl implements ProductCatalogueService {

	private ProductCatalogueDao dao; 
	
	public ProductCatalogueServiceImpl(ProductCatalogueDao dao){
		this.dao=dao;
	}
	
	@Override
	public void addProduct(Product productVo) {

		dao.addProduct(productVo);
	}

	@Override
	public List<Product> getProducts() {
		return dao.getProducts();
	}

	@Override
	public void deleteProduct(String id) {
		dao.deleteProduct(id);
		
	}

	@Override
	public List<Product> getProductsByTypAndNm(String type, String name) {
		return dao.getProductsByTypAndNm(type, name);
	}

	public List<Product> getProductsByType(String type) {
		return dao.getProductsByType(type);
	}

}
