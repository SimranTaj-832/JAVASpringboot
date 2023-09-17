package com.p2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apctx=new AnnotationConfigApplicationContext(EmpCfg.class);
		EmpMap el1=(EmpMap)apctx.getBean("emap1");
		el1.displayList();
		EmpMap el2=(EmpMap)apctx.getBean("emap2");
		el2.displayList();
		((AbstractApplicationContext) apctx).close();
	}
}
