package com.p1;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CustomerApp {
	private static SessionFactory factory; 
	public static void main(String[] args) {
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			 			System.out.println(factory);
		}catch (Throwable ex) { 
		   	System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex); 
	   	}
		CustomerDao CD = new CustomerDao();
		System.out.println("ENTER CUSTOMER id, name, date of borth, email, password:");
		Scanner sc=new Scanner(System.in);
		int cid=sc.nextInt();
		String cname=sc.next();
		String DOB=sc.next();
		String Email=sc.next();
		String Password=sc.next();
		

		/* Add customer records in database */
		Integer custID1 = CD.addcustomer(cid,cname,DOB,Email,Password);
		
		/* List down all the employees */
		CD.listCustomer();
		
		
	}

}
