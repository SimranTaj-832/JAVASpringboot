package p4;

public class A3 extends A2 {
	double d1;
	A3(double d, String s,int i){
		super(s,i);
		this.d1=d;
	}
	void inputd(double d1) {
		this.d1=d1;
	}
	void outputd() {
		System.out.println("Double value: "+d1);
	}

}
