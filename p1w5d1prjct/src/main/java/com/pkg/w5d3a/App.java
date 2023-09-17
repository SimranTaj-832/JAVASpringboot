package com.pkg.w5d3a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.pkg.w5d3.Emp;
import com.pkg.w5d3.EmpCfg;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(EmpCfg.class);
		Emp e2=(Emp)ctx.getBean("empobj2");
		System.out.println(e2);
		((AbstractApplicationContext)ctx).close();
	}

}
