package com.p1.bank;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer>{
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException{
		Customer c=new Customer();
		c.setCid(rs.getInt("Cid"));
		c.setCname(rs.getString("Cname"));
		c.setDob(rs.getString("DOB"));
		c.setEmail(rs.getString("Email"));
		c.setPass(rs.getString("Password"));
		return c;
	}
}
