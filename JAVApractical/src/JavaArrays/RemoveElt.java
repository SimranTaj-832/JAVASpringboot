package JavaArrays;

import java.util.ArrayList;

//remove an element of array
public class RemoveElt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object array
		ArrayList objArray = new ArrayList();
	      objArray.clear();
	      objArray.add(0,"0th element");
	      objArray.add(1,"1st element");
	      objArray.add(2,"2nd element");
	      System.out.println("Array before removing an element"+objArray);
	      objArray.remove(1);
	      objArray.remove("0th element");
	      System.out.println("Array after removing an element"+objArray);
	      
	      //integer array
	      ArrayList<Integer> arr = new ArrayList<Integer>(5);
	      arr.add(20);
	      arr.add(15);
	      arr.add(30);
	      arr.add(45);
	      
	      System.out.println("Size of list: " + arr.size());
	      for (Integer number : arr) {
	         System.out.println("Number = " + number);
	      } 
	      arr.remove(2);
	      System.out.println("Now, Size of list: " + arr.size());
	      
	      for (Integer number : arr) {
	         System.out.println("Number = " + number);
	      } 

	}

}
