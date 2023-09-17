package com.p3;
import javax.persistence.*;

@Entity
@Table(name="banking")
public class Banking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="trn_num")
	private int trn_num;
	
	@Column(name="Ac_num")
	private int Ac_num;
	
	@Column(name="dateoftrn")
	private String dateoftrn;
	
	@Column(name="amount")
	private int amount;
	
	@Column(name="Process")
	private String Process;
	
	public Banking() {}

	public int getTrn_num() {
		return trn_num;
	}

	public void setTrn_num(int trn_num) {
		this.trn_num = trn_num;
	}

	public int getAc_num() {
		return Ac_num;
	}

	public void setAc_num(int ac_num) {
		Ac_num = ac_num;
	}

	public String getDateoftrn() {
		return dateoftrn;
	}

	public void setDateoftrn(String dateoftrn) {
		this.dateoftrn = dateoftrn;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getProcess() {
		return Process;
	}

	public void setProcess(String process) {
		Process = process;
	}

	@Override
	public String toString() {
		return "Banking [trn_num=" + trn_num + ", Ac_num=" + Ac_num + ", dateoftrn=" + dateoftrn + ", amount=" + amount
				+ ", Process=" + Process + "]";
	}
	
}
