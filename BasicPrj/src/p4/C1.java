package p4;

public class C1 {
	int a;
	void input(int a) {
		this.a=a;
	}
	void output() {
		System.out.println("Value of a is: "+a);
	}
}
class C2 extends C1{
	String s;
	void accept(String s) {
		this.s=s;
	}
	void display()
	{
		System.out.println("String is "+s);
	}
	
}
class C3 extends C2{
	double d1;
	void inputd(double d1) {
		this.d1=d1;
	}
	void outputd() {
		System.out.println("Double value: "+d1);
	}
	
}
