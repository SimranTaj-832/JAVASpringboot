package p1;

public class Emp {
	   int eid;
	   String ename;
	   double esal;
	   static int ecount;
	   void input(int x, String s,  double d)
	   {
	       eid=x; ename=s; esal=d;
	   }
	   void output()
	   {
	       System.out.println(eid+" "+ename+" "+esal+" ");
	   }
	   Emp(){
		   ecount++;
	   }
	   Emp(int eid, String ename ,double esal){
		   this.eid=eid;
		   this.ename=ename;
		   this.esal=esal;
		   ecount++;
	   }
	   public static void displaycount() {
		   System.out.println("Total Employees: "+ecount);
	   }
	   static {
		   System.out.println("Ohayooo!");
	   }
	   public String toString() {
		   return "Emp values are: "+" "+eid+" "+ename+" "+esal;
	   }
	   public boolean equals(Emp ipobj) {
		   if((this.eid==ipobj.eid)&&(this.ename==ipobj.ename)&&(this.esal==ipobj.esal)) {
			   return true;
		   }
		   else 
			   return false;
	   }
}

