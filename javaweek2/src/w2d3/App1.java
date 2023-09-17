package w2d3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App1 {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        List<Float>productPriceList=new ArrayList<Float>();
        for(Product product:productsList) {
        	if(product.price>30000) {
        		productPriceList.add(product.price);
        	}
        }System.out.println(productPriceList);
        
        List<Float>productPriceList2=productsList.stream().filter(p->p.price >=30000).map(p->p.price).collect(Collectors.toList());
        System.out.println(productPriceList2);
        
        productsList.stream().filter(product->product.price==30000).forEach(product->System.out.println(product.name));
        
        Float totalPrice=productsList.stream().map(product->product.price).reduce(0.0f,(sum,price)->sum+price);
        System.out.println(totalPrice);
        
        double totalPrice3=productsList.stream().collect(Collectors.summingDouble(product->product.price));
        System.out.println(totalPrice3);
        
        long count =productsList.stream().filter(product->product.price<30000).count();
        System.out.println(count);
	}

}
