package Collectionsandmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class CollectionAlgos {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(-8);
		ll.add(20);
		ll.add(-20);
		ll.add(8);
		ll.add(23);
		ll.add(35);
		ll.add(53);
		ll.add(12);
		int i;
		Comparator<Integer> r=Collections.reverseOrder();
		Collections.sort(ll);
		System.out.println("List sorted in Ascending order: \n"+ll);
		
		i=Collections.binarySearch(ll, 23);
		System.out.println("23 is @ position: "+i);
		
		Collections.sort(ll,r);
		System.out.println("List sorted in reverse: ");
		for(int i1:ll) {
			System.out.print(i1+" ");
		}
		int j;
		j=Collections.binarySearch(ll, 23);
		System.out.println("\n23 is @ position: "+j);
		
		Collections.shuffle(ll);
		System.out.println("List shuffled: ");
		for(int i2: ll) {
			System.out.print(i2+" ");
		}
		System.out.println();
		System.out.println("Minimum: "+Collections.min(ll));
		System.out.println("Maximum: "+Collections.max(ll));
	}

}
