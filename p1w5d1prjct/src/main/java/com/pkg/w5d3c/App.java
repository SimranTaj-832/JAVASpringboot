package com.pkg.w5d3c;


import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeJdbc ejt=(EmployeeJdbc)context.getBean("empJdtempl");
		
		//display current state of emp table
		List<Employee> emp=ejt.getAllEmployees();
		System.out.println("Current State of Employee table- ");
		System.out.println(emp);
		
		//insert new emp
		ejt.insertEmployee(205,"Akash",28,4500);
		
		//display inserted employee
		Employee insertedEmployee = ejt.getEmployeeById(202);
		System.out.println("Inserted employee information: ");
		System.out.println(insertedEmployee);
		
		//Display current state of employee after insert
		emp=ejt.getAllEmployees();
		System.out.println("current state of employee after insert");
		System.out.println(emp);
		
		//update employee
		Employee updatedEmployee=ejt.updateEmployee("Manu",203);
		System.out.println("Updated Employee details: ");
		System.out.println(updatedEmployee);
		
		//delete employee
		ejt.deleteEmployee(205);
		
		emp=ejt.getAllEmployees();
		System.out.println("Current state of employee table: ");
		System.out.println(emp);
		((AbstractApplicationContext)context).close();
	}

}
