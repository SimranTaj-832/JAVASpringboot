package com.pojo;

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
	
	
	@Override
	public String toString() {
		return "Account [Account type=" + type + ", Account name=" + name + "]";
	}
	
}
