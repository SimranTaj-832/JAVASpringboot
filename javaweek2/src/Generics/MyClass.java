package Generics;

public class MyClass<T extends Comparable<T>> implements MinMax<T> {
	T[] vals;
	MyClass(T[]o){vals=o;}
	public T min() {
		T v=vals[0];
		for(int i=1;i<vals.length;i++) {
			if(vals[i].compareTo(v)<0)
				v=vals[i];
		}
		return v;
	}
	public T max() {
		T v=vals[0];
		for(int i=1;i<vals.length;i++) {
			if(vals[i].compareTo(v)>0)
				v=vals[i];
		}return v;
	}

	public static void main(String[] args) {
		Integer inums[]= {3,6,2,8,6};
		Character chs[]= {'b','r','p','w'};
		String sarr[]= {"Mumbai","Bangalore","Chennai","Hydrabad"};
		MyClass<Integer>iob=new MyClass<Integer>(inums);
		MyClass<Character>cob=new MyClass<Character>(chs);
		System.out.println("Max value in inums: "+iob.max());
		System.out.println("Min value in inums: "+iob.min());
		System.out.println("Max value in chs: "+cob.max());
		System.out.println("Min value in chs: "+cob.min());
		MyClass<String>sob=new MyClass<String>(sarr);
		System.out.println("Max value in sarr: "+sob.max());
		System.out.println("Min value in sarr: "+sob.min());
	}

}
