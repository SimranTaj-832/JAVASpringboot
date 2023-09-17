package Bank;

import java.util.LinkedList;
import java.util.Scanner;

import BankPojo.SavingTran;

public class BankingApp {

	//public static void main(String[] args) {
	public void methodBankAcc(){
		
		LinkedList<SavingTran> sll=new LinkedList<SavingTran>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of Customers: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("\nEnter Details of Customer: "+(i+1) +"\nAccount Number, Customer Name, Balance: ");
			int a=sc.nextInt();
			String cn=sc.next();
			double b=sc.nextDouble();
			
			sll.add(new SavingTran(a,cn,b));
			System.out.println("Interiest= "+sll.get(i).calInterest());

			int ch;
			do {
			System.out.println("Enter choice: \n1.Deposit, 2.Withdraw, 3.Know interest, 4.Exit");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1: System.out.println("Enter amount to deposit:");
					int amt=sc.nextInt();
					//method access using LL object 
					sll.get(i).deposit(amt);
					
					break;
			case 2: System.out.println("Enter amount to withdraw:");
					int amt1=sc.nextInt();
					sll.get(i).withdraw(amt1);
					break;
			case 3: 
					System.out.println("Total interest for one year ");
			 		System.out.println(sll.get(i).calInterest());
			 		break;
			case 4: break;
			
			}
			}while(ch!=4);
		}
		System.out.println("Custemer details:");
		for(SavingTran t:sll) {
			System.out.println(t);
		}
		
		
	}

}
