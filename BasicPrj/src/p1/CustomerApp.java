package p1;

public class CustomerApp {

	public static void main(String[] args) {
		Customer ob1=new Customer(301,"Ashna", 26500, "Ashna301@gmail.com");
		ob1.output();

		
		
		Customer arr[];
		arr=new Customer[3];
		arr[0]=new Customer(302,"Ashish",2500,"Ashish302@gmail.com");
		arr[1]=new Customer();
		arr[1].input(303, "Aman", 21000,"Aman303@gmail.com");
		arr[2]=new Customer(304,"Ahana",2600,"Ahan304@gmail.com");
		for(Customer c:arr) {
			c.output();
	}
		ob1.displaycount();
		System.out.println(ob1);
		

}
}
