package com.p2;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AccountsDao {
	private static SessionFactory factory; 
	public Integer addAccount(int cid, String actyp, int bal){
	      Session session = factory.openSession();
	      System.out.println(session);
	      Transaction tx = null;
	      Integer accountsID = null;
	      try{
	         tx = session.beginTransaction();
	         Accounts ac = new Accounts();
	         int x=20220000+(int)(Math.random()*10000);
			 LocalDate date=java.time.LocalDate.now();
			 String dop=date.toString();
	         ac.setAc_num(x);
	         ac.setCid(cid);
	         ac.setAcctype(actyp);
	         ac.setDateOfOpening(dop);
	         ac.setBal(bal);
	         ac.setStatus("Active");
	         accountsID = (Integer) session.save(ac);
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace();
	      }finally {
	         session.close();
	      }
	      return accountsID;
	   }
	//read
	 /* Method to  READ all the accountss */
	   public void listAccounts( ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List employees = session.createQuery("FROM Accounts").list();
	            System.out.print("AccNum \t Cid\t AccType\t DateOfOpn\t Balance\t Status");
	         for (Iterator iterator = employees.iterator(); iterator.hasNext();){
	            Accounts a = (Accounts) iterator.next();
	            System.out.print(a.getAc_num()+"\t"+a.getCid()+"\t"+a.getAcctype()+"\t"+a.getDateOfOpening()+"\t"+a.getBal()+"\t"+a.getStatus());
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace();
	      }finally {
	         session.close();
	      }
	   }
	   
	  //update
	   /* Method to deposit balance*/
	   public void depositAccounts(Integer AccountsID, int bal ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         Accounts acts = (Accounts)session.get(Accounts.class, AccountsID);
	         acts.setBal(acts.getBal()+bal);
	         session.update(acts);
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace();
	      }finally {
	         session.close();
	      }
	   }
	   
	   /* Method to deposit balance*/
	   public void withdrawAccounts(Integer AccountsID, int bal ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         Accounts acts = (Accounts)session.get(Accounts.class, AccountsID);
	         acts.setBal(acts.getBal()-bal);
	         session.update(acts);
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace();
	      }finally {
	         session.close();
	      }
	   }
	   
	   /* Method to DELETE an account from the records */
	   public void deleteAccounts(Integer AccountsID){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         Accounts acts = (Accounts)session.get(Accounts.class, AccountsID);
	         session.delete(acts);
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace();
	      }finally {
	         session.close();
	      }
	   }
}
