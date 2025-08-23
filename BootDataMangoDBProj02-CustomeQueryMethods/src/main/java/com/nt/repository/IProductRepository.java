package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.nt.document.Product;
import java.util.*;

public interface IProductRepository extends MongoRepository<Product,String>{
	
	public List<Product> findByPriceBetween(Float start,Float end);

}
