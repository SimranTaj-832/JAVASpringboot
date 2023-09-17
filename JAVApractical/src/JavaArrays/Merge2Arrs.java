package JavaArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//merge two arrays
public class Merge2Arrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {1,2,3,4};
	      int[]b = {4,16,1,2,3,22};
	      int[]c = new int[a.length+b.length];
	      int count = 0;
	      
	      for(int i = 0; i < a.length; i++) { 
	         c[i] = a[i];
	         count++;
	      } 
	      for(int j = 0; j < b.length;j++) { 
	         c[count++] = b[j];
	      } 
	      for(int i = 0;i < c.length;i++) System.out.print(c[i]+" ");
	      
	      System.out.println("\n----");
	      //use of list.Addall(array1.asList(array2) method of List class and Arrays.toString () method of Array class
	      String a1[] = { "A", "E", "I" };
	      String b1[] = { "O", "U" };
	      List list = new ArrayList(Arrays.asList(a1));
	      list.addAll(Arrays.asList(b1));
	      Object[] c1 = list.toArray();
	      System.out.println(Arrays.toString(c));
	}

}
