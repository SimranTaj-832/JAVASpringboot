package StudentData;

public class Student {
	int Sid;
	String name;
	int Marks;
	int percentage;
	Student(){}
	Student(int Sid,String name,int Marks){
		this.Sid=Sid;
		this.name=name;
		this.Marks=Marks;
		this.percentage=Marks/6;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", name=" + name + ", Marks=" + Marks + ", percentage=" + percentage + "% ]";
	}
	
}
