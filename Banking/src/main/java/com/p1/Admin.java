package com.p1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.p1.DBConnection;

public class Admin {
 private int id;
 private String pd;
 public static boolean flag=false;

 
 public Admin() {}
 public Admin(int id, String pd) {
	 setId(id);
	 setPd(pd);
 }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPd() {
	return pd;
}
public void setPd(String pd) {
	this.pd = pd;
}
 
public static void Admn(int id, String pd) {
	try {
		Connection con=DBConnection.getConnection();
		PreparedStatement st1=con.prepareStatement("SELECT ID,Pswrd from Admin where ID=? and Pswrd=?");
		st1.setInt(1, id);
		st1.setString(2, pd);
		ResultSet rs=st1.executeQuery();
		
		if(rs.next()) {
			if(rs.getInt("ID")== id) {
					if(rs.getString("Pswrd").equals(pd)) {
						flag=true;
						System.out.print("Welcome Admin:");
					}
				}
			}con.close();
	}catch(SQLException ob2) {flag=false;}
}

}
