package Methods;

public class MethOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethOverloading cal = new MethOverloading();
	      cal.sum(20,30,60);
	      cal.sum(20,20);
	}
	void sum(int a,int b){System.out.println(a+b);}
	   void sum(int a,int b,int c){System.out.println(a+b+c);}

}
