package p1;

import java.util.Scanner;

public class switchdemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter colour code(VIBGYOR):");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
		case 'V': System.out.println("Colour is Voilet");
		break;
		case 'I': System.out.println("Colour is Indigo");
		break;
		case 'B': System.out.println("Colour is Blue");
		break;
		case 'G': System.out.println("Colour is Green");
		break;
		case 'Y': System.out.println("Colour is Yellow");
		break;
		case 'O': System.out.println("Colour is Orange");
		break;
		case 'R': System.out.println("Colour is Red");
		break;
		}
		
		/*String str = "Voilet";
		switch(str)
		{
		case 'Voilet': System.out.println("Colour is Voilet");
		break;
		case 'Indigo': System.out.println("Colour is Indigo");
		break;
		case 'Blue': System.out.println("Colour is Blue");
		break;
		}*/

	}

}
