package com.p2;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AccountsApp {
	private static SessionFactory factory; 
	public static void main(String[] args) {
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			 			System.out.println(factory);
		}catch (Throwable ex) { 
		   	System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex); 
	   	}
		AccountsDao AD = new AccountsDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER Cid, account type, Balance");
		int cid=sc.nextInt();
		String act=sc.next();
		int bal=sc.nextInt();
		Integer empID1=AD.addAccount(cid, act, bal);
		
		int ch;
		do {
		System.out.println("Enter choice: \n1.Deposit, 2.Withdraw, 3.Know interest, 4.Exit");
		ch=sc.nextInt();
		
		switch(ch) {
		case 1: System.out.println("Enter amount to deposit:");
				int amt=sc.nextInt();
				AD.depositAccounts(empID1, amt);
				
				break;
		case 2: System.out.println("Enter amount to withdraw:");
				int amt1=sc.nextInt();
				AD.withdrawAccounts(empID1, bal);
				break;
		case 3: break;
		
		}
		}while(ch!=4);
	}
		
		
}
