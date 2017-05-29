package com.globomart.productprice.ProductPriceApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.globomart.*")
@EnableJpaRepositories(basePackages = "com.globomart.productprice.repo")
@EntityScan(basePackages = "com.globomart.productprice.persistence")
public class ProductPriceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductPriceApiApplication.class, args);
	}
}
