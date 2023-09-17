package AnonymousPac;

public class Testp implements sampleAnCl,sampleAnC2 {
	public void output() {
		displayI1();
		displayI2();
	}
	public void outputI2() {}
	
	public void method1() {
		System.out.println("Inmethod1");
	}

	public static void main(String[] args) {
		Testp obj=new Testp();
		obj.output();
		obj.displayI2();
	}

}
