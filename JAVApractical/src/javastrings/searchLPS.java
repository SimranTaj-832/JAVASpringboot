package javastrings;

//search the last position of a substring

public class searchLPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lastIndexOf() returns position in int 
		String str="Hello world, Hello reader, Hello writer!!";
		int lastPsnStr=str.lastIndexOf("Hello");
		
		if(lastPsnStr==-1) {
			System.out.println("Hello not found");
		}else {
			System.out.println("Last occurence of Hello found at position "+lastPsnStr);
		}
	}

}
