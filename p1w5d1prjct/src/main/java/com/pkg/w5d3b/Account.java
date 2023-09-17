package com.pkg.w5d3b;

public class Account {
	String acc_num;
	String ifsc;
	public Account() {}
	public String getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(String acc_num) {
		this.acc_num = acc_num;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	@Override
	public String toString() {
		return "Account [acc_num=" + acc_num + ", ifsc=" + ifsc + "]";
	}
	
 
}
