package com.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample1 {

	//public static void main(String[] args) {
	    void selectdep(){
		System.out.println("Querying a table example!");
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException exob1) {}
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","admin123");
		}catch(SQLException exob2) {}
		try {
			Statement st=con.createStatement();
			ResultSet rs;
			System.out.println("Id"+"\t"+"Name"+"\t"+"Location");
			System.out.println("===============================");
			rs=st.executeQuery("SELECT * FROM dept");
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.println();
			}
		}catch(SQLException s) {
			System.out.println("Table or column or data type"+""+"is not found!");
		}catch(Exception e) {e.printStackTrace();}
		try {
			con.close();
		}catch(Exception e) {}
	}

}
