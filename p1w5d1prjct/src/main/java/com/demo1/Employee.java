package com.demo1;

public class Employee {
	int eid;
	String ename;
	double salary;

	public Employee() {	}
	
	public Employee(int eid, String ename, double salary) {
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
	}
	public int getEid() {
	return eid;
	}
	public void setEid(int eid) {
	this.eid = eid;
	}
	public String getEname() {
	return ename;
	}
	public void setEname(String ename) {
	this.ename = ename;
	}
	public double getSalary() {
	return salary;
	}
	public void setSalary(double salary) {
	this.salary = salary;
	}

	@Override
	public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
}
