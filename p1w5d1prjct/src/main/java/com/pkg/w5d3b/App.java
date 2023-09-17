package com.pkg.w5d3b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class App {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(CustCfg.class);
		Customer c2=(Customer)ctx.getBean("cobj");
		System.out.println(c2.getId()+" "+c2.getCname());
		System.out.println(c2.getAcc_details());
		System.out.println(c2.getC_details());
		((AbstractApplicationContext)ctx).close();

	}

}
