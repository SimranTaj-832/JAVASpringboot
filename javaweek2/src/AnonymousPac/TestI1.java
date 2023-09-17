package AnonymousPac;

public interface TestI1 {
	void abstractFun(int x);
	default void normalFun() {
		System.out.println("Hello");
	}
}
