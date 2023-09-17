package com.p1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Cid")
	private int cid;
	@Column(name="Cname")
	private String cname;
	@Column(name="DOB")
	private String dob;
	@Column(name="Email")
	private String email;
	@Column(name="Password")
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
	

}
