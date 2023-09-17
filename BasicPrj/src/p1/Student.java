package p1;

public class Student {
	   int sid;
	   String sname;
	   float percentage;
	   static college cobj;
	   //static int scount;
	   /*void input(int x, String s,  float p)
	   {
	       sid=x; sname=s; percentage=p;
	   }
	   void output()
	   {
	       System.out.println(sid+" "+sname+" "+percentage +"%");
	   }
	   Student(){
		   scount++;
	   }
	   Student(int sid, String sname ,float percentage){
		   this.sid=sid;
		   this.sname=sname;
		   this.percentage=percentage;
		   scount++;
	   }*/
	   
	Student(){
		cobj=new college();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	public static college getCobj() {
		return cobj;
	}
	public static void setCobj(college cobj) {
		Student.cobj = cobj;
		System.out.println(cobj);
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", percentage=" + percentage +", college= "+cobj.Cname+" " +cobj.City +"]";
	}
	
	
	   
	   

}
