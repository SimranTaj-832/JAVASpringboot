package com.p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Customer {
	private int cid;
	private String cname;	
	private String dob;
	private String email;
	private String pass;
	public static boolean flag=false;

	public Customer() {}
	public Customer(int cid, String cname, String dob, String email, String pass) {
		setCid(cid);
		setCname(cname);
		setDob(dob);
		setEmail(email);
		setPass(pass);
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
	
	public void register() {
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement st1=con.prepareStatement("INSERT INTO customer VALUES(?,?,?,?,?)");
			st1.setInt(1, cid);
			st1.setString(2, cname);
			st1.setString(3, dob);
			st1.setString(4, email);
			st1.setString(5, pass);
			st1.execute();
			System.out.print("Registered successfully");
			con.close();
		}catch(SQLException ob) {System.out.println("Exception Occured");}
	}
	
	public static void loginch(int cid, String pass) {
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement st1=con.prepareStatement("SELECT Cid,Password from customer where Cid=? and Password=?");
			st1.setInt(1, cid);
			st1.setString(2, pass);
			ResultSet rs=st1.executeQuery();
			
			if(rs.next()) {
				if(rs.getInt("Cid")== cid) {
						if(rs.getString("Password").equals(pass)) {
							flag=true;
							System.out.print("Loggedin successfully");
						}
					}
				}con.close();
		}catch(SQLException ob2) {flag=false;}
			
	}
	
	public static ArrayList<Customer> Allcs(){
		ArrayList<Customer> ls=new ArrayList<Customer>();
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement st=con.prepareStatement("Select * from customer");
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				ls.add(new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));}
		}catch (SQLException ob) {System.out.println("Exception Occured");}
		catch (Exception e) {e.printStackTrace();}
		System.out.println(ls);
		return ls;
	}
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", dob=" + dob + ", email=" + email + ", pass=" + pass
				+ "]";
	}
	
}
