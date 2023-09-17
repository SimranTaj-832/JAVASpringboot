package AnonymousPac;

public interface sampleAnCl {
	public default void displayI1() {
		System.out.println("This is default display sample");
	}
	public default void output() {
		System.out.println("This is default output");
	}
	public void method1();
}
