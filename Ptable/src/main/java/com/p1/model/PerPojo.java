package com.p1.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class PerPojo {
	int pid;
	String pname;
	Connection connection=null;

	public PerPojo(){}
	public PerPojo(int pid, String pname) {
		setPid(pid);
		setPname(pname);
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch (Exception e) {
			e.printStackTrace();
			}

			try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "admin123");
			}
			catch (SQLException e) {
			e.printStackTrace();
			}

			String insString="insert into Person values(?,?)";
			try {
			PreparedStatement ps=connection.prepareStatement(insString);
			ps.setInt(1, pid);
			ps.setString(2, pname);
			ps.execute();
			System.out.print("data added successfully");
			connection.close();
			}
			catch (Exception e) {
			e.printStackTrace();
			}*/
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public void addPer() {
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement st1=con.prepareStatement("INSERT INTO Person VALUES(?,?)");
			st1.setInt(1,pid);
			st1.setString(2,pname);
			st1.execute();
			con.close();
		}catch(SQLException ob) {System.out.println("Exception Occured");}
	}
	public static ArrayList<PerPojo> getData(){
		String ins="Select * from Person";
		ArrayList<PerPojo> ls=new ArrayList<PerPojo>();
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement st=con.prepareStatement(ins);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				ls.add(new PerPojo(rs.getInt(1),rs.getString(2)));}
		}catch (SQLException ob) {System.out.println("Exception Occured");}
		catch (Exception e) {e.printStackTrace();}
		System.out.println(ls);
		return ls;
	}
	@Override
	public String toString() {
		return "PerPojo [Pid=" + pid + ", Pname=" + pname + "]";
	}
	
}
