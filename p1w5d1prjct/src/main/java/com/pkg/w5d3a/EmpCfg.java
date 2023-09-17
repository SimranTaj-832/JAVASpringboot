package com.pkg.w5d3a;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpCfg {

		@Bean
		public Address getAddr() {
			Address aobj1=new Address();
			aobj1.setHno(101);
			aobj1.setLocality("Andheri");
			aobj1.setCity("Mumbai");
			return aobj1;
		}
		
		@Bean(name="empobj2")
		public Emp setEmp() {
		Emp empobj2=new Emp();
		empobj2.setId(2002);
		empobj2.setEname("Vicky");
		return empobj2;
		}
}
