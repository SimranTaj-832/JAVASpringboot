package Collectionsandmap;

import java.util.HashSet;
import java.util.Iterator;

import Payroll.Salary;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String>hs1=new HashSet<String>();
		hs1.add("West Bengal");
		hs1.add("Karnataka");
		hs1.add("Maharashtra");
		hs1.add("Uttar Pradesh");
		hs1.add("Bihar");
		hs1.add("Jarkhand");
		hs1.add("Assam");
		hs1.add("Goa");
		System.out.println(hs1);
		hs1.add("Goa");
		System.out.println(hs1);
		Iterator<String> it1=hs1.iterator();
		String str;
		while(it1.hasNext()) {
			str=(String)it1.next();
			System.out.print(str+", ");
		}
	}

}
