package com.globomart.productprice.controller;

import java.net.URI;
import java.util.Arrays;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.globomart.productprice.beans.Product;
import com.globomart.productprice.config.PriceConfig;
import com.globomart.productprice.service.ProductPriceService;

/**
 * 
 * @author Sumit_Sonkhla
 *
 */
@RestController
@RequestMapping("products/price")
public class ProductPriceController {

    private  ProductPriceService service;

    private  LoadBalancerClient loadBalancerClient;

    public ProductPriceController(LoadBalancerClient loadBalancerClient, ProductPriceService priceService) {
        this.loadBalancerClient = loadBalancerClient;
        this.service = priceService;
    }

    @RequestMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPrice(@RequestParam(value = "type", required = true) final String type) {
        /*ServiceInstance serviceInstance = loadBalancerClient.choose(PriceConfig.SERVICE_NAME);
        URI uri = serviceInstance.getUri();
        String url = uri.toString() + "/findByType?type=" + type;*/
        Product product=new Product();
        product.setProductId("1");
        Product[] products={product};
        //Product[] products = (new RestTemplate()).getForObject(url, Product[].class);
        return service.getPrice(Arrays.asList(products));
    }
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello() {
        return "hi";
    }
}
