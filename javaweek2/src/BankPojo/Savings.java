package BankPojo;

public class Savings {
	int accountnum;
	String cust_name;
	double balance;
	public Savings(){}
	public Savings(int accountnum, String cust_name,double balance){
		this.accountnum=accountnum;
		this.cust_name=cust_name;
		this.balance=balance;
	}
	//open account method
	public void openaccount(int accountnum, String cust_name,double balance) {
		this.accountnum=accountnum;
		this.cust_name=cust_name;
		this.balance=balance;
		System.out.println("Account Successfully created");
		System.out.println(toString());
	}
	public int getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account Details [Accountnum=" + accountnum + ", cust_name=" + cust_name +"  Balance="+balance+" ]";
	}
	

}
