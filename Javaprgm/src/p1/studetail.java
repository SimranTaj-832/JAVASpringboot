package p1;

import java.util.Scanner;

public class studetail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student Id: ");
		String id= sc.next();
		System.out.println("Enter student name: ");
		String name = sc.next();
		System.out.println("Enter student marks : ");
		int mar[]=new int[3];
		int sum=0;
		for(int i=0;i<3;i++) {
			System.out.println("Marks in subject"+(i+1) +"(out of 100): ");
			mar[i]=sc.nextInt();
			sum+=mar[i];
		}
		float p = sum/3;
		System.out.println("Percentage = "+p +"%");
		if(p>35&p<50)
		System.out.println("Student grade = Pass with 3rd grade");
		else if(p>50&p<65)
			System.out.println("Student grade = Second class");
		else if(p>65&p<75)
		System.out.println("Student grade = Firat class");
		else if(p>75&p<85)
		System.out.println("Student grade = First class with Distinction");
		else if(p>85&p<100)
		System.out.println("Student grade = Distinction");
		else
			System.out.println("Fail");
		
	}

}
