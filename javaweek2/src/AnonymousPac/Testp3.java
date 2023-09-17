package AnonymousPac;

public class Testp3 {

	public static void main(String[] args) {
		int op,n1,n2;
		n1=10;n2=25;
		I1 iobj = (int a, int b)->a+b;
		op=iobj.operation(n1, n2);
		System.out.println(op);
		I1 iobj2=(int a,int b)->n2-n1;
		op=iobj2.operation(n1, n2);
		System.out.println((op));
	}

}
