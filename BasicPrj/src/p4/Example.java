package p4;

public class Example {
	static void vaTest(double n, int ...v) {
		System.out.println(n);
		for(int i:v)
			System.out.println(i);
	}
	static void vaTrst(int ...v) {
		System.out.println("Number of args: "+v.length+" Contents");
		for(int x:v)
			System.out.print(x+" ");
		System.out.println();
	}
	
public static void main(String args[])
{
	vaTest(10);
	vaTest(1,2,3);
	//vaTest();
	vaTest(10,75,10,20);	
}

}
