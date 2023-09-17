package p1;

public class Circle {
	final double pi=3.147;
	double radius;
	double area;
	
	void crarea(int r){
		radius=r;
		area=pi*r*r;
		System.out.println(area);
		
	}

}
