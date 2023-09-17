package com.pkg.w5d3a;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	int id;
	String ename;
	
	Address aobj; 
	public Emp() {}
	public Emp(int id, String ename, Address aobj) 
	{
		this.id=id;
		this.ename=ename;
		this.aobj=aobj;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAobj() {
		return aobj;
	}
	@Autowired //autowire by setter
	public void setAobj(Address aobj) {
		this.aobj = aobj;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", ename=" + ename + ", aobj=" + aobj + "]";
	}
	
}
