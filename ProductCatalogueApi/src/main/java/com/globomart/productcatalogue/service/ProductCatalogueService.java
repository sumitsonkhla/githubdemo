package com.globomart.productcatalogue.service;

import java.util.List;

import com.globalmart.productcatalogue.beans.Product;

public interface ProductCatalogueService {



    void addProduct(Product productVo);

    List<Product> getProducts();

    void deleteProduct(String id);

    List<Product> getProductsByTypAndNm(String type, String name);

    List<Product> getProductsByType(String type);

	
}
