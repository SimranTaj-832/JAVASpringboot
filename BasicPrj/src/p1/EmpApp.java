package p1;

public class EmpApp {

	public static void main(String[] args) {
		Emp eobj1;
		eobj1 = new Emp();
		eobj1.input(101,"Akash", 200000.00);
		eobj1.output();
		
		Emp eobj2 = new Emp();
	    eobj2.input(102,"Ahsas", 250000.00);
		eobj2.output();
		
		Emp eobj3=eobj1;
		eobj3.output();
		
		Emp eobj4=new Emp(103,"Ashna", 265000.00);
		eobj4.output();
		System.out.println(eobj4);
		eobj4.displaycount();
		
		Emp arr[];
		arr=new Emp[3];
		arr[0]=new Emp(302,"Ashish",250000.00);
		arr[1]=new Emp();
		arr[1].input(303, "Aman", 210000.00);
		arr[2]=new Emp(304,"Ahana",260000.00);
		for(Emp e:arr) {
			e.output();
		}
		
		
		Emp eobj5=new Emp(103,"Ashna", 265000.00);
		eobj5.output();
		boolean b1= eobj4.equals(eobj5);
		if(b1) {
			System.out.println("Equal");
		}
		else
			System.out.println("Not equal");
		System.out.println("Total Employees: "+Emp.ecount);


	}

}
