package com.nt.service;

import java.util.List;

import com.nt.document.Product;

public interface IProductService {
	
	public String registerProduct(Product p);
	
	public List<Product> getAllProduct();
	
	public Product showProductById(String pid);
	
	public String updatePrice(String pid,Float hikePrice);
	
	public String registerProducts(List<Product>list);
	
	public String removeProduct(String pid,String status);

}
