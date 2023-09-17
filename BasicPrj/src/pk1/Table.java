package pk1;

import intr.Furniture;

public class Table implements Furniture{
	int len;
	public Table(){	}
	public void input(int l) {
		this.len=l;
	}
	public void output() {
		System.out.println("Table of length "+len+"cm");
	}
	

}
