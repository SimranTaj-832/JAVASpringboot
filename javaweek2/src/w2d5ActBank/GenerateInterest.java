package w2d5ActBank;

import java.util.Scanner;

public class GenerateInterest {

	public static void main(String[] args) {
		FactoryPattern factptrn = new FactoryPattern ();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter type of Account to know interest:");
		String accType=sc.next();
		System.out.println("Enter balance and time(in years)");
		int b=sc.nextInt();
		int t=sc.nextInt();
		
		InterestCal fobj=factptrn.getInterestCal(accType);
		//(int x)->System.out.println(x*t)
		System.out.println("Interest amount for "+accType+" of "+b+"rs for "+t+"yrs is:");
		fobj.getRate();
		System.out.println(fobj.calInterest(b*t));
		sc.close();
		
	}

}
