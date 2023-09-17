package com.p1.bank;

public class Customer {
	private int cid;
	private String cname;	
	private String dob;
	private String email;
	private String pass;
	
	public Customer() {}

	public Customer(int cid, String cname, String dob, String email, String pass) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.dob = dob;
		this.email = email;
		this.pass = pass;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", dob=" + dob + ", email=" + email + ", pass=" + pass
				+ "]";
	}
	
}
