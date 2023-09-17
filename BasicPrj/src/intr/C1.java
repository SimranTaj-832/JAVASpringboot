package intr;

public class C1 implements I1{
	String s;
	C1(){}
	C1(String s){
		this.s=s;
	}
	public void output() {
		System.out.println("C1 class data members: "+s+" "+x);
	}

}
