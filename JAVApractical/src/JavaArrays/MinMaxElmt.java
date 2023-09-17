package JavaArrays;

import java.util.Collections;
import java.util.Arrays;

//search the minimum and the maximum element in an array
public class MinMaxElmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = new int[]{8, 2, 7, 1, 4, 9, 5};
	      int s = numbers[0];
	      int l = numbers[0];
	      
	      for(int i = 1; i < numbers.length; i++) {
	         if(numbers[i] > l)l = numbers[i];
	         else if (numbers[i] < s)s = numbers[i];
	      } 
	      System.out.println("Largest Number is : " + l);
	      System.out.println("Smallest Number is : " + s);
	      
	  	//by using Collection.max() and Collection.min() methods of Collection class
	      Integer[] num = { 8, 2, 7, 1, 4, 9, 5};
	      int min = (int) Collections.min(Arrays.asList(num));
	      int max = (int) Collections.max(Arrays.asList(num));
	      
	      System.out.println("Min number: " + min);
	      System.out.println("Max number: " + max);
	}


}
