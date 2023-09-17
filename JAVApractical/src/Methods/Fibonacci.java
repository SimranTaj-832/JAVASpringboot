package Methods;

//method for calculating fibonacci series
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int counter = 0; counter <= 10; counter++){
	         System.out.printf("Fibonacci of %d is: %d\n", counter, fib(counter));
	      }
		
		//linear method:
		int count = 15;
	      int[] feb = new int[count];
	      feb[0] = 0;
	      feb[1] = 1;
	      
	      for(int i = 2; i < count; i++) {
	         feb[i] = feb[i-1] + feb[i-2];
	      } 
	      for(int i = 0; i < count; i++) {
	         System.out.print(feb[i] + " ");
	      }
		}
	public static long fib(long n) {
		if(n==0||n==1) {
			return n;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}
}
