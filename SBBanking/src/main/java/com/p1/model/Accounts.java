package com.p1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class Accounts {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Ac_num")
	private int acnum;
	@Column(name="Cid")
	private int cid;
	@Column(name="Acctype")
	private String actp;
	@Column(name="DateOfOpening")
	private String dop;
	@Column(name="Bal")
	private int bal;
	@Column(name="status")
	private String prcs;
	
	public Accounts() {}

	public Accounts(int acnum, int cid, String actp, String dop, int bal, String prcs) {
		super();
		this.acnum = acnum;
		this.cid = cid;
		this.actp = actp;
		this.dop = dop;
		this.bal = bal;
		this.prcs = prcs;
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

	public String getActp() {
		return actp;
	}

	public void setActp(String actp) {
		this.actp = actp;
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

	public String getPrcs() {
		return prcs;
	}

	public void setPrcs(String prcs) {
		this.prcs = prcs;
	}
	   

}
