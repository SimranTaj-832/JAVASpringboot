package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Accounts {
	void dispAcc(){
		System.out.println("Account details!");
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
			System.out.println("AccountNum"+"\t"+"CustomerId"+"\t"+"Account type"+"\t"+"Date of Opening"+"\t"+"Balance"+"\t"+"Status");
			System.out.println("======================================================================================================");
			rs=st.executeQuery("SELECT * FROM accounts");
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.print(rs.getString(6)+"\t");

				System.out.println();
			}
		}catch(SQLException s) {
			System.out.println("Table or column or data type"+""+"is not found!");
		}catch(Exception e) {e.printStackTrace();}
		try {
			con.close();
		}catch(Exception e) {}
	}
	
	void insrtAcc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id , Account type(Savings/Salary), Balance and status");
		int x=2022+(int)(Math.random()*10000);
		int x1=sc.nextInt();
		String s1=sc.next();
		LocalDate date=java.time.LocalDate.now();
		String s2=date.toString();
		int x2=sc.nextInt();
		String s3=sc.next();
		Connection conn=null;
		
		try {
			String myUrl="jdbc:mysql://localhost:3306/bankdata";
			conn=DriverManager.getConnection(myUrl,"root","admin123");
		}
		catch (SQLException ob1) {
			System.out.println("cannot establish connection"+ob1);
		}
		
		String ins="INSERT INTO  accounts VALUES(?,?,?,?,?,?)";
		try{
			PreparedStatement preparedStmt = conn.prepareStatement(ins);
			preparedStmt.setInt(1,x);
			preparedStmt.setInt(2,x1);
			preparedStmt.setString(3, s1);
			preparedStmt.setString(4, s2);
			preparedStmt.setInt(5,x2);
			preparedStmt.setString(6, s3);
			preparedStmt.execute();
			conn.close();
		}catch(SQLException ob3) {
			System.err.println("Got an exception!");
			System.err.println(ob3.getMessage());;
		}
		System.out.println("Account Scccesfully created!!!");
		oneAcc(x);
		
	}
	public void oneAcc(int a) {

		Connection conn1=null;
		ResultSet rs=null;
		try {
			String myUrl="jdbc:mysql://localhost:3306/bankdata";
			conn1=DriverManager.getConnection(myUrl,"root","admin123");
		}
		catch (SQLException ob1) {
			System.out.println("cannot establish connection"+ob1);
		}
		String ins1="SELECT * FROM accounts WHERE Ac_num=?";
		try{
			PreparedStatement preparedStmt = conn1.prepareStatement(ins1);
			preparedStmt.setInt(1,a);
			rs=preparedStmt.executeQuery();
			System.out.println("Account Details:\nAccountNum\tCustomerId\tAccountType\tDateOfOpening\tBalance\tStatus");
			while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getInt(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getString(4)+"\t");
			System.out.print(rs.getInt(5)+"\t");
			System.out.println(rs.getString(6));

			}
			conn1.close();
		}catch(SQLException ob4) {
			
		}
	}

}
