package p1;

public class Empinr1 {
	int eid;
	String ename;
	static class OfficeAddress
	{
		static int buildingno;
		static String area;
		static String city;
		OfficeAddress()
		{ }
		
	}
	Empinr1(){}
	Empinr1(int eid,String ename,OfficeAddress obj)
	{}
	void method() {
		Empinr1.OfficeAddress.buildingno=1001;
		Empinr1.OfficeAddress.area="ETV";
		Empinr1.OfficeAddress.city="Bangalore";
	}
	void output() {
		System.out.println(Empinr1.OfficeAddress.buildingno);
		System.out.println(Empinr1.OfficeAddress.area);
		System.out.println(Empinr1.OfficeAddress.city);

	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String toString() {
		return "Employee details : "+eid+" "+ename;
	}

}
