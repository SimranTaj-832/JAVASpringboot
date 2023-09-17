package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MethsOP {
	Accounts aco=new Accounts();
	AccType ato=new AccType();
	Customer cso=new Customer();
	Banking bko=new Banking();
	Scanner sc=new Scanner(System.in);
	
	public void OpenAcc() {
		System.out.println("New customer?(y/n)");
		char c=sc.next().charAt(0);
		if(c=='n') {
		cso.insrtcust();
		aco.insrtAcc();}
		else {
			aco.insrtAcc();
		}
	}
	
	public void Deposit(int acno) {
		System.out.println("Enter amount to deposit:");
		int amt =sc.nextInt();
		Connection conn1=null;
		try {
			String myUrl="jdbc:mysql://localhost:3306/bankdata";
			conn1=DriverManager.getConnection(myUrl,"root","admin123");
		}
		catch (SQLException ob1) {
			System.out.println("cannot establish connection"+ob1);
		}
		String ins1="UPDATE accounts SET Bal=Bal+? WHERE Ac_num=?";
		try{
			PreparedStatement preparedStmt = conn1.prepareStatement(ins1);
			preparedStmt.setDouble(1,amt);
			preparedStmt.setInt(2, acno);
			preparedStmt.execute();
			conn1.close();
		}catch(SQLException ob4) { }
		bko.insrtrn(acno, amt);
		aco.oneAcc(acno);
	}
	public void Withdraw(int acno) {
		System.out.println("Enter amount to Withdraw:");
		int amt =sc.nextInt();
		Connection conn1=null;
		try {
			String myUrl="jdbc:mysql://localhost:3306/bankdata";
			conn1=DriverManager.getConnection(myUrl,"root","admin123");
		}
		catch (SQLException ob1) {
			System.out.println("cannot establish connection"+ob1);
		}
		String ins1="UPDATE accounts SET Bal=Bal-? WHERE Ac_num=?";
		try{
			PreparedStatement preparedStmt = conn1.prepareStatement(ins1);
			preparedStmt.setDouble(1,amt);
			preparedStmt.setInt(2, acno);
			preparedStmt.execute();
			conn1.close();
		}catch(SQLException ob4) { }
		bko.insrtrn(acno, amt);
		aco.oneAcc(acno);
		
	}
	public void AllCust() {
		cso.dispcust();
	}
	public void Alltrns() {
		
	}

}
