package Collectionsandmap;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String>ll1=new LinkedList<String>();
		ll1.add("Bangalore");
		ll1.add("Kolkata");
		ll1.add("Delhi");
		ll1.add("Hydrabad");
		int n=ll1.size();
		System.out.println("Size of lli is: "+n);
		
		ListIterator<String> li=ll1.listIterator();
		String str="";
		while(li.hasNext()) {
			str=(String)li.next();
			System.out.print(" "+str+" "+"->");
		}
		System.out.println("\n");
		while(li.hasPrevious()) {
			str=(String)li.previous();
			System.out.print(" "+str+" "+"->");
		}
System.out.println();
	}

}
