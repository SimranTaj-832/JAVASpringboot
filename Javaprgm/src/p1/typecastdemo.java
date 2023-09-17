package p1;

public class typecastdemo {

	public static void main(String[] args) {
		int base=6, height=5;
		double area=0.00;
		area=0.5*base*height;
		System.out.print(area);
		
		int x1=3,x2=4;
		double d2=x1/x2;
		System.out.println(d2);
		double d3= (double)x1/x2;
		System.out.println(d3);
	}

}
