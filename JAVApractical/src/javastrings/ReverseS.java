package javastrings;

//reverse a String in Java
public class ReverseS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using StringBuffer(s).reverse().toString()
		String str="adroit s aura";
		String revStr= new StringBuffer(str).reverse().toString();
		System.out.println("Original String: "+str);
		System.out.println("Reversed String: "+revStr);
		
		//using command line input
		char ArrStr[]=str.toCharArray();
		for(int i=ArrStr.length-1; i>=0; i--) {
			 System.out.print(ArrStr[i]);
		}
	}

}
