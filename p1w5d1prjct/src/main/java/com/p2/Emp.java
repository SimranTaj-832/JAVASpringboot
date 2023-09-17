package com.p2;

public class Emp {
	int eid;
	String ename;
	double salary;
	
	public Emp(){}
	public Emp(int eid, String ename, double salary) {
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
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
		return "Emp [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
}
