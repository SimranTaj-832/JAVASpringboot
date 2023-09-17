package com.pkg.w5d3d;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	ProductJdbc pjt=(ProductJdbc)context.getBean("prdJdtempl");
	
	//display current state of product table
	List<Product> prd=pjt.getAllProducts();
	System.out.println("Current State of Product table- ");
	//System.out.println(prd);
	System.out.println("Id\tName\tColour\tRating");
	for(Product p: prd) {
		System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getColor()+"\t"+p.getRate());
		
	}
	
	
	//insert new product
	pjt.insertProduct(205,"hp","red",4.5);
			
			//display inserted employee
			Product insertedProduct = pjt.getProductById(202);
			System.out.println("Inserted Products information: ");
			System.out.println(insertedProduct);
			
			//Display current state of employee after insert
			prd=pjt.getAllProducts();
			System.out.println("current state of product after insert");
			//System.out.println(prd);
			System.out.println("Id\tName\tColour\tRating");
			for(Product p: prd) {
				System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getColor()+"\t"+p.getRate());
				
			}

			
			//update Product
			Product updatedProduct=pjt.updateProduct("dell",203);
			System.out.println("Updated product details: ");
			System.out.println(updatedProduct);
			
			//delete product
			pjt.deleteProduct(205);
			
			prd=pjt.getAllProducts();
			System.out.println("Current state of product table: ");
			//System.out.println(prd);
			System.out.println("Id\tName\tColour\tRating");
			for(Product p: prd) {
				System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getColor()+"\t"+p.getRate());
				
			}

			((AbstractApplicationContext)context).close();
	}
	
}
