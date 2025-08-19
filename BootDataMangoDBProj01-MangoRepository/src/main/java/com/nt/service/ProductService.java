package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Product;
import com.nt.repository.IProductRepository;
@Service
public class ProductService implements IProductService{

	@Autowired
	private IProductRepository  repo;
	
	@Override
	public String registerProduct(Product p) {
		System.out.println("ProductService.registerProduct()");
		String idValue=repo.save(p).getId();
		return "Product Saved with id "+idValue;
	}

}
