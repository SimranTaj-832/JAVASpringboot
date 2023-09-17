package com.emp;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import com.Emp.Employee;

public class EmpEqual {
	Object[] expectedEmp= new Object[3];
	@Before 
	public void initInputs() {
		expectedEmp[0]= new Employee(1, "Nats", 15000);
		expectedEmp[1]= new Employee(2, "Kalid", 25000);
		expectedEmp[2]= new Employee(3, "Krish", 5000);
	}
	@Test
	public void compareEmployee(){
		Object[]testOutput= Employee.getEmpList().toArray();
		assertArrayEquals(expectedEmp,testOutput);
	}
	}
