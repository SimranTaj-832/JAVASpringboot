package com.pkg.p1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pkg.model.Person;

@Configuration
public class PersonConfig1 {
	@Bean(name="pobj1")
	@Scope("singleton")
	public Person setPerson() {
		Person pobj=new Person();
		return pobj;
	}
}
