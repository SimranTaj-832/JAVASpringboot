package JavaArrays;

import java.util.Arrays;

//fill (initialize at once) an array 
public class fillInitializeonce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[6];
	      Arrays.fill(array, 100);
	      
	      for (int i = 0, n = array.length; i < n; i++) {
	         System.out.println(array[i]);
	      }
	      System.out.println();
	      Arrays.fill(array, 3, 6, 50);
	      
	      for (int i = 0, n = array.length; i < n; i++) {
	         System.out.println(array[i]);
	      }
	      
	   // initializing int array
	      int arr[] = new int[] {1, 6, 3, 2, 9};
	      
	      // let us print the values
	      System.out.println("Actual values: ");
	      
	      for (int value : arr) {
	         System.out.println("Value = " + value);
	      } 
	      
	      // using fill for placing 18
	      Arrays.fill(arr, 18);
	      
	      // let us print the values
	      System.out.println("New values after using fill() method: ");
	      
	      for (int value : arr) {
	         System.out.println("Value = " + value);
	      }
	      
	      System.out.println("\nExtend an array after initialisation");
	      String[] names = new String[] { "A", "B", "C" };
	      String[] extended = new String[5];
	      extended[3] = "D";
	      extended[4] = "E";
	      System.arraycopy(names, 0, extended, 0, names.length);
	      
	      for (String str : extended){
	         System.out.println(str);
	      }
	      
	      System.out.println("compare Arrays");
	      int arr1[] = {1, 2, 3};
	      int arr2[] = {1, 2, 3};
	   
	      if (Arrays.equals(arr1, arr2)) System.out.println("Same"); 
	      else System.out.println("Not same");
	     
	}

}
