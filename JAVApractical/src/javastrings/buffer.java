package javastrings;

//
public class buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//buffers strings and flushes it by using emit() method
		countTo_N_Improved();
		
		//StringBuffer and StringBuilder classes are used for creating mutable string
		StringBuffer sb = new StringBuffer(" hello");
	    sb.append(" world");
	    sb.insert(0, " My Buffer");
	    System.out.print(sb);
	}
	private final static int MAX_LENGTH = 30;
	   private static String buffer = "";
	   
	   private static void emit(String nextChunk) {
	      if(buffer.length() + nextChunk.length() > MAX_LENGTH) {
	         System.out.println(buffer);
	         buffer = "";  
	      }
	      buffer += nextChunk;
	   }
	   private static final int N = 100;
	   private static void countTo_N_Improved() {
	      for (int count = 2; count <= N; count = count +2) {
	         emit(" " + count);
	      }
	   }
	   
	   
}
