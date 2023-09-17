package com.pojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
 

}
