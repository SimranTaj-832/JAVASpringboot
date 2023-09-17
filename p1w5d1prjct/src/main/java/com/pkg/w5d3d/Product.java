package com.pkg.w5d3d;

public class Product {
	private int id;
	private String name;
	private String color;
	private double rate;
	public Product(){}
	public Product(int id, String name, String color, double rate) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.rate = rate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", color=" + color + ", rate=" + rate + "]\n";
	}
	
	
}
