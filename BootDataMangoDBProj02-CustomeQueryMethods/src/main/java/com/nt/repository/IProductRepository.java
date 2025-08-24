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
	
	//find product by name 
	@Query(value="{name:?0}")
	public List<Product> showProductByName(String name);
	
	// show product by name and status
	@Query(value = "{name:?0, status:?1}")
	public List<Product> showProductByNameAndStatus(String name,String status);
	
	// show product within renge and result product name and price
	@Query(value = "{price:{$gte:?0,$lte:?1}}", fields = "{name:1,price:1}")
	public List<Object[]> showProductByRenge(Float start, Float end);
	
	
	
	

}
