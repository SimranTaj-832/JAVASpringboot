package p1;

import java.util.Scanner;

public class demoloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=25;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println(" while");
		int i=0;
		while(i<25) {
			if(i%2==0)
				System.out.print(i+", ");
			i++;
		}
		System.out.println("do while");
		int j=0;
		do {
			if(j%2==0)
				System.out.print(j+", ");
			j++;
		}while(j<25);
		System.out.println();
		
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		for(int k=1;k<=10;k++) {
			System.out.println(n+"*"+k +"= "+n*k);	
		}
		
	}

}
