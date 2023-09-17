package p1;

public class Emp1 {
	int eid;
	String ename;
	class Address{	
		int hno;
		String city;
		Address()
		{}
		void inputAddr(int hno,String city) {
			this.hno=hno;
			this.city=city;
		}
		void outputAddr() {
			System.out.println("Address is: "+hno +" " +city);
		}
	}
	Address aobj;
	Emp1(){
		this.aobj=new Address();
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


	public Address getAobj() {
		return aobj;
	}


	public void setAobj(Address aobj) {
		this.aobj = aobj;
	}


	@Override
	public String toString() {
		return "Employee details : Eid= "+" "+eid+" "+"Name= "+ename+" "+"Address=" +aobj.hno+", "+aobj.city;
	}

}
