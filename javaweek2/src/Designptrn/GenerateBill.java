package Designptrn;

import java.util.*;

public class GenerateBill {

	public static void main(String[] args) {
		GetPlanFactory planFactory = new GetPlanFactory();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name of plan for billing:");
		String planName=sc.next();
		System.out.println("Enter number of units");
		int units=sc.nextInt();
		Plan p=planFactory.getPlan(planName);
		System.out.println("Bill amount for "+planName+" of "+units+"units is:");
		p.getRate();
		p.calculatrBill(units);
		sc.close();
	}

}
