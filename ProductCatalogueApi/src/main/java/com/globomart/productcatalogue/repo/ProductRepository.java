package com.globomart.productcatalogue.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.globalmart.productcatalogue.beans.Product;

public interface ProductRepository extends CrudRepository<Product, String>{
	
	List<Product> findByProductType(String type);
	
	List<Product> findByProductName(String Name);

} 
