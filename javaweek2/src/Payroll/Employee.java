package Payroll;

import java.sql.Date;

public class Employee {
	int Eid;
	String Name;
	String Gender;
	//Date DOB;
	//Date DOJ;
	Employee(){}
	Employee(int Eid,String Name,String Gender){
		this.Eid=Eid;
		this.Name=Name;
		this.Gender=Gender;
		//this.DOB=DOB;
		//this.DOJ=DOJ;
		/*try {
		if(DOJ.before(DOB)) {
			throw new IllegalArgumentException("Date of joining cannot be less than Date of Birth!!");
		}}
		catch (IllegalArgumentException ex) {System.out.println(ex.getMessage());}*/
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	/*public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public Date getDOJ() {
		return DOJ;
	}
	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}*/
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Name=" + Name + ", Gender=" + Gender + ", DOB= "  + ", DOJ= "  + "]";
	}
	
	
}
