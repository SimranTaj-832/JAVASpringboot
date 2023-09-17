package intr;

public class sample extends C1 implements I1 {
	double d;
	sample(){}
	sample(double d, String s){
		super(s);
		this.d=d;
	}
	public void output() {
		System.out.println("Data members of sample class: "+d+" "+s+" "+x);
	}
}
