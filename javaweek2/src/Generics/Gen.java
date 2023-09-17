package Generics;

public class Gen<T1,T2> {
	T1 ob1;
	T2 ob2;
	Gen(T1 o1,T2 o2){
		ob1=o1;
		ob2=o2;
	}
	T1 getob1() {
		return ob1;
	}
	T2 getob2() {
		return ob2;
	}
	void showType() {
		System.out.println("Type of T1 is "+ob1.getClass().getName());
		System.out.println("Type of T2 is "+ob2.getClass().getName());
	}

	public static void main(String[] args) {
		Gen<Integer,Double> iOb= new Gen<Integer,Double>(88,75.75);
		iOb.showType();
		int v1=iOb.getob1();
		double v2=iOb.getob2();
		System.out.println("value: "+v1);
		System.out.println("value: "+v2);
		Gen<String,Double> strOb= new Gen<String, Double>("General Test", 88.75);
		strOb.showType();
		String str=strOb.getob1();
		System.out.println("value: "+str);
		Gen<Integer, Double> iOb2=new Gen<Integer, Double>(100,76.78);
		iOb2.showType();
		int x1=iOb2.getob1();
		double x2=iOb2.getob2();
		iOb=iOb2;		
	}

}
