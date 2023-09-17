package com.p1.bank;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class AccountsRowMapper implements RowMapper<Accounts> {
	public Accounts mapRow(ResultSet rs, int rowNum) throws SQLException{
		Accounts ac=new Accounts();
		ac.setAcnum(rs.getInt("Ac_num"));
		ac.setCid(rs.getInt("Cid"));
		ac.setActyp(rs.getString("Acctype"));
		ac.setDop(rs.getString("DateOfOpening"));
		ac.setBal(rs.getInt("Bal"));
		ac.setSts(rs.getString("status"));
		return ac;
	}

}
