package com.p1.bank;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class AcCtgRowMapper implements RowMapper<AcCtg>{
	public AcCtg mapRow(ResultSet rs, int rowNum) throws SQLException{
		AcCtg ac=new AcCtg();
		ac.setType(rs.getString("type"));
		ac.setName(rs.getString("name"));
		return ac;
	}
}
