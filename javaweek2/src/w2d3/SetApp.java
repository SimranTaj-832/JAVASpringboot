package w2d3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SetApp {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        
        Set<Float>productPriceList=productsList.stream().filter(product->product.price<30000).map(product->product.price).collect(Collectors.toSet());
        System.out.println(productPriceList);
        
        Map<Integer,String>productPriceMap=productsList.stream().collect(Collectors.toMap(p->p.id, p->p.name));
        System.out.println(productPriceList);
	}

}
