package p1;

public class college {
	String Cname;
	String City;
	college(){}
	void input(String Cname, String City) {
		this.Cname=Cname;
		this.City=City;
	}
	void output() {
		System.out.println("College : "+Cname+" "+City);
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "college [Cname=" + Cname + ", City=" + City + "]";
	}
	

}
