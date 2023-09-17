package p1;

public class ClassA {
	int a;char b;
	static class I{
		static int ix;
		static double iy;
		static void method1() {
			ix=25;
			iy=55.75;
			System.out.println(ix+" "+iy);
		}
	}
	
	void method1() {
		a=10;b='P';
		System.out.println(a+" "+b);
		I.method1();
	}

	public static void main(String[] args) {
		ClassA obj= new ClassA();
		obj.method1();
		ClassA.I.method1();
		
	}

}
