package com.globomart.productcatalogue.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.globomart.productcatalogue.controller.ProductCatalogueController;
import com.globomart.productcatalogue.dao.ProductCatalogueDao;
import com.globomart.productcatalogue.daoimpl.ProductCatalogueDaoImpl;
import com.globomart.productcatalogue.repo.ProductRepository;
import com.globomart.productcatalogue.service.ProductCatalogueService;
import com.globomart.productcatalogue.serviceimpl.ProductCatalogueServiceImpl;

/**
 * 
 * @author Sumit_Sonkhla
 *
 */
@Configuration
public class ApplicationConfig {
	@Autowired
	private ProductRepository repo;

    @Bean
    public ProductCatalogueService productService(final ProductCatalogueDao dao) {
        return new ProductCatalogueServiceImpl(dao);
    }
    
    @Bean
    public ProductCatalogueController productCatalogueController(final ProductCatalogueService service) {
        return new ProductCatalogueController(service);
    }

    @Bean
    public ProductCatalogueDao productCatalogueDao() {
        return new ProductCatalogueDaoImpl(repo);
    }
}
