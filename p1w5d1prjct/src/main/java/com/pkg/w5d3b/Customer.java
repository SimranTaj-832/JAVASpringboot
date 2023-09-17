package com.pkg.w5d3b;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	int id;
	String cname;
	@Autowired
	Account acc_details;
	
	@Autowired
	Contact c_details;
	
	public Customer() {}
	public Customer(int id, String cname, Account acc_details, Contact c_details) {
		super();
		this.id = id;
		this.cname = cname;
		this.acc_details = acc_details;
		this.c_details = c_details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Account getAcc_details() {
		return acc_details;
	}

	public void setAcc_details(Account acc_details) {
		this.acc_details = acc_details;
	}

	public Contact getC_details() {
		return c_details;
	}

	public void setC_details(Contact c_details) {
		this.c_details = c_details;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", cname=" + cname + ", acc_details=" + acc_details + ", c_details=" + c_details
				+ "]";
	}
	
	
	
}
