package com.p1.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.p1.model.*;
import com.p1.service.*;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	//get mapping to retrive
	@GetMapping("/customer")
	private List<Customer>getAllcustomer(){
		return customerService.getAllcustomers();
	}
	
	//specific customer
	@GetMapping("/customer/{cid}")
	private Customer getBooks(@PathVariable("cid")int cid){
		return customerService.getcustomerById(cid);
	}
	
	//delete
	@DeleteMapping("/customerdel/{cid}")
	private void deleteCustomer(@PathVariable("cid")int cid) {
		customerService.delete(cid);
	}
	
	@PostMapping("/customeradd")
	private int saveCustomer(@RequestBody Customer customer) {
		customerService.saveOrUpdate(customer);
		return customer.getCid();
	}
	
	@PutMapping("/customerupd")
	private Customer update(@RequestBody Customer customer) {
		customerService.saveOrUpdate(customer);
		return customer;
	}

}
