package mord;

public class A1 {
	double d1;
	A1(){}
	public void display()
	{
		d1=27.45;
		System.out.println(d1);
	}
}
	
	class A2 extends A1{
		char y;
		A2(){}
		public void printA2() {
			System.out.println("Inside A2");
		}
		public void display() {
			y='p';
			System.out.println(y);
		}
	}
	
	class A3 extends A2{
		int z;
		A3(){}
		public void printA3() {
			System.out.println("Inside A3");
		}
		public void display() {
			z=50;
			System.out.println(z);
		}
	}
	
	


