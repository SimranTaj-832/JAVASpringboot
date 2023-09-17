package com.pkg.w5d3b;

public class Address {
	int hno;
	String locality;
	String city;
	public Address() {}
	public Address(int hno, String locality, String city) {
		super();
		this.hno = hno;
		this.locality = locality;
		this.city = city;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", locality=" + locality + ", city=" + city + "]";
	}
	
}
