package com.demo2;

public class Emp1 {
	int eid;
	String ename;

	public Emp1() {	}

	public Emp1(int eid, String ename) {
	this.eid = eid;
	this.ename = ename;
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
	
	@Override
	public String toString() {
	return "Emp1 [eid=" + eid + ", ename=" + ename + "]";
	}


}
