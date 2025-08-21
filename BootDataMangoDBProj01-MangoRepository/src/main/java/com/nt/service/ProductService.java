package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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

	@Override
	public List<Product> getAllProduct() {
		return repo.findAll();
	}

	@Override
	public Product showProductById(String pid) {
		Product p=repo.findById(pid).orElseThrow(()-> new IllegalArgumentException("Invalid id"));
		return p;
	}

	@Override
	public String updatePrice(String pid, Float hikePrice) {
		Product prod=repo.findById(pid).orElseThrow(()-> new IllegalArgumentException("Invalid product id"));
		if(prod!=null) {
			prod.setPrice(prod.getPrice()+(prod.getPrice()*hikePrice/100));
			repo.save(prod);
		}
		return "Product price updated..."+prod.getPrice();
	}
	
	
	@Override
	public String registerProducts(List<Product>p) {
		List<Product> savedProds=repo.saveAll(p);
		List<String> ids=savedProds.stream().map(Product::getId).collect(Collectors.toList());
		return ids.size()+" no.of   docs are saved having id values ::"+ids;
		
	}

	@Override
	public String removeProduct(String name, String status) {
		// prepare document class object having given data
		Product prod=new Product();
		prod.setStatus(status);
		prod.setName(name);
		
		// prepare example object
		Example<Product> ex=Example.of(prod);
		
		// get all document
		List<Product> list=repo.findAll(ex);
		repo.deleteAll(list);
		
		return list.size()+" no.of product deleted...";
	}
	
	
	
	

}
