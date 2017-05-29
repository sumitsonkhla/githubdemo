package com.globomart.productcatalogue.dao;

import java.util.List;

import com.globalmart.productcatalogue.beans.Product;

public interface ProductCatalogueDao {

	 void addProduct(Product productVo);

	    List<Product> getProducts();

	    void deleteProduct(String id);

	    List<Product> getProductsByTypAndNm(String type, String name);

	    List<Product> getProductsByType(String type);
}
