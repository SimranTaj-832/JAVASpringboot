package p3;

public class StudMain {

	public static void main(String[] args) {
		Course C=new Course();
		String s[]={"java","HTML","SAP"};
		int d[]= {2,3,4};
		C.setCourseName(s);
		C.setDuration(d);
		
		
		Student S[]=new Student[3];
		S[0]=new Student();
		int m[]= {32,25,28};
		S[0].setStudentid(101);
		S[0].setSname("Simra");
		S[0].setMarks(m);
		
		S[0].setCobj(C);
		
		S[1]=new Student();
		int m1[]= {80,84,78};
		S[1].setStudentid(102);
		S[1].setSname("Khiz");
		S[1].setMarks(m1);
		
		S[2]=new Student();
		int m2[]= {88,94,78};
		S[2].setStudentid(103);
		S[2].setSname("Tas");
		S[2].setMarks(m2);
		
		System.out.println(Student.cobj);
		for(Student ob:S) {	
			System.out.println(ob);
			ob.calResult();
		}
		
	}

}
