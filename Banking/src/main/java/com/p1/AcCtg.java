package com.p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcCtg {
	private String type;
	private String name;
	
	public AcCtg(){}
	public AcCtg(String type, String name) {
		setType(type);
		setName(name);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static ArrayList<AcCtg> Allcs(){
		ArrayList<AcCtg> ls=new ArrayList<AcCtg>();
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement st=con.prepareStatement("Select * from account_ctg");
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				ls.add(new AcCtg(rs.getString(1),rs.getString(2)));}
		}catch (SQLException ob) {System.out.println("Exception Occured");}
		catch (Exception e) {e.printStackTrace();}
		System.out.println(ls);
		return ls;
	}
	
	@Override
	public String toString() {
		return "Account [Account type=" + type + ", Account name=" + name + "]";
	}
	
}
