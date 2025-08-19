package com.nt.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Product;
import com.nt.service.IProductService;

@Component
public class MangoDBAppRunner implements CommandLineRunner {

	@Autowired
	private IProductService ser;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			System.out.println("MangoDBAppRunner.run()");
			Product p=new Product();
			p.setName("Milk"); p.setPrice(100.0f); p.setQty(5.0f); 
			p.setCompany("Amul"); p.setExpireDate(LocalDate.of(2025, 10 ,20));
			
			String msg=ser.registerProduct(p);
			System.out.println(msg);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
