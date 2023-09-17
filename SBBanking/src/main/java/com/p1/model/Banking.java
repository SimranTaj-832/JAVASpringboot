package com.p1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="banking")
public class Banking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="trn_num")
	private int trnum;
	@Column(name="Ac_num")
	private int acnum;
	@Column(name="dateoftrn")
	private String datetrn;
	@Column(name="amount")
	private int amt;
	@Column(name="Process")
	private String prc;
	
	public Banking() {}

	public Banking(int trnum, int acnum, String datetrn, int amt, String prc) {
		super();
		this.trnum = trnum;
		this.acnum = acnum;
		this.datetrn = datetrn;
		this.amt = amt;
		this.prc = prc;
	}

	public int getTrnum() {
		return trnum;
	}

	public void setTrnum(int trnum) {
		this.trnum = trnum;
	}

	public int getAcnum() {
		return acnum;
	}

	public void setAcnum(int acnum) {
		this.acnum = acnum;
	}

	public String getDatetrn() {
		return datetrn;
	}

	public void setDatetrn(String datetrn) {
		this.datetrn = datetrn;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public String getPrc() {
		return prc;
	}

	public void setPrc(String prc) {
		this.prc = prc;
	}
	

}
