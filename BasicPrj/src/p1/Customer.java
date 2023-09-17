package p1;

public class Customer {
	int cid;
	String name;
	float balance;
	String email;
	static int count;
	static int tbal=0;
	
	void input(int x, String s, float b, String e)
	   {
	       cid=x; name=s; balance=b; email=e; tbal +=b;
	   }
	   void output()
	   {
	       System.out.println(cid+" "+name+" "+balance+" "+email);
	   }
	   Customer(){
		   count++;
	   }
	   Customer(int cid, String name ,float balance, String email){
		   this.cid=cid;
		   this.name=name;
		   this.balance=balance;
		   this.email=email;
		   tbal += balance;
		   count++;
	   }
	   public static void displaycount() {
		   System.out.println("Number of Customers: "+count);
	   }
	   static {
		   System.out.println("Hello Customers!!");
	   }
	   public String toString() {
		   return "Total Balance: "+tbal;
	   }

}
