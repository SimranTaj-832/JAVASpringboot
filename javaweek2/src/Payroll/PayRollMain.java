package Payroll;

import java.util.LinkedList;
import java.util.ListIterator;

import Collectionsandmap.Employee;

public class PayRollMain {

	public static void main(String[] args) {
		Salary s1=new Salary(101,"Simra","Female",300000,150000,50000,36000,24000);
		Salary s2=new Salary(102,"Khiz","Male",400000,150000,50000,48000,640000);
		Salary s4=new Salary(103,"Waq","Male",300000,150000,50000,36000,24000);
		Salary s3=new Salary(104,"Tas","Female",400000,150000,50000,48000,24000);
		
		System.out.println(s1);
		s1.SalaryReport();
		
		System.out.println(s2);
		s2.SalaryReport();
		
		System.out.println(s4);
		s4.SalaryReport();
		
		System.out.println(s3);
		s3.SalaryReport();
		
		//Using LinkedList
		System.out.println("\nList");
		LinkedList<Salary>slist1=new LinkedList<Salary>();
		slist1.add(new Salary(105,"Saq","Male",200000,10000,50000,48000,240000));
		slist1.add(new Salary(106,"Saf","Female",300000,100000,50000,48000,240000));
		slist1.add(new Salary(107,"Sara","Female",300000,100000,50000,48000,240000));
		slist1.add(new Salary(108,"Sab","Female",400000,100000,50000,48000,24000));
		ListIterator<Salary> li1=slist1.listIterator();
		Salary sal;
		while(li1.hasNext()) {
			sal=(Salary)li1.next();
			System.out.print(sal+"\n");
			sal.SalaryReport();
		}



		
	}

}
