package javastrings;

//match regions in strings
public class RegionMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str1 = "Welcome to Microsoft";
	      String str2 = "I work with Microsoft";
	      boolean match = str1.regionMatches(11, str2, 12, 9);
	      System.out.println("str1[11 -19] == str2[12 - 21]:- "+ match);
	}

}
