package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.repository.IProductRepository;
import java.util.*;

@Component
public class MangoDBAppRunner implements CommandLineRunner {

	@Autowired
	private IProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			//repo.findByPriceBetween(50.0f, 350.0f).forEach(System.out::println);
			repo.showProductDataByName("Butter").forEach(row->System.out.println(Arrays.toString(row)));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
