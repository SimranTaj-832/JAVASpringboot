package javastrings;

//replace a substring inside a string by another one in Java
public class ReplaceSubsinStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		System.out.println(str.replace("o","OoO"));
		System.out.println(str.replaceFirst("He", "Ha"));
		System.out.println(str.replaceAll("l", "L"));
	}

}
