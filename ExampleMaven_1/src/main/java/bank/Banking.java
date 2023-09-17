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

public class Banking {
	void disptrn(){
		System.out.println("Transaction details!");
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
			System.out.println("Transaction num"+"\t"+"AccountNum"+"\t"+"Date of transaction"+"\t"+"Amount");
			System.out.println("===========================================================================");
			rs=st.executeQuery("SELECT * FROM banking");
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
	
	void insrtrn(int acnum, int amt) {
		int x=(int)(Math.random()*10000);
		LocalDate date=java.time.LocalDate.now();
		String s2=date.toString();
		Connection conn=null;
		//Connection conn1=null;
		
		try {
			String myUrl="jdbc:mysql://localhost:3306/bankdata";
			conn=DriverManager.getConnection(myUrl,"root","admin123");
		}
		catch (SQLException ob1) {
			System.out.println("cannot establish connection"+ob1);
		}
		
		String ins="INSERT INTO  banking VALUES(?,?,?,?)";
		try{
			PreparedStatement preparedStmt = conn.prepareStatement(ins);
			preparedStmt.setInt(1,x);
			preparedStmt.setInt(2,acnum);
			preparedStmt.setString(3, s2);
			preparedStmt.setInt(4,amt);
			preparedStmt.execute();
			conn.close();
		}catch(SQLException ob3) {
			System.err.println("Got an exception!");
			System.err.println(ob3.getMessage());;
		}
		System.out.println("Transaction Scccesfully !!!");
		ResultSet rs=null;
		String ins1="SELECT * FROM banking WHERE trn_num=?";
		try{
			PreparedStatement preparedStmt = conn.prepareStatement(ins1);
			preparedStmt.setInt(1,x);
			rs=preparedStmt.executeQuery();
			System.out.println("Transaction Details:\nTransactionNum\tAccountNum\tDate\tAmount");
			while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getInt(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getInt(4));

			}
			conn.close();
		}catch(SQLException ob4) {
			
		}
	}

}
