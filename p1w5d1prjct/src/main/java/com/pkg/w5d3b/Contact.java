package com.pkg.w5d3b;

public class Contact {
	String city;
	String mob;
	String email;
	public Contact() {}
	public Contact(String city, String mob, String email) {
		super();
		this.city = city;
		this.mob = mob;
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contact [city=" + city + ", mob=" + mob + ", email=" + email + "]";
	}
	
}
