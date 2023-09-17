package com.p1;

public class Product {
	private int id;
	private String pname;
	private String batchno;
	private double price;
	private int noofproducts;
	
	public Product() {}
	public Product(int id, String pname, String batchno, double price, int noofproducts) {
		super();
		this.id = id;
		this.pname = pname;
		this.batchno = batchno;
		this.price = price;
		this.noofproducts = noofproducts;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNoofproducts() {
		return noofproducts;
	}
	public void setNoofproducts(int noofproducts) {
		this.noofproducts = noofproducts;
	}
	

}
