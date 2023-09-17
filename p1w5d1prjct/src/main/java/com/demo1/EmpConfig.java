package com.demo1;
import java.util.Scanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
	@Bean(name="obj1")
	public Employee constEmp() {
	Employee employee=new Employee(1001, "Abc", 25000.00);
	return employee;
	}

	@Bean(name="obj2")
	public Employee setEmp() {
	Employee employee=new Employee();
	employee.setEid(1002);
	employee.setEname("Lmn");
	employee.setSalary(60000.00);
	return employee;
	}

	@Bean(name="obj3")
	public Employee inputEmp() {
	Employee employee=new Employee();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter id");
	employee.setEid(scanner.nextInt());
	System.out.println("Enter name");
	employee.setEname(scanner.next());
	System.out.println("Enter salary");
	employee.setSalary(scanner.nextDouble());
	scanner.close();
	return employee;
	}

}
