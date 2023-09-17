package Stringdemo;

public class SortStr {
	static String arr[]= {"Simra","Khiz","Aish","Aman","Ahan","Sam"};

	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j].compareTo(arr[i])<0) {
					String t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
			System.out.println(arr[i]);
		}
		
		String s1="ChemMnchery";
		String s2="Chemmanur";
		System.out.println(s1.compareTo(s2));
		System.out.println();
	}

}
