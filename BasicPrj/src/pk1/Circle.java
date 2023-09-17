package pk1;

import intr.Shape;

public class Circle implements Shape {
	double d;
	public Circle(double d){
		this.d=d;
	}
	public double calDimension() {
		 
		return pi*d*d;
	}
	public void display() {
		System.out.println("Circle: radius= "+d+" area: "+calDimension());
		
	}
}
