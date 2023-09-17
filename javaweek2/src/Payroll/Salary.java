package Payroll;

import java.sql.Date;

public class Salary extends Employee implements Department {
	int Basic;
	int HRA;
	int DA;
	int PF;
	int insurance;
	int tax;
	Salary(){}
	Salary(int Eid,String Name,String Gender,int Basic,int HRA,int DA,int PF,int insurance){
		super(Eid,Name, Gender);
		this.Basic=Basic;
		this.HRA=HRA;
		this.DA=DA;
		this.PF=PF;
		this.insurance=insurance;
		this.tax=Basic/10;
	}
	void SalaryReport() {
		double totalsal=Basic+HRA+DA-PF-insurance-tax;
		try {
		if(totalsal<0) {
			throw new IllegalArgumentException("Salary can not be negative \n");
		}
		else
		System.out.println("Actual Salary(PA) = "+totalsal+"\n");
		}
		catch (IllegalArgumentException ex) {System.out.println(ex.getMessage());}
	}
	public int getBasic() {
		return Basic;
	}
	public void setBasic(int basic) {
		Basic = basic;
	}
	public int getHRA() {
		return HRA;
	}
	public void setHRA(int hRA) {
		HRA = hRA;
	}
	public int getDA() {
		return DA;
	}
	public void setDA(int dA) {
		DA = dA;
	}
	public int getPF() {
		return PF;
	}
	public void setPF(int pF) {
		PF = pF;
	}
	public int getInsurance() {
		return insurance;
	}
	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return super.toString()+"\nDepartment [Dno= "+Dcode+", Dname= "+Dname+" ]"+"\nSalary [Basic=" + Basic + ", HRA=" + HRA + ", DA=" + DA + ", PF=" + PF + ",Insurance=" + insurance
				+ ",Tax=" + tax + "]";
	}
	
}
 