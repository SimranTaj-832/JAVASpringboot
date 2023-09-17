package com.pkg.w5d3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(EmpCfg.class);
		Emp e2=(Emp)ctx.getBean("empobj2");
		System.out.println(e2);
		((AbstractApplicationContext)ctx).close();
	}

}
