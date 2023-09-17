package p1;

public class binop {

	public static void main(String[] args) {
		byte n1=27;
		byte n2=23;
		int n3;
		n3=n1&n2;
		System.out.println(n3);
		n3=0;
		n3=n1|n2;
		System.out.println(n3);
		n3=0;
		n3=n1^n2;
		System.out.println(n3);
		
		 byte p=21;
	       int q;
	       q= p>>2;
	       System.out.println(q);
	       byte p1=21;
	       int q1;

	       q1= p1<<2;
	       System.out.println(q1);

	       int a1=25;
	       boolean b1;
	       b1= (a1>20?true:false);
	       if(b1)
	           System.out.println(true);
	       else
	           System.out.println(false);

	}

}
