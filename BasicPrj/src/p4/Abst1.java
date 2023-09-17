package p4;

public abstract class Abst1 {
	String s;
	Abst1(){}
	Abst1(String s){
		this.s=s;
	}
	public void input(String s) {
		this.s=s;
	}
	abstract void output();

}
