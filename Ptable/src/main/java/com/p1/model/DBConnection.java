package com.p1.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
 public static Connection getConnection() {
	 Connection con=null;
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
	 }catch(ClassNotFoundException ecobj) {
		 System.out.println("Error in Driver");
		 ecobj.printStackTrace();
	}
	 try {
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","admin123");
	 }catch(SQLException exobj2) {
		 System.out.println("Connection error");
		 exobj2.printStackTrace();}
	 return con;
 }
}
