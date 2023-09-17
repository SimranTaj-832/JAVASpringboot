package w2d3;

public class Emp {
	int empid;
	String ename;
	char egen;
	double esal;
	String ecity;
	Emp(int empid,String ename,char egen,double esal,String ecity){
		this.empid=empid;
		this.ename=ename;
		this.egen=egen;
		this.esal=esal;
		this.ecity=ecity;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public char getEgen() {
		return egen;
	}
	public void setEgen(char egen) {
		this.egen = egen;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	@Override
	public String toString() {
		return " Emp [empid=" + empid + ", ename=" + ename + ", egen=" + egen + ", esal=" + esal + ", ecity=" + ecity
				+ "]";
	}
	
}
