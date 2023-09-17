package Employee;

public class emp {
	String name;
	int age;
	double sal;
	String loc;
	static double inc = 0.1;
	
	emp(String name, int age, double sal, String loc){	
		this.name=name;
		this.age=age;
		this.sal=sal;
		this.loc=loc;
	}
	
	void raiseSal( ) {
		System.out.println(this.name +"s salary after increment: "+(this.sal+this.sal*inc)); 	
	}

}
