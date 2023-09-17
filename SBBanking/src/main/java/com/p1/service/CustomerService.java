package com.p1.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.p1.model.*;
import com.p1.repository.*;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	//get all customers
	public List<Customer>getAllcustomers(){
		List<Customer>customer=new ArrayList<Customer>();
		customerRepository.findAll().forEach(customer1->customer.add(customer1));
		return customer;
	}
	
	//getting specific record
	public Customer getcustomerById(int cid) {
		return customerRepository.findById(cid).get();
	}
	//save r update
	public void saveOrUpdate(Customer customer) {
		customerRepository.save(customer);
	}
	//delete
	public void delete(int cid) {
		customerRepository.deleteById(cid);
	}

}
