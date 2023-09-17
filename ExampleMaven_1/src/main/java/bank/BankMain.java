package bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		MethsOP obj=new MethsOP();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter choice\n 1.Open account\n 2.Deposit\n 3.Withdraw\n 4.Exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:obj.OpenAcc();
			break;
			case 2:System.out.println("Enter account number!!");
			    int a=sc.nextInt();
				obj.Deposit(a);
			break;
			case 3: System.out.println("Enter account number:");
					int ac=sc.nextInt();
					obj.Withdraw(ac);
					break;
			case 4:System.out.println("Terminated!!");
			System.exit(0);
			break;
			
		
	
	}}
	}
}
