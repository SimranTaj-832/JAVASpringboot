package Collectionsandmap;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrListdemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Simra");
		al.add("Sani");
		al.add("Sam");
		al.add("Khiz");
		al.add("Tas");
		al.add("Waq");
		System.out.println(al);
		Object arr[];
		arr=al.toArray();
		for(Object oarr:arr) {
			System.out.println(oarr);
		}
		System.out.println();
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Shas");
		al2.add("Soh");
		al2.add("Sara");
		al2.add("Sabh");
		al2.add("Sijj");
		al2.add("Saf");
		al.addAll(al2);
		boolean b1;
		b1=al.containsAll(al2);
		System.out.println(b1);
		System.out.println(al);
		System.out.println();
		
		List<String>al3=new ArrayList<String>();
		al3=al.subList(2, 5);
		System.out.println(al3);
		System.out.println();
		
		String str;
		Iterator<String> ir=al.iterator();
		while(ir.hasNext()) {
			str=(String)ir.next();
			System.out.println(str);
		}

	}

}
