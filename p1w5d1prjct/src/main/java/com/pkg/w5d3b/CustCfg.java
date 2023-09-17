package com.pkg.w5d3b;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pkg.w5d3a.Address;

@Configuration
public class CustCfg {
	
		@Bean(name="cobj")
		public Customer setCust() {
		Customer cobj=new Customer();
		cobj.setId(2001);
		cobj.setCname("Ahan");
		return cobj;
	}
	@Bean
	public Account getAcc() {
		Account aobj=new Account();
		aobj.setAcc_num("202100101");
		aobj.setIfsc("29437708");
		return aobj;
		
	}
	@Bean
	public Address getAddr() {
		Address aobj1=new Address();
		aobj1.setHno(101);
		aobj1.setLocality("Andheri");
		aobj1.setCity("Mumbai");
		return aobj1;
	}
	@Bean
	public Contact getCont() {
		Contact cobj1=new Contact();
		cobj1.setCity("Bangalore");
		cobj1.setEmail("ahan123@gmail.com");
		cobj1.setMob("9876543231");
		return cobj1;
	}
}
