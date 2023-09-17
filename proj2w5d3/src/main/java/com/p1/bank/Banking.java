package com.p1.bank;

public class Banking {
	private int trno;
	private int acnum;
	private String date;
	private int amt;
	private String prcs;
	public Banking() {}
	public Banking(int trno, int acnum, String date, int amt, String prcs) {
		super();
		this.trno = trno;
		this.acnum = acnum;
		this.date = date;
		this.amt = amt;
		this.prcs = prcs;
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
