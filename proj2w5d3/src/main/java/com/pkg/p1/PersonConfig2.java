package com.pkg.p1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pkg.model.Person;

@Configuration
public class PersonConfig2 {
	@Bean(name="pobj1")
	@Scope("prototype")
	public Person setPerson() {
		Person pobj=new Person();
		return pobj;
	}
}
