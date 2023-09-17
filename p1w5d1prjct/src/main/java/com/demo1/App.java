package com.demo1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(EmpConfig.class);
		Employee emp1=(Employee)context.getBean("obj1");
		System.out.println(emp1);
		Employee emp2=(Employee)context.getBean("obj2");
		System.out.println(emp2);
		Employee emp3=(Employee)context.getBean("obj3");
		System.out.println(emp3);
		((AbstractApplicationContext)context).close();
	}

}
