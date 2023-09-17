package Prac1;

import java.awt.Color;

public class tree {
	double height;
	double trunc;
	Treetype treetype;
	static Color trunc_color= new Color(102,51,0);//static parameters
	
	//classes are blue prints, make more tangible by adding constructors
	tree(double height, double trunc, Treetype treetype){
		this.height=height;
		this.trunc=trunc;
		this.treetype=treetype;
	}
	
	//static methods
	static void announcetree() {
		System.out.println("This is a "+trunc_color +" colour Tree");
	}
	
	void grow() {
		this.height=this.height+10;
		this.trunc=this.trunc+1;
	}
	
	void tall() {
		if(this.height>100) {
		System.out.println("It is a tall "+this.treetype+" tree");}
		else
			System.out.println(this.treetype+" tree is short ");
	}
}
