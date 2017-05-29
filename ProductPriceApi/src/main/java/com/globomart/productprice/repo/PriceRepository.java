package com.globomart.productprice.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.globomart.productprice.persistence.Price;

public interface PriceRepository extends CrudRepository<Price, Long> {
	
	List<Price> getByProductId(String productId);

}
