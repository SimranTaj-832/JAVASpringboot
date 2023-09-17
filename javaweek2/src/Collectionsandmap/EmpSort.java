package Collectionsandmap;

import java.util.ArrayList;
import java.util.Collections;

public class EmpSort {

	public static void main(String[] args) {
		ArrayList<Employee1> ar=new ArrayList<Employee1>();
		ar.add(new Employee1(111,"bbbb","london"));
		ar.add(new Employee1(131,"aaaa","UK"));
		ar.add(new Employee1(121,"cccc","Europe"));
		
		System.out.println("Unsorted");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		Collections.sort(ar,new SortbyEid());
		
		System.out.println("\nSorted by Empid");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		Collections.sort(ar, new SortByName());
		
		System.out.println("\nSorted by Name");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

	}

}
