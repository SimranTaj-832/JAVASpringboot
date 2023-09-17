package Product;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class ProductSortMain {

	public static void main(String[] args) {
		LinkedList<Prod> pll=new LinkedList<Prod>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of products");
		int n=sc.nextInt();
		double TotalCost=0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter Product Id, Product Name, Product Color, Cost");
			int id=sc.nextInt();
			String nm=sc.next();
			String cl=sc.next();
			double co=sc.nextDouble();
			TotalCost+=co;
			pll.add(new Prod(id,nm,cl,co));
		}
		for(Prod p:pll) {
			System.out.println(p);
		}
		System.out.println("\nTotal Cost: "+TotalCost);
        Collections.sort(pll, new SortbyName());
		
		System.out.println("\nSorted by Name");
		for(int i=0;i<pll.size();i++) {
			System.out.println(pll.get(i));
		}
		
		Collections.sort(pll,new SortbyCost());
		
		System.out.println("\nSorted by Cost");
		for(int i=0;i<pll.size();i++) {
			System.out.println(pll.get(i));
		}
		
		
	}

}
