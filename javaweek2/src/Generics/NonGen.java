package Generics;

public class NonGen {
	Object ob;
	NonGen(Object o){
		ob=o;
	}
	Object getob() {
		return ob;
	}
	void showType() {
		System.out.println("Type of ob is "+ob.getClass().getName());
	}
	
	public static void main(String[] args) {
		NonGen iob=new NonGen(88);
		iob.showType();
		int v=(Integer)iob.getob();
		System.out.println("value: "+v);
		System.out.println();
		NonGen strOb=new NonGen("99");
		strOb.showType();
		String str=(String)strOb.getob();
		System.out.println("value: "+str);
		iob=strOb;
		v=(Integer)iob.getob();
		
	}

}
