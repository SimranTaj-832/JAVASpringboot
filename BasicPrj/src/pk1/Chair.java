package pk1;

import intr.Furniture;

public class Chair implements Furniture{
	int h;
	public Chair(){	}
	public void input(int h) {
		this.h=h;		
	}
	public void output() {
		System.out.println("Chair of height "+h+"cm");
	}

	

}
