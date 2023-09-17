package com.pkg.w5d3d;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper implements RowMapper<Product>{
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException{
		Product prd=new Product();
		prd.setId(rs.getInt("id"));
		prd.setName(rs.getString("name"));
		prd.setColor(rs.getString("color"));
		prd.setRate(rs.getDouble("rate"));
		return prd;
	}
}
