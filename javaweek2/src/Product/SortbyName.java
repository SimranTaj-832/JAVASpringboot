package Product;

import java.util.Comparator;

public class SortbyName implements Comparator<Prod>{
	public int compare(Prod a,Prod b) {
		return a.name.compareTo(b.name);
	}

}
