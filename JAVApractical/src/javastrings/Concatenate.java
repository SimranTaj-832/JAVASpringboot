package javastrings;

//optimize string concatenation
public class Concatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="This is ",s2="testing the ",s3="difference ",s4="between ",s5="String & ",s6="StringBuffer";
//		String result =s1+s2+s3+s4+s5+s6;
//		System.out.println(result);
		
		long startTime=System.currentTimeMillis();
		 for(int i=0;i<50000;i++) {
			 String result =s1+s2+s3+s4+s5+s6;
		 }
		 long endTime = System.currentTimeMillis();
	      System.out.println("Time taken for string" 
	         + "concatenation using + operator : " 
	         + (endTime - startTime)+ " ms");
	      long startTime1 = System.currentTimeMillis(); 
	      
	      for(int i=0;i<50000;i++) {
	    	  StringBuffer result=new StringBuffer();
	    	  result.append(s1);
	    	  result.append(s2);
	    	  result.append(s3);
	    	  result.append(s4);
	    	  result.append(s5);
	    	  result.append(s6);}
	    	  long endTime1 = System.currentTimeMillis();
	          System.out.println("Time taken for String concatenation" 
	             + "using StringBuffer : "
	             + (endTime1 - startTime1)+ " ms");
	}

}
