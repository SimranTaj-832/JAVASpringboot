package com.p1.bank;

public class Accounts {
	private int acnum;
	private int cid;
	private String actyp;
	private String dop;
	private int bal;
	private String sts;
	
	public Accounts() {}

	public Accounts(int acnum, int cid, String actyp, String dop, int bal, String sts) {
		super();
		this.acnum = acnum;
		this.cid = cid;
		this.actyp = actyp;
		this.dop = dop;
		this.bal = bal;
		this.sts = sts;
	}

	public int getAcnum() {
		return acnum;
	}

	public void setAcnum(int acnum) {
		this.acnum = acnum;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getActyp() {
		return actyp;
	}

	public void setActyp(String actyp) {
		this.actyp = actyp;
	}

	public String getDop() {
		return dop;
	}

	public void setDop(String dop) {
		this.dop = dop;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	public String getSts() {
		return sts;
	}

	public void setSts(String sts) {
		this.sts = sts;
	}

	@Override
	public String toString() {
		return "Accounts [acnum=" + acnum + ", cid=" + cid + ", actyp=" + actyp + ", dop=" + dop + ", bal=" + bal
				+ ", sts=" + sts + "]";
	}
	
}
