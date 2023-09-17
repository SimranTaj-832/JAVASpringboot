package p1;

public class SampleApp {

	public static void main(String[] args) {
		Sample1 S1= new Sample1();
		S1.setId(101);
		S1.setName("Simra");
		S1.setCity("Bangalore");
		S1.setBalance(250000.00);
		System.out.println(S1.getId()+" "+S1.getName()+" "+S1.getCity()+" "+S1.getBalance());
	}

}
