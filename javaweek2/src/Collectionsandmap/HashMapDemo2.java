package Collectionsandmap;

import java.util.HashMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
		HashMap<Emp,Double> hm= new HashMap<Emp,Double>();
	     hm.put(new Emp(101,"Ajay",15000.00), 25.75);
	     hm.put( new Emp(102,"Sujay",20000.00),35.75);
	     hm.put(new Emp(103,"Vijay",21000.00), 15.75);
	     hm.put(new Emp(104,"Jay",110000.00), 20.75);
	     hm.put(new Emp(105,"Nigam",50000.00), 66.75);
	     hm.put(new Emp(101,"Ajay",25000.00), 22.75);
	     hm.put(new Emp(101,"Ajay",25000.00), 25.75);
	    System.out.println(hm);
	}

}
