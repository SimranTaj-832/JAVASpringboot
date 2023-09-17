package com.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
	@Bean(name="eobj")
	public Emp2 constEmp() {
		Emp2 eobj1=new Emp2(101,"Akash","December",25000.00);
		return eobj1;
	}
	
	@Bean(name="eobj2")
	public Emp2 setEmp() {
		Emp2 eobj2=new Emp2();
		eobj2.setEid(202);
		eobj2.setEname("Bablu");
		eobj2.setMonth("November");
		eobj2.setAmount(35000.00);
		return eobj2;
	}
}
