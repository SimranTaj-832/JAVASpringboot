package com.p3;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.p2.Accounts;


public class BankingDao {
	private static SessionFactory factory; 
	public Integer addTrans(int acno, int amt){
	      Session session = factory.openSession();
	      System.out.println(session);
	      Transaction tx = null;
	      Integer bankingID = null;
	      try{
	         tx = session.beginTransaction();
	         Banking b = new Banking();
	         int x=20220000+(int)(Math.random()*10000);
			 LocalDate date=java.time.LocalDate.now();
			 String dop=date.toString();
	         b.setAc_num(acno);
	         b.setTrn_num(x);
	         b.setDateoftrn(dop);
	         b.setAmount(amt);
	         bankingID = (Integer) session.save(b);
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace();
	      }finally {
	         session.close();
	      }
	      return bankingID;
	   }
	
	 public void listTrn( ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List tran = session.createQuery("FROM banking").list();
	            System.out.print("TrnNum \t AccNum\t Date\t Amount\t Process");
	         for (Iterator iterator = tran.iterator(); iterator.hasNext();){
	            Banking bk = (Banking) iterator.next();
	            System.out.print(bk.getTrn_num()+"\t"+bk.getAc_num()+"\t"+bk.getDateoftrn()+"\t"+bk.getAmount()+"\t"+bk.getProcess());
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace();
	      }finally {
	         session.close();
	      }
	   }

}
