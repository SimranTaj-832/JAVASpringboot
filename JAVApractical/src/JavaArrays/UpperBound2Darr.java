package JavaArrays;

import java.util.ArrayList;
import java.util.Collections;

//determine the upper bound of a two dimensional array
public class UpperBound2Darr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] data = new String[2][5];
	      System.out.println("Dimension 1: " + data.length);
	      System.out.println("Dimension 2: " + data[0].length);
	      
	    //Reverse Array
	      System.out.println("\nreverse linear array");
	     int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	      System.out.print("Array before reverse: ");
	      
	      for (int i = 0; i < numbers.length; i++) {
	         System.out.print(numbers[i] + " ");
	      } 
	      
	      for (int i=0;i<=numbers.length/2;i++) {
	    	  int temp=numbers[i];
	    	  numbers[i]=numbers[numbers.length-1-i];
	    	  numbers[numbers.length-1-i]=temp;
	      }
	      System.out.print("\nArray after reverse: ");
	      for (int i = 0; i < numbers.length; i++) {
	         System.out.print(numbers[i] + " ");
	      } 
	      
	      //reverses an array list by using Collections.reverse(ArrayList)method
	      System.out.println("\n\nreverse using Collections.reverse()");
	      ArrayList arrayList = new ArrayList();
	      arrayList.add("A");
	      arrayList.add("B");
	      arrayList.add("C");
	      arrayList.add("D");
	      arrayList.add("E");
	      System.out.println("Before Reverse Order: " + arrayList);
	      Collections.reverse(arrayList);
	      System.out.println("After Reverse Order: " + arrayList);
	}

}
