package com.p1;

import java.util.Scanner;

public class deptmain {

	public static void main(String[] args) {
		Sample1 sel=new Sample1();
		Insert insrt=new Insert();
		Scanner sc=new Scanner(System.in);
	
		while(true) {
		System.out.println("Enter choice\n 1.Display demartment data\n 2.Insert values into department\n 3.Exit");
		int ch=sc.nextInt();
		switch(ch) {
		case 1: sel.selectdep();
		break;
		case 2: insrt.insertdep();
		break;
		case 3: System.out.println("Terminated!!");
			System.exit(0);
			break;
		}}

	}

}
