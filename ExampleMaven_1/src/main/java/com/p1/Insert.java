package com.p1;

import java.sql.*;
import java.util.Scanner;

public class Insert {
	public void insertdep() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter department Id , department name and City");
		int x=sc.nextInt();
		String s1=sc.next();
		String s2=sc.next();
		Connection conn=null;
		
		try {
			String myUrl="jdbc:mysql://localhost:3306/emp";
			conn=DriverManager.getConnection(myUrl,"root","admin123");
		}
		catch (SQLException ob1) {
			System.out.println("cannot establish connection"+ob1);
		}
		
		String ins="INSERT INTO dept VALUES(?,?,?)";
		try{
			PreparedStatement preparedStmt = conn.prepareStatement(ins);
			preparedStmt.setInt(1,x);
			preparedStmt.setString(2, s1);
			preparedStmt.setString(3, s2);
			preparedStmt.execute();
			conn.close();
		}catch(SQLException ob3) {
			System.err.println("Got an exception!");
			System.err.println(ob3.getMessage());;
		}
	}

}
