package p1;

import p1.ClassA.I;

public class ClassA1 {
	int a;char b;
	class I{
		int ix;
		double iy;
		void method1() {
			ix=25;
			iy=55.75;
			System.out.println(ix+" "+iy);
		}
	}
	
	void method1() {
		a=10;b='P';
		System.out.println(a+" "+b);
		I iobj=new I();
		iobj.method1();
		
	}

	public static void main(String[] args) {
		ClassA1 obj= new ClassA1();
		obj.method1();
		
	}

}
