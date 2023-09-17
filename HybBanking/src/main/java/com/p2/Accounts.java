package com.p2;
import javax.persistence.*;

@Entity
@Table(name="accounts")
public class Accounts {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Ac_num")
	private int Ac_num;
	
	@Column(name="Cid")
	private int Cid;
	
	@Column(name="Acctype")
	private String Acctype;
	
	@Column(name="DateOfOpening")
	private String DateOfOpening;
	
	@Column(name="Bal")
	private int Bal;
	
	@Column(name="status")
	private String status;
	
	public Accounts() {}

	public int getAc_num() {
		return Ac_num;
	}

	public void setAc_num(int ac_num) {
		Ac_num = ac_num;
	}

	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	public String getAcctype() {
		return Acctype;
	}

	public void setAcctype(String acctype) {
		Acctype = acctype;
	}

	public String getDateOfOpening() {
		return DateOfOpening;
	}

	public void setDateOfOpening(String dateOfOpening) {
		DateOfOpening = dateOfOpening;
	}

	public int getBal() {
		return Bal;
	}

	public void setBal(int bal) {
		Bal = bal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Accounts [Ac_num=" + Ac_num + ", Cid=" + Cid + ", Acctype=" + Acctype + ", DateOfOpening="
				+ DateOfOpening + ", Bal=" + Bal + ", status=" + status + "]";
	}
	
	
	
}
