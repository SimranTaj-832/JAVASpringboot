package com.p1.bank;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class BankRowMapper implements RowMapper<Banking> {
	public Banking mapRow(ResultSet rs, int rowNum) throws SQLException{
		Banking bg=new Banking();
		bg.setTrno(rs.getInt("trn_num"));
		bg.setAcnum(rs.getInt("Ac_num"));
		bg.setDate(rs.getString("dateoftrn"));
		bg.setAmt(rs.getInt("amount"));
		bg.setPrcs(rs.getString("process"));
		return bg;
	}

}
