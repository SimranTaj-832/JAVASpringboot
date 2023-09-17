package com.pkg.d2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myCompanyBean")
public class MyCompany {
	private List<Employee>empList;
	private Map<String,Integer>empIdMap;
	
	@Value("#{myCompanyBean.empList[0]}")
	private Employee firstEmployee;
	
	@Value("#{myCompanyBean.empIdMap['Md Nazir']}")
	private int startEmpId;
	
	public MyCompany() {
		empList=new ArrayList<Employee>();
		empList.add(new Employee(1016,"Nataraj Gootooru"));
		empList.add(new Employee(1015,"Nagesh Yenamala"));
		empList.add(new Employee(1017,"Nikesh Penumalli"));
		
		empIdMap=new HashMap<String,Integer>();
		empIdMap.put("Md Nazir", 2000);
		empIdMap.put("Nagesh Yenamala",1015);
		empIdMap.put("Nikesh Penumalli", 1017);
	}
	
	public void printEmpInfo() {
		System.out.println(this.firstEmployee.toString());
		System.out.println("Star employee id: "+this.startEmpId);
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public Map<String, Integer> getEmpIdMap() {
		return empIdMap;
	}

	public void setEmpIdMap(Map<String, Integer> empIdMap) {
		this.empIdMap = empIdMap;
	}

	public Employee getFirstEmployee() {
		return firstEmployee;
	}

	public void setFirstEmployee(Employee firstEmployee) {
		this.firstEmployee = firstEmployee;
	}

	public int getStartEmpId() {
		return startEmpId;
	}

	public void setStartEmpId(int startEmpId) {
		this.startEmpId = startEmpId;
	}
	


}
