package com.p1;
import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Cid")
	private int Cid;
	
	@Column(name="Cname")
	private String Cname;
	
	@Column(name="DOB")
	private String DOB;

	@Column(name="Email")
	private String Email;

	@Column(name="Password")
	private String Password;
	
	public Customer() {}

	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Customer [Cid=" + Cid + ", Cname=" + Cname + ", DOB=" + DOB + ", Email=" + Email + ", Password="
				+ Password + "]";
	}
	

}
