package com.p3;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class BankingApp {
	private static SessionFactory factory; 
	public static void main(String[] args) {
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			 			System.out.println(factory);
		}catch (Throwable ex) { 
		   	System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex); 
	   	}
		BankingDao AD = new BankingDao();
		Scanner sc=new Scanner(System.in);
	}
}
