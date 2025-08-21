package com.nt.runner;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

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
		//REGISTER PRODUCT
//		try {
//			System.out.println("MangoDBAppRunner.run()");
//			Product p=new Product();
//			p.setName("Milk"); p.setPrice(100.0f); p.setQty(5.0f); 
//			p.setCompany("Amul"); p.setExpireDate(LocalDate.of(2025, 10 ,20));
//			
//			String msg=ser.registerProduct(p);
//			System.out.println(msg);
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		// GET ALL PRODUCT
//		try {
//			
//			ser.getAllProduct().forEach(System.out::println);
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		// GET PRODUCT BY ID
		
//		try {
//			Product p=ser.showProductById("68a4c3ce90b83fb4b7b976ed");
//			System.out.println(p);
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		//UPDATE PRODUCT PRICE
//		try {
//			
//			String msg=ser.updatePrice("68a4c3ce90b83fb4b7b976ed", 10.0F);
//			System.out.println(msg);
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		// ADD LIST OF PRODCUTS
		
//		try {
//			Product p1 = new Product();
//	        p1.setName("Milk");p1.setPrice(100.0f);
//	        p1.setQty(5.0f);p1.setCompany("Amul");p1.setExpireDate(LocalDate.of(2025, 10, 20));
//
//	        Product p2 = new Product();
//	        p2.setName("Bread"); p2.setPrice(40.0f);p2.setQty(10.0f);
//	        p2.setCompany("Britannia");
// p2.setExpireDate(LocalDate.of(2025, 9, 15));
//
//	        Product p3 = new Product();
//	        p3.setName("Butter");
//	        p3.setPrice(120.0f);
//	        p3.setQty(7.0f);
//	        p3.setCompany("Amul");
//	        p3.setExpireDate(LocalDate.of(2026, 1, 10));
//
//	        Product p4 = new Product();
//	        p4.setName("Cheese");
//	        p4.setPrice(250.0f);
//	        p4.setQty(4.0f);
//	        p4.setCompany("Amul");
//	        p4.setExpireDate(LocalDate.of(2026, 3, 5));
//
//	        Product p5 = new Product();
//	        p5.setName("Juice");
//	        p5.setPrice(80.0f);
//	        p5.setQty(20.0f);
//	        p5.setCompany("Real");
//	        p5.setExpireDate(LocalDate.of(2025, 12, 31));
//
//	        Product p6 = new Product();
//	        p6.setName("Biscuits");
//	        p6.setPrice(30.0f);
//	        p6.setQty(50.0f);
//	        p6.setCompany("Parle");
//	        p6.setExpireDate(LocalDate.of(2026, 2, 20));
//
//	        Product p7 = new Product();
//	        p7.setName("Ice Cream");
//	        p7.setPrice(150.0f);
//	        p7.setQty(15.0f);
//	        p7.setCompany("Kwality Walls");
//	        p7.setExpireDate(LocalDate.of(2025, 11, 5));
//
//	        Product p8 = new Product();
//	        p8.setName("Coke");
//	        p8.setPrice(60.0f);
//	        p8.setQty(25.0f);
//	        p8.setCompany("Coca-Cola");
//	        p8.setExpireDate(LocalDate.of(2026, 6, 15));
//
//	        Product p9 = new Product();
//	        p9.setName("Chips");
//	        p9.setPrice(50.0f);
//	        p9.setQty(30.0f);
//	        p9.setCompany("Lays");
//	        p9.setExpireDate(LocalDate.of(2026, 4, 12));
//
//	        Product p10 = new Product();
//	        p10.setName("Coffee");
//	        p10.setPrice(350.0f);
//	        p10.setQty(8.0f);
//	        p10.setCompany("Nescafe");
//	        p10.setExpireDate(LocalDate.of(2027, 1, 1));
//	        List<Product> list=List.of(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
//	        
//	        String message = ser.registerProducts(list);
//	        System.out.println(message);
//	        
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			
//			System.out.println(ser.removeProduct("Milk", "Active"));
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			Product prod=new Product();
			prod.setId(UUID.randomUUID().toString());
			prod.setName("milk"); prod.setPrice(100.0f); prod.setQty(5.0f); 
			prod.setCompany("Amul"); prod.setExpireDate(LocalDate.of(2025, 10 ,20));
			//use service
			String idVal=ser.registerProduct(prod);
			System.out.println("Product is saved with id Value::"+idVal);
		
		}
		catch(Exception  e) {
			e.printStackTrace();
		}
		
	}
	
	

}
