package ExceptionDemo;

public class SampleException extends Exception {
	private static final long serialVersionUID=1L;
	private int age;
	SampleException(int x){
		age=x;
	}
	public String toString() {
		return "Its an Sample Exception";
	}

}
