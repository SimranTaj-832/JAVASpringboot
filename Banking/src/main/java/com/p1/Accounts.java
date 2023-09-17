package com.p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Accounts {
	private int acnum;
	private int cid;
	private String actyp;
	private String dop;
	private int bal;
	private String sts;
	
	public Accounts() {}
	public Accounts(int acnum, int cid, String actyp, String dop, int bal, String sts) {
		setAcnum(acnum);
		setCid(cid);
		setActyp(actyp);
		setDop(dop);
		setBal(bal);
		setSts(sts);
	}

	public int getAcnum() {
		return acnum;
	}

	public void setAcnum(int acnum) {
		this.acnum = acnum;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getActyp() {
		return actyp;
	}

	public void setActyp(String actyp) {
		this.actyp = actyp;
	}

	public String getDop() {
		return dop;
	}

	public void setDop(String dop) {
		this.dop = dop;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	public String getSts() {
		return sts;
	}

	public void setSts(String sts) {
		this.sts = sts;
	}
	
	public static ArrayList<Accounts> getData(int cid){
		ArrayList<Accounts> ls=new ArrayList<Accounts>();
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement st=con.prepareStatement("Select * from Accounts where cid=?");
			st.setInt(1, cid);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				ls.add(new Accounts(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6)));}
		}catch (SQLException ob) {System.out.println("Exception Occured");}
		catch (Exception e) {e.printStackTrace();}
		System.out.println(ls);
		return ls;
	}
	
	public void CreateAc(int cid,String actyp, int bal) {
		try {
			int x=20220000+(int)(Math.random()*10000);
			LocalDate date=java.time.LocalDate.now();
			String dop=date.toString();
			Connection con=DBConnection.getConnection();
			PreparedStatement st1=con.prepareStatement("INSERT INTO accounts VALUES(?,?,?,?,?,?)");
			st1.setInt(1, x);
			st1.setInt(2, cid);
			st1.setString(3, actyp);
			st1.setString(4, dop);
			st1.setInt(5, bal);
			st1.setString(6, "Active");
			st1.execute();
			System.out.print("Account created successfully");
			con.close();
		}catch(SQLException ob) {System.out.println("Exception Occured");}
	}

	public static ArrayList<Accounts> Allac(){
		ArrayList<Accounts> ls=new ArrayList<Accounts>();
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement st=con.prepareStatement("Select * from Accounts");
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				ls.add(new Accounts(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6)));}
		}catch (SQLException ob) {System.out.println("Exception Occured");}
		catch (Exception e) {e.printStackTrace();}
		System.out.println(ls);
		return ls;
	}
	
	@Override
	public String toString() {
		return "Accounts [acnum=" + acnum + ", cid=" + cid + ", actype=" + actyp + ", dop=" + dop + ", bal=" + bal
				+ ", status=" + sts + "]";
	}
	
}
