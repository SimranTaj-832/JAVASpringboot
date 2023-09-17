package ExceptionDemo;

public class SampleThEx1 {
	public static void main(String[] args) {
		System.out.println("Multi Threading");
		System.out.println(Thread.currentThread());
		String str;
		str=Thread.currentThread().getName();
		System.out.println(str);
		int n;
		n=Thread.currentThread().getPriority();
		System.out.println(n);
		Thread.currentThread().setPriority(7);
		n=Thread.currentThread().getPriority();
		Thread.currentThread().setName("Sony");
		String str2;
		System.out.println(Thread.currentThread());
		str2=Thread.currentThread().getName();
		System.out.println(str2);
		System.out.println(n);
	}

}
