package p1;

public class Address {
	int hno;
	String Area;
	String city;
	Address()
	{ }
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String toString() {
		return "Address: "+hno+" "+" "+Area+" "+city;
	}

}