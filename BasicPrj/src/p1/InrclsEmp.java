package p1;

public class InrclsEmp {

	public static void main(String[] args) {
		Emp1 ob = new Emp1();
		ob.setEid(1001);
		ob.setEname("Ash");
		ob.aobj.inputAddr(201,"Bangalore");
		System.out.println(ob);
		System.out.println(ob.getEname()+" "+ob.getEid());
		System.out.println(ob.getAobj().city);
		
		System.out.println();
		Address ob1 = new Address();
		ob1.setHno(101);
		ob1.setArea("RT nagar");
		ob1.setCity("Bangalore");
		System.out.println(ob1);
		
		System.out.println();
		Empinr1 ob2=new Empinr1();
		ob2.setEid(301);
		ob2.setEname("Simra");
		System.out.println(ob2);
		ob2.method();
		ob2.output();


	}

}
