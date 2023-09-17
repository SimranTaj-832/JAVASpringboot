package Generics;

public class Stats<T extends Number & Comparable<T>> {
	T[] nums;
	Stats(T[] o){
		nums =o;
	}
	double average() {
		double sum=0.0;
		for(int i=0;i<nums.length;i++)
			sum+=nums[i].doubleValue();
		return sum/nums.length;
	}
	void sort() {
		T temp;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if((nums[i].compareTo(nums[j])<0)) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
	for(T t:nums) {
		System.out.println(t+" ");
	} }

	public static void main(String[] args) {
		Integer inums[]= {55,45,75,35,90,25,30};
		Stats<Integer> iob=new Stats<Integer>(inums);
		double v=iob.average();
		iob.sort();
		System.out.println("iob average is "+v);
		Double dnums[]= {8.75,7.25,10.5,12.25,5.3,6.7};
		Stats<Double>dob=new Stats<Double>(dnums);
		double w=dob.average();
		dob.sort();
		Character carr[]= {'A','L','P','W','G','M','Q'};
		}
	}


