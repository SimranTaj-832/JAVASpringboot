package javastrings;


//Remove a particular character from a string in Java
public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Hello this is a String";
		System.out.println(removeCharAt(str,14));
	}
		
		public static String removeCharAt(String s, int p) {
			return s.substring(0,p)+s.substring(p+1);
		}
	

}
