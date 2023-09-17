package p1;

public class BookApp {

	public static void main(String[] args) {
		Book ob=new Book();
		ob.setBid(2001);
		ob.setBname("Java");
		ob.setAuthor("Auth1");
		ob.setPrice(2500);
		ob.pobj.inputpbr("Oxford","08/02/2015");
		System.out.println(ob);
	}

}
