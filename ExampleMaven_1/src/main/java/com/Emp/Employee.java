package com.Emp;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	   private String name;
	    private int empId;
	    private int salary;
		public Employee(int empId, String name, int salary) {
			// TODO Auto-generated constructor stub
			this.empId=empId;
			this.name=name;
			this.salary=salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		public boolean equals(Object obj){
	        Employee emp = (Employee) obj;
	        boolean status = false;
	        if(this.name.equalsIgnoreCase(emp.name)
	                && this.empId == emp.empId
	                && this.salary == emp.salary){
	            status = true;
	        }
	        return status;
	    }

	    public static List<Employee> getEmpList()
	    {
	        List<Employee> emps = new ArrayList<Employee>();
	        emps.add(new Employee(1, "Nats", 15000));
	        emps.add(new Employee(2, "Kalid", 25000));
	        emps.add(new Employee(3, "Krish", 5000));
	        return emps;
	    }

	    public int hashCode()
	    {
	        return this.empId;   
	    }
		
		@Override
		public String toString() {
			return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
		}
	    
	    
	    
}
