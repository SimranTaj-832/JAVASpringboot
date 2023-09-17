package p4;

public class Cabs extends Abst1{
	int i;
	Cabs(){}
	Cabs(int i, String s){
		super(s);
		this.i=i;
	}
	public void output() {
		System.out.println(i+" "+s);
	}

}


