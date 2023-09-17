package Methods;

public class Jumpoutofloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break
		int[] intary = { 99,12,22,34,45,67,5678,8990 };
	    int n = 5678;
	    boolean found=false;
	    int i=0;
	    
	    for(;i<=intary.length;i++) {
	    	if(intary[i]==n) {
	    		found=true;
	    		break;	    	}
	    }
	    if(found) {
	    	System.out.println("Found the no: " + n + " at  index: " + i);
	    }else
	    	System.out.println("Found the no: " + n + " not found");
	    //Continue
	    StringBuffer searchstr = new StringBuffer(
	            "hello how are you. ");
	         int length = searchstr.length();
	         int count = 0;
	        //Labels in a mothod
	         testlbl:for (int i1 = 0; i1 < length; i1++) {
	            if (searchstr.charAt(i1) != 'h') {continue testlbl;}
	            count++;
	            	searchstr.setCharAt(i1, 'H');
	            	//break testlbl;
	         }
	         System.out.println("Found " + count + " h's in the string.");
	         System.out.println(searchstr);
	    for(int j=0;j<=10;j++) {
	    	if(j%2==0) {	 continue ;}
	    	System.out.print(j);	    	
	    }
	}

	}
