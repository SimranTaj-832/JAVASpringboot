package com.p1.bank;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		BankJdbcTemplate bjt=(BankJdbcTemplate)context.getBean("BankJdtempl");
		Scanner sc=new Scanner(System.in);
		
		
		List<Customer> cob=bjt.getAllCustomers();
		System.out.println("\nAll customer details: ");
		System.out.println("Cid\tName\tDofbirth\tEmail");
		System.out.println("---\t----\t--------\t-----");
		for(Customer c: cob) {
			System.out.println(c.getCid()+"\t"+c.getCname()+"\t"+c.getDob()+"\t"+c.getEmail());
		}
		
		System.out.println("\nEnter Customer id to view accounts :");
		int id=sc.nextInt();
		List<Accounts> aco=bjt.getAccountsById(id);
		System.out.println("\nAll Accounts under customer: "+id);
		System.out.println("AccountNum\tActype \tDofOPening\tBalance \tStatus");
		System.out.println("----------\t------ \t----------\t------- \t------");
		for(Accounts a: aco) {
			System.out.println(a.getAcnum()+"\t"+a.getActyp()+"\t"+a.getDop()+"\t"+a.getBal()+"\t"+a.getSts());
			
		}
		
		int ch;
		do {
		System.out.println("\nEnter choice: \n1.Deposit, 2.Withdraw, 3.Know Transactions, 4.Exit");
		ch=sc.nextInt();

		
		switch(ch) {
		case 1: System.out.println("Enter account number and amount to deposit:");
				int acno=sc.nextInt();
				int amt=sc.nextInt();
				Accounts obj=bjt.depositAccount(acno,amt);
				System.out.println(obj);
				break;
		case 2: System.out.println("Enter account number and amount to withdraw:");
				int acno1=sc.nextInt();
				int amt1=sc.nextInt();
				Accounts obj1=bjt.withdrawAccount(acno1,amt1);
				System.out.println(obj1);
				break;
		case 3: System.out.println("Enter account number to view transactions:");
				int acnum=sc.nextInt();
				List<Banking> bkg=bjt.gettrn(acnum);
				System.out.println("All transactions under"+acnum);
				System.out.println("TransNum \tAccntNum\tDateOfTrn \tAmount\tProcess");
				for(Banking b: bkg) {
					System.out.println(b.getTrno()+"\t"+b.getAcnum()+"\t"+b.getDate()+"\t"+b.getAmt()+"\t"+b.getPrcs());
					
				}
				break;
		case 4: System.exit(0);
			break;
		}
		}while(ch!=4);
		
		((AbstractApplicationContext)context).close();
	}

}
