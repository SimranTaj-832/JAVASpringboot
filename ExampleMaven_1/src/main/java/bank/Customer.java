package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Customer {
	void dispcust(){
		System.out.println("Customer details!");
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException exob1) {}
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdata","root","admin123");
		}catch(SQLException exob2) {}
		try {
			Statement st=con.createStatement();
			ResultSet rs;
			System.out.println("Id"+"\t"+"Name"+"\t"+"Date of birth"+"\t"+"Email");
			System.out.println("================================================");
			rs=st.executeQuery("SELECT * FROM customer");
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.println();
			}
		}catch(SQLException s) {
			System.out.println("Table or column or data type"+""+"is not found!");
		}catch(Exception e) {e.printStackTrace();}
		try {
			con.close();
		}catch(Exception e) {}
	}
	
	void insrtcust() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer Id , Name, Date of birth(yyyy-mm-dd) and email");
		int x=sc.nextInt();
		String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();
		Connection conn=null;
		
		try {
			String myUrl="jdbc:mysql://localhost:3306/bankdata";
			conn=DriverManager.getConnection(myUrl,"root","admin123");
		}
		catch (SQLException ob1) {
			System.out.println("cannot establish connection"+ob1);
		}
		
		String ins="INSERT INTO customer VALUES(?,?,?,?)";
		try{
			PreparedStatement preparedStmt = conn.prepareStatement(ins);
			preparedStmt.setInt(1,x);
			preparedStmt.setString(2, s1);
			preparedStmt.setString(3, s2);
			preparedStmt.setString(4, s3);
			preparedStmt.execute();
			conn.close();
		}catch(SQLException ob3) {
			System.err.println("Got an exception!");
			System.err.println(ob3.getMessage());;
		}
	}


}
