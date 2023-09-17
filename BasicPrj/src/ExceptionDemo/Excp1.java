package ExceptionDemo;

public class Excp1 {

	public static void main(String[] args) {
		int a[]=new int[4];
		try {
			a[0]=25;
			a[1]=3;
			a[2]=33;
			a[3]=43;
			for (int i=0;i<=4;i++) {
				System.out.println(a[i]+" ");
			}
		}
		catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println("Array size exceeded");
				System.out.println(ae);
			}
		finally {
			System.out.println("Exiting code");
		}
	}

}
