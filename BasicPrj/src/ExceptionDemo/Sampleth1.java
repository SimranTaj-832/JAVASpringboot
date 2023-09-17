package ExceptionDemo;

public class Sampleth1 extends Thread {
	int n;
	String s;
	Sampleth1(String s1){
		n=0;
		s=s1;
		start();	
	}
	public void run() {
		for (int i=0;i<50;i++) {
			n=i+2;
			System.out.print(""+s+":"+"n->"+n);
		}
		System.out.println();
	}

}
