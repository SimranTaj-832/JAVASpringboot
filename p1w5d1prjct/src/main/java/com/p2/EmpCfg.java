package com.p2;
import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpCfg {
	
  @Bean(name="emap1")
  public EmpMap getEmpMap() {
	  HashMap<Integer,Emp>emap=new HashMap<Integer,Emp>();
	  emap.put(1001, new Emp(101,"Bulbul",25000.00));
	  emap.put(1002, new Emp(102,"Riaz",35000.00));
	  emap.put(1003, new Emp(103,"John",65000.00));
	  emap.put(1004, new Emp(104,"Manisha",15000.00));
	  emap.put(1005, new Emp(105,"Laxmi",35000.00));  
	  EmpMap emap1=new EmpMap(emap);
	  return emap1;
  }
  
  @Bean(name="emap2")
  public EmpMap retEmpList() {
	  EmpMap emap2=new EmpMap();
	  HashMap<Integer,Emp>emap=new HashMap<Integer,Emp>();
	  emap.put(2001, new Emp(201,"Chandra",55000.00));
	  emap.put(2002, new Emp(202,"Dany",25000.00));
	  emap.put(2003, new Emp(203,"Abraham",35000.00));
	  emap.put(2004, new Emp(204,"Koirala",25000.00));
	  emap.put(2005, new Emp(205,"Padma",25000.00));
	  emap2.setEmpMap(emap);
	  return emap2;
  }
}
