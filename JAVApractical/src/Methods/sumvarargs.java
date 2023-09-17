package Methods;

//method take variable lentgth argument as an input
public class sumvarargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
	      sum = sumvarargs(new int[]{10,12,33});
	      System.out.println("The sum of the numbers is: " + sum);
	      
	      display();
	      display("Tutorialspoint");
	      display("my","name","is","Sairamkrishna Mammahe");
	}
	static int  sumvarargs(int... intArrays) {
	      int sum, i;
	      sum = 0;
	      for(i = 0; i< intArrays.length; i++) {
	         sum += intArrays[i];
	      }
	      return(sum);
	   }
	static void display(String... values) {
	      System.out.println("display method invoked ");
	      for(String s:values) {
	         System.out.println(s);  
	      }  }
}
