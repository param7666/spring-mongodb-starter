package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.document.Product;
import java.util.*;

public interface IProductRepository extends MongoRepository<Product,String>{
	// finder methods
	public List<Product> findByPriceBetween(Float start,Float end);
	
	// Query methods
	@Query(value="{name:?0}", fields="{id:0,name:1,price:1}")
	public List<Object[]> showProductDataByName(String name);

}
