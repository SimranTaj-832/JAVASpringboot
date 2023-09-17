package p1;

public class StudentApp {

	public static void main(String[] args) {
		Student sobj= new Student();
		/*sobj.input(101,"Akash", 89);
		sobj.output();
		
		Student obj1=new Student(102,"Ashna", 87);
		obj1.output();*/
		sobj.setSid(201);
		sobj.setSname("Akash");
		sobj.setPercentage(89);
		
		sobj.cobj.input("HKBKCE", "Bangalore");
		sobj.cobj.output();
		System.out.println(sobj);
		
		college cobj1=new college();
		cobj1.setCname("HKBKCE");
		cobj1.setCity("Bangalore");
		Student.setCobj(cobj1);
		Student.getCobj();
		
		
		

	}

}
