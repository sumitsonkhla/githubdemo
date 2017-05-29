package com.globomart.productprice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.globomart.productprice.controller.ProductPriceController;
import com.globomart.productprice.dao.ProductPriceDao;
import com.globomart.productprice.daoimpl.ProductPriceDaoImpl;
import com.globomart.productprice.repo.PriceRepository;
import com.globomart.productprice.service.ProductPriceService;
import com.globomart.productprice.serviceimpl.ProductPriceServiceImpl;

@Configuration
public class ApplicationConfig {

	@Autowired
	private PriceRepository repo;


   

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    

    @Bean
    public ProductPriceDao productPriceDao() {
        return new ProductPriceDaoImpl(repo);
    }

    @Bean
    public ProductPriceService productPriceService( ProductPriceDao dao) {
        return new ProductPriceServiceImpl(dao);
    }
    @Bean
    public ProductPriceController productPriceController( LoadBalancerClient loadBalancerClient, ProductPriceService pricingService) {
        return new ProductPriceController(loadBalancerClient, pricingService);
    }

  

}
