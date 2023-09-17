package com.p1;

import java.util.LinkedList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
	@Bean(name="elist1")
	  public EmpList getEmpList() {
		  LinkedList<Emp> emplist=new LinkedList<Emp>();
		  emplist.add(new Emp(101,"Bulbul",25000.00));
		  emplist.add(new Emp(102,"Riaz",35000.00));
		  emplist.add(new Emp(103,"John",65000.00));
		  emplist.add(new Emp(104,"Manisha",15000.00));
		  emplist.add(new Emp(105,"Laxmi",35000.00));
		  EmpList elist1=new EmpList(emplist);
		  return elist1;	  
	  }
	  @Bean(name="elist2")
	  public EmpList setEmpList() {
		  EmpList elist2=new EmpList();
		  LinkedList<Emp> emplist=new LinkedList<Emp>();
		  emplist.add(new Emp(201,"Bulbul",25000.00));
		  emplist.add(new Emp(202,"Riaz",35000.00));
		  emplist.add(new Emp(203,"John",65000.00));
		  emplist.add(new Emp(204,"Manisha",15000.00));
		  emplist.add(new Emp(205,"Laxmi",35000.00));
		  elist2.setEmplist(emplist);
		  return elist2;	  
	  }
}
