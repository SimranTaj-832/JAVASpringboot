package JavaArrays;

import java.util.Arrays;

public class ArrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//looping.
		String[] greeting = new String[3];
	      greeting[0] = "This is the greeting";
	      greeting[1] = "for all the readers from";
	      greeting[2] = "Java Source .";
	      
	      for (int i = 0; i < greeting.length; i++){
	         System.out.println(greeting[i]);
	      }
	     
	      //Array demo
	      String[] arr = new String[] {"This", "is", "greeting"}; 
	      System.out.println(Arrays.toString(arr));
	      
	      //Nested Array
	      String[][] deepArr = new String[][] {{"Sai", "Gopal"}, {"Pallavi", "Priya"}};
	      System.out.println(Arrays.toString(deepArr));
	      System.out.println(Arrays.deepToString(deepArr));

	}

}
