package p4;

public class A1 {
	int a;
	A1(int i){
		this.a=i;
	}
	void input(int a) {
		this.a=a;
	}
	void output() {
		System.out.println("Value of a is "+a);
	}
}
class A2 extends A1{
	String s;
	//A2(){}
	A2(String s, int i){
		super(i);
		this.s=s;
	}
	void accept(String s, int a) {
		this.s=s;
		input(a);
	}
	void display()
	{
		output();
		System.out.println("String is "+s);
	}
}
