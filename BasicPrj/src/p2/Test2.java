package p2;

public class Test2 {
	float p;
	static Test1 tobj;
	Test2()
	{
		tobj=new Test1();
		p=0.00f;
	}
	void accept(float r)
	{
		p=r;
		tobj.input(50,'A');
	}
	void display()
	{
		System.out.println(p);
		tobj.output();
	}

}
