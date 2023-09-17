package pk2;
import pk1.SampleAbs;

public class Sample1 extends SampleAbs {
	double d;
	Sample1(){}
	Sample1(int i,String s,double d){
		super(i,s);
		this.d=d;
	}
	protected void outputAbs() {
		System.out.println("value of d is "+d);
	}

}
