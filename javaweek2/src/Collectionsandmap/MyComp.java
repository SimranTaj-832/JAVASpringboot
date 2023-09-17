package Collectionsandmap;

import java.util.Comparator;

public class MyComp implements Comparator<Object> {
	public int compare(Object a, Object b) {
		String aStr,bStr;
		aStr= (String)a;
		bStr=(String)b;
		return aStr.compareTo(bStr);
	}
}
