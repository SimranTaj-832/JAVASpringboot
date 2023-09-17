package javastrings;

//search a word inside a string in Java
public class SearchStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="The cat is on the top";
		int index=str.indexOf("the");
		//string exist or not
		System.out.println(str.contains("the"));
				
		//finding position
		if(index==-1) {
		System.out.println("String not found");
		}else {
			System.out.println("String found at: "+index);
		}
	}

}
