package com.p1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	private IProductService productService;
	
	//mapping the getProduct() to /product
	@GetMapping(value="/product")
	public List<Product>getProduct(){
		//finds all prdcts
		List<Product> products=productService.findAll();
		return products;
	}

}
