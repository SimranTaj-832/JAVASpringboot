package javastrings;

//Compare two strings in Java
public class Scompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello World";
		String str2="hello world";
		Object objstr=str1;
		String str3= new String("Hello world");
		
		//using compareTo()
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.compareTo(objstr.toString())+"----\n");
		
		//using equals()
		System.out.println(str1.equals(objstr.toString()));
		System.out.println(str2.equals(str3)+"----\n");
		
		//using == operator
		System.out.println(str1==str2);
		System.out.println(str1==objstr.toString());
		System.out.println(str1==str3);
		
	}

}
