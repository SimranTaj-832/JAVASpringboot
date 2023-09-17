package com.p1.bank;

import java.time.LocalDate;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;


public class BankJdbcTemplate {
	private JdbcTemplate jt;
	private DataSource dsr;
	
	public void setDsr(DataSource dataSource) {
		this.dsr=dataSource;
		this.jt=new JdbcTemplate(dsr);
	}
	public List<Customer>getAllCustomers(){
		String sql="select * from customer";
		List<Customer> cstmr=jt.query(sql, new CustomerRowMapper());
		return cstmr;
	}
	public void insertCustomers(int cid, String cname, String email, String pass) {
		LocalDate date=java.time.LocalDate.now();
		String dob=date.toString();
		String sql="insert into customer values(?,?,?,?,?)";
		jt.update(sql,new Object[]{cid,cname,dob,email,pass});
	}
	public void customer(int id) {
		String sql="delete from customer where Cid=?";
		jt.update(sql,new Object[] {id});
	}

	
	
	//accounts, deposit and withdraw
	public void insertAccounts(int cid, String actyp, int bal) {
		int acnum= 20220000+(int)(Math.random()*10000);
		LocalDate date=java.time.LocalDate.now();
		String dop=date.toString();
		String sts="Active";
		String sql="insert into accounts values(?,?,?,?,?,?)";
		jt.update(sql,new Object[]{acnum,cid,actyp,dop,bal,sts});
	}
	public List<Accounts> getAccountsById(int id) {
		String sql="select* from accounts where Cid=?";
		List<Accounts> ac=jt.query(sql, new AccountsRowMapper(),new Object[]{id});
		return ac;
	}
	public Accounts getAccounts(int acnum) {
		String sql="select* from accounts where Ac_num=?";
		Accounts ac=jt.queryForObject(sql, new AccountsRowMapper(),new Object[]{acnum});
		return ac;
	}
	public Accounts depositAccount(int acnum,int amt) {
		String sql="UPDATE accounts SET Bal=Bal+? WHERE Ac_num=?";
		jt.update(sql,new Object[]{amt,acnum});
		Accounts dep= getAccounts(acnum);
		insertBanking(acnum,amt,"deposit");
		return dep;
	}
	
	
	public Accounts withdrawAccount(int acnum,int amt) {
		Accounts dep=new Accounts();
		Accounts a1= getAccounts(acnum);
		
		try {
			if(amt>a1.getBal()) {
				throw new BankException("Withdraw Amount exceeds current balance \n");
			}
			else {
		
		String sql="UPDATE accounts SET Bal=Bal-? WHERE Ac_num=?";
		jt.update(sql,new Object[]{amt,acnum});
		dep= getAccounts(acnum);
		insertBanking(acnum,amt,"withdraw");
		return dep;
		}
			}
		catch (BankException ex) {
			System.out.println(ex.getMessage()); 
			return dep;}
	}
	
	//banking
	public void insertBanking( int acnum , int amt, String prcs) {
		int trno=2022+acnum+(int)(Math.random()*10000);
		LocalDate date=java.time.LocalDate.now();
		String dob=date.toString();
		String sql="insert into banking values(?,?,?,?,?)";
		jt.update(sql,new Object[]{trno,acnum,dob,amt,prcs});
	}
	public List<Banking> gettrn(int acnum) {
		String sql="select* from banking where Ac_num=?";
		List<Banking> bkg=jt.query(sql, new BankRowMapper(),new Object[]{acnum});
		return bkg;
	}
	
	
	
		
}
