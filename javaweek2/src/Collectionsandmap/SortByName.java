package Collectionsandmap;

import java.util.Comparator;

public class SortByName implements Comparator<Employee1> {
	public int compare(Employee1 a, Employee1 b) {
		return a.name.compareTo(b.name);
	}
}
