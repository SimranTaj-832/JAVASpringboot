package com.p1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.pojo.Accounts;
import com.pojo.Banking;
import com.pojo.Customer;

public class BankDao {
JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template=template;
	}
	
	public int tran(Banking b,int acnum,String prc) {
		int x=2022+acnum+(int)(Math.random()*10000);
		LocalDate date=java.time.LocalDate.now();
		String dt=date.toString();
		String sql="insert into banking values("+x+","+acnum+",'"+dt+"',"+b.getAmt()+","+prc+")";
		return ((JdbcOperations) template).update(sql);
		}
	
//	public int deposit(Accounts a,Banking b) {
	public int deposit(Banking B, int acnum) {
		String sql="update accounts set Bal=Bal+"+B.getAmt()+"where Ac_num="+acnum;
		tran(B,acnum,"Deposit");
		return ((JdbcOperations) template).update(sql);
	}
	public int withdraw(Banking b,int acnum) {
		String sql="update accounts set Bal=Bal-"+b.getAmt()+"where Ac_num="+acnum;
		tran(b,acnum,"Withdraw");
		return ((JdbcOperations) template).update(sql);
	}
	
	public int newAcc(Accounts a,int cid) {
		int x=20220000+(int)(Math.random()*10000);
		LocalDate date=java.time.LocalDate.now();
		String dop=date.toString();
		String s="Active";
		String sql="insert into accounts values("+x+","+cid+",'"+a.getActyp()+"'"+",'"+dop+"',"+a.getBal()+",'"+s+"'"+")";
		return ((JdbcOperations) template).update(sql);
		}
	
	public List<Accounts>getAccounts(int acnum){
		return ((JdbcOperations) template).query("select* from accounts where Ac_num="+acnum+"",new RowMapper<Accounts>() {
			public Accounts mapRow(ResultSet rs,int row)throws SQLException{
				Accounts a=new Accounts();
				a.setAcnum(rs.getInt(1));
				a.setCid(rs.getInt(2));
				a.setActyp(rs.getString(3));
				a.setDop(rs.getString(4));
				a.setBal(rs.getInt(5));
				a.setSts(rs.getString(6));
				return a;
			}
		});
	}
	public int delete(int acnum) {
		String sql="delete from accounts where Ac_num="+acnum+"";
		return ((JdbcOperations) template).update(sql);
	}
	
	public List<Banking> getTrns(int acnum) {
		return ((JdbcOperations) template).query("select *from banking where Ac_num="+acnum+"",new RowMapper<Banking>() {
		public Banking mapRow(ResultSet rs,int row)throws SQLException{
			Banking ba=new Banking();
			ba.setTrno(rs.getInt(1));
			ba.setAcnum(rs.getInt(2));
			ba.setDate(rs.getString(3));
			ba.setAmt(rs.getInt(4));
			ba.setPrcs(rs.getString(5));
			return ba;
		}
	});
	}
	public int reg(Customer c) {
		String sql="insert into customer values("+c.getCid()+","+"'"+c.getCname()+"'"+",'"+c.getDob()+"','"+c.getEmail()+"','"+c.getPass()+"')";
		return ((JdbcOperations) template).update(sql);
		}
	public Customer login(int cid) {
		String sql="select pass from customer where Cid=?";
		return ((JdbcOperations) template).queryForObject(sql,new Object[] {cid}, new BeanPropertyRowMapper<Customer>(Customer.class));
	}
}
