package com.pojo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Banking {
	private int trno;
	private int acnum;
	private String date;
	private int amt;
	private String prcs;
	public Banking() {}
	public Banking(int trno,int acnum, String date, int amt, String prcs ) {
		setTrno(trno);
		setAcnum(acnum);
		setDate(date);
		setAmt(amt);
		setPrcs(prcs);
	}
	public int getTrno() {
		return trno;
	}
	public void setTrno(int trno) {
		this.trno = trno;
	}
	public int getAcnum() {
		return acnum;
	}
	public void setAcnum(int acnum) {
		this.acnum = acnum;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public String getPrcs() {
		return prcs;
	}
	public void setPrcs(String prcs) {
		this.prcs = prcs;
	}
	
	
	@Override
	public String toString() {
		return "Banking [trno=" + trno + ", acnum=" + acnum + ", date=" + date + ", amt=" + amt + ", prcs=" + prcs
				+ "]";
	}
}
