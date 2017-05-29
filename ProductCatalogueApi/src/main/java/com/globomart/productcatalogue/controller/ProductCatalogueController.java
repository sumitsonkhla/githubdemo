package com.globomart.productcatalogue.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.globalmart.productcatalogue.beans.Product;
import com.globomart.productcatalogue.service.ProductCatalogueService;

/**
 * 
 * @author Sumit_Sonkhla
 *
 */
@RestController
public class ProductCatalogueController {
	


    private final ProductCatalogueService productCatalogueService;
    
    

    public ProductCatalogueController(ProductCatalogueService productService) {
        this.productCatalogueService = productService;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addProduct(@RequestBody  Product productVo) {
        productCatalogueService.addProduct(productVo);
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProductsByTypeAndName(@RequestParam(value = "type", required = false)  String type, @RequestParam(value = "name", required = false)  String name) {
        return productCatalogueService.getProductsByTypAndNm(type, name);
    }

    @RequestMapping(value = "/findByType", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProductsByTypAndNm(@RequestParam(value = "type", required = false)  String type) {
        return productCatalogueService.getProductsByType(type);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProducts() {
        return productCatalogueService.getProducts();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteProduct(@PathVariable final String id) {
        productCatalogueService.deleteProduct(id);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello() {
        return "hi";
    }
}
