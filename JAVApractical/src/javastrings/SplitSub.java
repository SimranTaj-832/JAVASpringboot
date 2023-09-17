package javastrings;

//split a string into a number of substrings
public class SplitSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Jan-Feb-March";
	      String[] temp;
	      String delimeter = "-";
	      temp = str.split(delimeter);
	      
	      for(int i = 0; i < temp.length; i++) {
	         System.out.println(temp[i]);
	         System.out.println("");
	         str = "Jan.Feb.March";
	         delimeter = "\\.";
	         temp = str.split(delimeter);
	      }
	      System.out.println("-----------");
	      for(int i = 0; i < temp.length; i++) {
	         System.out.println(temp[i]);
	         System.out.println("");
	         temp = str.split(delimeter,2);
	         
	         for(int j = 0; j < temp.length; j++){
	            System.out.println(temp[j]);
	         }
	      }
	      System.out.println("-----------");
	      //separate by space
	      String s1 = "Jan Feb Mar Apr May"; 
	      String[] words = s1.split("\\s"); 
	      for(String w:words) {
	         System.out.println(w);  
	      }  
	}

}
