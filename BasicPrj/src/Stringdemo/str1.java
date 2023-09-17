package Stringdemo;

public class str1 {

	public static void main(String[] args) {
		char c[]= {'S','o','n','y'};
		for(char x:c){
			System.out.println(x);
		}
		String s1= new String(c);
		String s2=new String(s1);
		System.out.println(s1);
		System.out.println(s2);
		
		byte a[]= {65,66,67,68,69,70,71,72};
		String s3=new String(a);
		System.out.println(s3);
		String s4=new String(a,2,4);
		System.out.println(s4);
		
		String s5="Hello";
		String s6=new String(s5);
		System.out.println(s5+" Equals "+s6+" -> "+s5.equals(s6));
		System.out.println(s5==s6);
		
		String st3="HELLO";	
		System.out.println(s5 + " equalsIgnoreCase " + st3 + " -> "+ s5.equalsIgnoreCase(st3));

	}

}
