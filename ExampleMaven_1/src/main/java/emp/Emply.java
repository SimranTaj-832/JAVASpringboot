package emp;

public class Emply {
	  int id;
	  String ename;
	  String doj;
	  double esal;
	  String city;
	  Emply(int id,String ename, String doj, double esal,String city){
		  this.id=id;
		  this.ename=ename;
		  this.doj=doj;
		  this.esal=esal;
		  this.city=city;
		  
	  }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	  
}
