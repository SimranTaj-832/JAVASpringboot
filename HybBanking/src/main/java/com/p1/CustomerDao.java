package com.p1;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class CustomerDao {
	private static SessionFactory factory; 

	public Integer addcustomer(int cid,String name,String dob, String email,String password){
	      Session session = factory.openSession();
	      System.out.println(session);
	      Transaction tx = null;
	      Integer customerID = null;
	      try{
	         tx = session.beginTransaction();
	         Customer c = new Customer();
	         c.setCid(cid);
	         c.setCname(name);
	         c.setDOB(dob);
	         c.setEmail(email);
	         c.setPassword(password);
	         customerID = (Integer) session.save(c);
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace();
	      }finally {
	         session.close();
	      }
	      return customerID;
	   }
	
	public void listCustomer( ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List customers = session.createQuery("FROM customer").list();
	            System.out.print("CId \t Name\t DateOfBir\t Email ");
	         for (Iterator iterator = customers.iterator(); iterator.hasNext();){
	            Customer cs = (Customer) iterator.next();
	            System.out.print(cs.getCid()+"\t"+cs.getCname()+"\t"+cs.getDOB()+"\t"+cs.getEmail());
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
