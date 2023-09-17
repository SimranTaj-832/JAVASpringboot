package Collectionsandmap;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet<String> sts= new TreeSet<String>(new MyComp());
	      sts.add("C");
	      sts.add("A");
	      sts.add("B");
	      sts.add("E");
	      sts.add("F");
	      sts.add("D");
	      sts.add("Z");
	      sts.add("P");
	      sts.add("R");
	      sts.add("M");
	      System.out.println(sts);
	      Iterator<String> i=sts.iterator();
	      while(i.hasNext()) {
	    	  Object element=i.next();
	    	  System.out.print(element+" ");
	      }
	      System.out.println();
	      System.out.println(sts);
	}

}
