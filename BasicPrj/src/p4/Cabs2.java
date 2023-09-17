package p4;

public class Cabs2 extends Abst1{
	double d;
	Cabs2(){}
	Cabs2(double d, String s){
		super(s);
		this.d=d;
	}
	public void output() {
		System.out.println(d+" "+s);
	}
	
}
