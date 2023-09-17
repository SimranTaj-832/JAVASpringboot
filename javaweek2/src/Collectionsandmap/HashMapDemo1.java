package Collectionsandmap;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<Double, Emp> hm= new HashMap<Double, Emp>();
	     hm.put(25.75, new Emp(101,"Ajay",15000.00));
	     hm.put(35.75, new Emp(102,"Sujay",20000.00));
	     hm.put(15.75, new Emp(103,"Vijay",21000.00));
	     hm.put(20.75, new Emp(104,"Jay",110000.00));
	     hm.put(66.75, new Emp(105,"Nigam",50000.00));
	     hm.put(22.75, new Emp(101,"Ajay",25000.00));
	     hm.put(25.75, new Emp(101,"Ajay",25000.00));
	     System.out.println(hm);
	     
	     
	}

}
