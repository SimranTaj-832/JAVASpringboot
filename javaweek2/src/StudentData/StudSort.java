package StudentData;

import java.util.ArrayList;
import java.util.Collections;

public class StudSort {

	public static void main(String[] args) {
		ArrayList<Student> ar=new ArrayList<Student>();
		ar.add(new Student(104,"Tas",590));
		ar.add(new Student(103,"Waq",586));
		ar.add(new Student(101,"Kiz",599));
		ar.add(new Student(102,"Sim",550));

		
		System.out.println("Unsorted");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		Collections.sort(ar, new SortbyName());
		
		System.out.println("\nSorted by Name");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		Collections.sort(ar,new SortbyMarks());
		
		System.out.println("\nSorted by Marks");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		

	}


}
