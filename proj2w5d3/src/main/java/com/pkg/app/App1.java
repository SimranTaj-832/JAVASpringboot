package com.pkg.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.pkg.model.Person;
import com.pkg.p1.PersonConfig1;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext apctx=new AnnotationConfigApplicationContext(PersonConfig1.class);
		Person pobjA=(Person)apctx.getBean("pobj1");
		System.out.println(pobjA);
		pobjA.setId(101);
		pobjA.setName("Aman");
		pobjA.setSalary(25000.00);
		System.out.println();
		Person pobjB=(Person)apctx.getBean("pobj1");
		System.out.println(pobjB);
		pobjB.setId(202);
		pobjB.setName("Nimra");
		pobjB.setSalary(30000.00);
		System.out.println("Both are ref to same object?"+" "+(pobjA==pobjB));
		System.out.println(pobjA.getId()+" "+pobjB.getId());
		System.out.println(pobjA.getName()+" "+pobjB.getName());
		((AbstractApplicationContext)apctx).close();
	}

}
