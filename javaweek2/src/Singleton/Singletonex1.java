package Singleton;

public class Singletonex1 {

	private static Singletonex1 single_instance=null;
	public String s;
	private Singletonex1() {
		s="Hello I am part of the string..........";
	}
	public static Singletonex1 getInstance() {
		if(single_instance==null) 
			single_instance=new Singletonex1();
		return single_instance;
	}

}
