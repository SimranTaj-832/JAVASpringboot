package com.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JavaMysqlPreparedStatementInsertExample {

	public static void main(String[] args) {
	//public void insertdep() {
		int x; 
		String s1,s2;
		x=204;s1="Management";s2="Mumbai";
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter department Id , department name and City");
		int x = 0; 
		String s1 = null,s2 = null;
		sc.nextInt(x);
		sc.next(s1);
		sc.next(s2);*/
		try {
			String myDriver="com.mysql.jdbc.Driver";
			Class.forName(myDriver);
		}catch(ClassNotFoundException obj) {
			System.out.println("cannot load driver"+obj);
		}
		
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
