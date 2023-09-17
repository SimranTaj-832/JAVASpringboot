package pk2;

import pk1.Chair;
import pk1.Circle;
import pk1.Sphere;
import pk1.Table;

public class ShapeMain {

	public static void main(String[] args) {
		Circle cob=new Circle(3);
		cob.display();
		
		Sphere sob=new Sphere(4);
		sob.display();
		
		System.out.println();
		Table tob=new Table();
		tob.input(600);
		tob.output();
		
		Chair ch=new Chair();
		ch.input(200);
		ch.output();
	}

}
