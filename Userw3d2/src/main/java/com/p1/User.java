package com.p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.DriverManager;

public class User {
private String uname;
private String pass;
private String email;
long mnum;
public static boolean flag=false;
public User() {}
public User(String uname, String pass, String email, long mnum) {
	setUname(uname);
	setPass(pass);
	setEmail(email);
	setMnum(mnum);
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMnum() {
	return mnum;
}
public void setMnum(long mnum) {
	this.mnum = mnum;
}

public void register() {
	try {
		Connection con=DBConnection.getConnection();
		PreparedStatement st1=con.prepareStatement("INSERT INTO usrd VALUES(?,?,?,?)");
		st1.setString(1, uname);
		st1.setString(2, pass);
		st1.setString(3, email);
		st1.setLong(4, mnum);
		st1.execute();
		System.out.print("Registered successfully");
		con.close();
	}catch(SQLException ob) {System.out.println("Exception Occured");}
}

public static void login(String uname, String pass) {
	try {
		Connection con=DBConnection.getConnection();
		PreparedStatement st1=con.prepareStatement("SELECT Name,Password from usrd where Name=? and Password=?");
		st1.setString(1, uname);
		st1.setString(2, pass);
		ResultSet rs=st1.executeQuery();
		
		if(rs.next()) {
			if(rs.getString("Name").equals(uname)) {
					if(rs.getString("Password").equals(pass)) {
						flag=true;
						System.out.print("Loggedin successfully");
					}
				}
			}con.close();
	}catch(SQLException ob2) {flag=false;}
		
}
@Override
public String toString() {
	return "User [uname=" + uname + ", pass=" + pass + ", email=" + email + ", mnum=" + mnum + "]";
}

}
