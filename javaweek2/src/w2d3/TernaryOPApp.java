package w2d3;

import java.util.ArrayList;
import java.util.List;

public class TernaryOPApp {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        
        Product pA=productsList.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
        System.out.println(pA.price);
        
        Product pB=productsList.stream().min((p1,p2)->p1.price>p2.price?1:-1).get();
        System.out.println(pB.price);
        
	}

}
