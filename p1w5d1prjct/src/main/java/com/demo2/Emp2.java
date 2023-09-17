package com.demo2;

public class Emp2 extends Emp1{
	String month;
	double amount;

	public Emp2() {
	super();
	}

	public Emp2(int eid, String ename, String month, double amount) {
	super(eid, ename);
	this.month=month;
	this.amount=amount;
	}
	
	public String getMonth() {
	return month;
	}
	public void setMonth(String month) {
	this.month = month;
	}
	public double getAmount() {
	return amount;
	}
	public void setAmount(double amount) {
	this.amount = amount;
	}
}
