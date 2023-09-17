package w2d3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpApp {

	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<Emp>();
		
		empList.add(new Emp(101,"Afnan",'M',200000.00,"Bangalore"));
		empList.add(new Emp(102,"Arfa",'F',350000.00,"Mangalore"));
		empList.add(new Emp(103,"Hanna",'F',200000.00,"Delhi"));
		empList.add(new Emp(104,"Khiz",'M',300000.00,"Bangalore"));
		empList.add(new Emp(105,"Waq",'M',200000.00,"Hyderabad"));
		empList.add(new Emp(106,"tas",'F',200000.00,"Bangalore"));
		
		double totalsal=empList.stream().collect(Collectors.summingDouble(emp->emp.esal));
        System.out.println("Total salary: "+totalsal);
        
        long count =empList.stream().filter(emp->emp.egen=='F').count();
        System.out.println("\nNumber of female employees: "+count);
        System.out.println("Female Employee details: ");
        empList.stream().filter(emp->emp.egen=='F').forEach(emp->System.out.println(" "+emp.empid+" "+emp.ename+" "+emp.esal+" "+emp.ecity));
        double Fsal=empList.stream().filter(emp->emp.egen=='F').collect(Collectors.summingDouble(emp->emp.esal));
        System.out.println("Total salary of female emp: "+Fsal);
        
        long count1 =empList.stream().filter(emp->emp.egen=='M').count();
        System.out.println("\nNumber of Male employees: "+count1);
        System.out.println("Male Employee details: ");
        empList.stream().filter(emp->emp.egen=='M').forEach(emp->System.out.println(emp.toString()));
        double Msal=empList.stream().filter(emp->emp.egen=='M').collect(Collectors.summingDouble(emp->emp.esal));
        System.out.println("Total salary of Male emp: "+Msal);
        
        long count2 =empList.stream().filter(emp->emp.ecity=="Bangalore").count();
        System.out.println("\nNumber of Employees from Bangalore: "+count2);


	}

}
