package pk1;

public abstract class SampleAbs {
	int n;
	String s;
	public SampleAbs(){}
	public SampleAbs(int i,String s){
		this.n=i;
		this.s=s;
	}
	public void display() {
		System.out.println("Inside Abstract class: " +n +" "+s);
	}
	protected abstract void outputAbs();

}
