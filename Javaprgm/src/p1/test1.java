package p1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int a=sc.nextInt();
		System.out.println("Area of Circle: "+(3.14159*a*a));
		System.out.println("Enter height and bredth of triangle");
		int h = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Area of Triangle: "+(h*b/2));
		System.out.println("Enter square sides");
		int l = sc.nextInt();
		System.out.println("Area of Square: "+l*l);
		System.out.println("Enter radius of sphere");
		int r = sc.nextInt();
		System.out.println("Volume of Sphere: "+(4*3.14159*r*r*r)/3);
		System.out.println("Simple interest");
		System.out.println("Enter P, R, T");
		int P = sc.nextInt();
		int R = sc.nextInt();
		int T = sc.nextInt();
		SI(P,R,T);
	}
	public static void SI(int x, int y, int z) {
		int A = x*y*z;
		System.out.print("SI: "+A);
	}

}
