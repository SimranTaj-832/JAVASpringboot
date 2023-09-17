package Bank;

import java.util.Scanner;

public class Bmain {

	public static void main(String[] args) {
		genAcc acc = new genAcc();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter type of Account to create:");
		String accType=sc.next();
		
		BankingApp obj=acc.getInterestCal(accType);
		obj.methodBankAcc();
		System.out.println(accType+" Successfully created :)");
	}

}
