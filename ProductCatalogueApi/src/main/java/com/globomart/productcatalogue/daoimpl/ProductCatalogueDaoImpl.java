package com.globomart.productcatalogue.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.globalmart.productcatalogue.beans.Product;
import com.globomart.productcatalogue.dao.ProductCatalogueDao;
import com.globomart.productcatalogue.repo.ProductRepository;

public class ProductCatalogueDaoImpl implements ProductCatalogueDao {
	private ProductRepository repo;
	
	public ProductCatalogueDaoImpl(ProductRepository repo){
		this.repo=repo;
	}
	

	@Override
	public void addProduct(Product productVo) {
		repo.save(productVo);
	}

	@Override
	public List<Product> getProducts() {
		List<Product> products=new ArrayList<Product>();
		 repo.findAll().forEach(products::add);
		 return products;
	}

	@Override
	public void deleteProduct(String id) {

		Product prod=new Product();
		prod.setProductId(id);
		repo.save(prod);
	}

	@Override
	public List<Product> getProductsByTypAndNm(String type, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByType(String type) {
		return repo.findByProductType(type);
	}

	 
}
