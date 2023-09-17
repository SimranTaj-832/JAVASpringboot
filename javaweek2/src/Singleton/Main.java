package Singleton;

public class Main {

	public static void main(String[] args) {
		Singletonex1 x= Singletonex1.getInstance();
		
		Singletonex1 y= Singletonex1.getInstance();

		Singletonex1 z= Singletonex1.getInstance();
		x.s=(x.s).toUpperCase();
		
		System.out.println("String from x is "+x.s);
		System.out.println("String from y is "+y.s);
		System.out.println("String from z is "+z.s);

		z.s=(z.s).toLowerCase();

		System.out.println("\nString from x is "+x.s);
		System.out.println("String from y is "+y.s);
		System.out.println("String from z is "+z.s);

		
	}

}
