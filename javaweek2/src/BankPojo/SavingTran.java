package BankPojo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

import BankBankIntr.BankException;
import BankBankIntr.Banking;

public class SavingTran extends Savings implements Banking{
	int tranId;
	LocalDate date;
	double amount;
	double bal;
	public SavingTran(){}
	public SavingTran(int accountnum, String cust_name,double balance){
		super(accountnum,cust_name,balance);
		super.openaccount(accountnum, cust_name,balance);
		
	}
	
	/*SavingTran(int tranId,Date date,double amount){
		this.tranId=tranId;
		this.date=date;
		this.amount=amount;
	}*/
	//deposit method
	//System.out.println(balance);
	Random r=new Random();
	public void deposit(int amount) {

		tranId=r.nextInt(1000);
		date=LocalDate.now();
		balance=balance+amount;
		display();
	}
	//withdraw method with exception handling
	public void withdraw(int withdrawAmt) {
		tranId=r.nextInt(1000);
		date=LocalDate.now();
		try {
			if(withdrawAmt>balance) {
				throw new BankException("Withdraw Amount exceeds current balance \n");
			}
			else 
				balance-=withdrawAmt;
				display();
		}
		catch (BankException ex) {System.out.println(ex.getMessage());}
		
	}
	//Interest calculate method
	public double calInterest() {
		super.toString();
		return (balance*(savingsrate+currentrate+fdrate)/100);	
	}
	//Display method
	public void display() {
		System.out.println("Transaction Id: "+tranId+", Date: "+date+", Balance= "+balance+" ]");

	}
	public double getTranId() {
		return tranId;
	}
	public void setTranId(int tranId) {
		this.tranId = tranId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	

}
