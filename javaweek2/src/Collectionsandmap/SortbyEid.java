package Collectionsandmap;

import java.util.Comparator;

public class SortbyEid implements Comparator<Employee1>{
	public int compare(Employee1 a,Employee1 b) {
		return a.eid-b.eid;
	}
}
