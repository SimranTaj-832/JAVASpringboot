package Product;

import java.util.Comparator;

public class SortbyCost implements Comparator<Prod>{
	public int compare(Prod a,Prod b) {
		return (int) (a.cost-b.cost);
	}

}
