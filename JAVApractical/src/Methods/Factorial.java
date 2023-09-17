package Methods;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int n=0; n<=10;n++) {
		System.out.println("Factorial of "+n+"! is "+fact(n));}
	}
	public static long fact(int x) {
		if(x<=1) {
			return x;
		}else {
			return x*fact(x-1);
		}
	}
}
