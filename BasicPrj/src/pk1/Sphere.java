package pk1;

import intr.Shape;

public class Sphere implements Shape {
	double r;
	public Sphere(double r){
		this.r=r;
	}
	public double calDimension() {
		return 4*pi*r*r;
	}
	public void display() {
		System.out.println("Sphere : radius= "+r+" area= "+calDimension());
	}
}
