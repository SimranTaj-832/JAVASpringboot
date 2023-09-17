package Collectionsandmap;
import java.util.ArrayList;


public class ArrayListDemo1 {

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
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Shas");
		al2.add("Soh");
		al2.add("Sara");
		al2.add("Sabh");
		al2.add("Sijj");
		al2.add("Saf");
		al.addAll(al2);
		System.out.println("After adding al2 "+"\n"+al);
		al.retainAll(al2);
		System.out.println("After retaining al2 "+"\n"+al);
		
	}

}
