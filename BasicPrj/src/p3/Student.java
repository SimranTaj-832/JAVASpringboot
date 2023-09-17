package p3;

import java.util.Arrays;

public class Student {
	int studentid;
    String sname;
    int marks[];  
    static Course cobj;
    Student(){
    	marks=new int[3];
    }
     
    public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public static Course getCobj() {
		return cobj;
	}
	public static void setCobj(Course cobj) {
		Student.cobj = cobj;
	}
	

	void calResult()
    {
         int total=0;
         for(int i=0;i<3;i++) {
        	 total+= marks [i];
         }
         float p;
         p=total/3;
        if (p>35 && p <50)
        	 System.out.println("Student result = Pass");
 		else if(p>50&p<65)
 			System.out.println("Student result = Second class");
 		else if(p>65&p<75)
 		System.out.println("Student result = Firat class");
 		else if(p>75&p<85)
 		System.out.println("Student result = First class with Distinction");
 		else if(p>85&p<100)
 		System.out.println("Student result = Distinction");
 		else
 			System.out.println("Student result = Fail");  
        
   }



	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", sname=" + sname + ", marks=" + Arrays.toString(marks) + "]";
	}
	
    

}
