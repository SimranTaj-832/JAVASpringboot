package Collectionsandmap;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeLinkedList {

	public static void main(String[] args) {
		LinkedList<Employee>emplist1=new LinkedList<Employee>();
		emplist1.add(new Employee(101,"Aliya","Bangalore"));
		emplist1.add(new Employee(102,"Daniyal","Bangalore"));
		emplist1.add(new Employee(103,"Hafsa","Bangalore"));
		emplist1.add(new Employee(104,"Inaya","Bangalore"));
		emplist1.add(new Employee(105,"Khiz","Bangalore"));
		System.out.println("List -1"+"\n"+emplist1);
		
		LinkedList<Employee>emplist2=new LinkedList<Employee>();
		emplist2.add(new Employee(106,"Munu","Bangalore"));
		emplist2.add(new Employee(107,"Rahil","Bangalore"));
		emplist2.add(new Employee(108,"Rida","Bangalore"));
		emplist2.add(new Employee(109,"Simra","Bangalore"));
		emplist2.add(new Employee(110,"Tas","Bangalore"));
		System.out.println("List -2"+"\n"+emplist2);
		
		emplist1.addAll(emplist2);
		System.out.println("List -1"+"\n"+emplist1);
		
		System.out.println("\n"+"Iterator 1");
		ListIterator<Employee> li1=emplist1.listIterator();
		Employee emp;
		while(li1.hasNext()) {
			emp=(Employee)li1.next();
			System.out.println(" "+emp+" ");
		}
		
		emplist1.retainAll(emplist2);
		System.out.println();
		System.out.println("After retain all");
		System.out.println("List -1"+"\n"+emplist1);
		System.out.println("List -2"+"\n"+emplist2);
		
		System.out.println("\n"+"Iterator 2");
		ListIterator<Employee> li=emplist2.listIterator();
		Employee empl;
		while(li.hasNext()) {
			empl=(Employee)li.next();
			System.out.println(" "+empl+" ");
		}

	}

}
