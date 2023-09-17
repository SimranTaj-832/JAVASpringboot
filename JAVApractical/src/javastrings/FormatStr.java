package javastrings;

import java.util.Locale;

//format strings
public class FormatStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  double e = Math.E;
	      System.out.format("%f%n", e);
	      System.out.format(Locale.GERMANY, "%-10.4f%n%n", e);
	      
	      String name = "Hello World";
	      String s1 = String.format("name %s", name);
	      String s2 = String.format("value %f",32.33434);
	      String s3 = String.format("value %32.12f",32.33434);
	      System.out.print(s1);
	      System.out.print("\n");
	      System.out.print(s2);
	      System.out.print("\n");
	      System.out.print(s3);
	      System.out.print("\n");
	}

}
