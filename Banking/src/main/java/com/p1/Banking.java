package com.p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Banking {
	private int trno;
	private int acnum;
	private String date;
	private int amt;
	private String prcs;
	public Banking() {}
	public Banking(int trno,int acnum, String date, int amt, String prcs ) {
		setTrno(trno);
		setAcnum(acnum);
		setDate(date);
		setAmt(amt);
		setPrcs(prcs);
	}
	public int getTrno() {
		return trno;
	}
	public void setTrno(int trno) {
		this.trno = trno;
	}
	public int getAcnum() {
		return acnum;
	}
	public void setAcnum(int acnum) {
		this.acnum = acnum;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public String getPrcs() {
		return prcs;
	}
	public void setPrcs(String prcs) {
		this.prcs = prcs;
	}
	
	public void Insrtrn(int acno, int amt,String prc) {
		try {
			int x=2022+acno+(int)(Math.random()*10000);
			LocalDate date=java.time.LocalDate.now();
			String dt=date.toString();
			Connection con=DBConnection.getConnection();
			PreparedStatement st1=con.prepareStatement("INSERT INTO banking VALUES(?,?,?,?,?)");
			st1.setInt(1, x);
			st1.setInt(2, acno);
			st1.setString(3, dt);
			st1.setInt(4, amt);
			st1.setString(5, prc);
			st1.execute();
			System.out.print("Transaction successfull!!");
			con.close();
		}catch(SQLException ob) {System.out.println("Exception Occured");}
	}
	
	public static ArrayList<Banking> getData(int acno){
		ArrayList<Banking> ls=new ArrayList<Banking>();
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement st=con.prepareStatement("Select * from banking where Ac_num=?");
			st.setInt(1, acno);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				ls.add(new Banking(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5)));}
		}catch (SQLException ob) {System.out.println("Exception Occured");}
		catch (Exception e) {e.printStackTrace();}
		System.out.println(ls);
		return ls;
	}
	
	public void Deposit(int acno, int amt) {
		String ins1="UPDATE accounts SET Bal=Bal+? WHERE Ac_num=?";
		String prc="Deposit";
		try{
			Connection con=DBConnection.getConnection();

			PreparedStatement preparedStmt = con.prepareStatement(ins1);
			preparedStmt.setDouble(1,amt);
			preparedStmt.setInt(2, acno);
			preparedStmt.execute();
		}catch(SQLException ob4) {System.out.println("Exception occored in deposit"); }
		Insrtrn(acno, amt,prc);
	}
	
	public void Withdraw(int acno, int amt) {
		String ins1="UPDATE accounts SET Bal=Bal-? WHERE Ac_num=?";
		String prc="Withdraw";
		try{
			Connection con=DBConnection.getConnection();

			PreparedStatement preparedStmt = con.prepareStatement(ins1);
			preparedStmt.setDouble(1,amt);
			preparedStmt.setInt(2, acno);
			preparedStmt.execute();
		}catch(SQLException ob4) { System.out.println("Exception occored in withdraw");}
		Insrtrn(acno, amt,prc);
	}
	
	public static ArrayList<Banking> Alltrn(){
		ArrayList<Banking> ls=new ArrayList<Banking>();
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement st=con.prepareStatement("Select * from banking");
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				ls.add(new Banking(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5)));}
		}catch (SQLException ob) {System.out.println("Exception Occured");}
		catch (Exception e) {e.printStackTrace();}
		System.out.println(ls);
		return ls;
	}
	
	@Override
	public String toString() {
		return "Banking [trno=" + trno + ", acnum=" + acnum + ", date=" + date + ", amt=" + amt + ", prcs=" + prcs
				+ "]";
	}
}
