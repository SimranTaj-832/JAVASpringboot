package com.p1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
  public static void main(String[] args) {
	  ApplicationContext apctx=new AnnotationConfigApplicationContext(EmpConfig.class);
	  EmpList el1=(EmpList)apctx.getBean("elist1");
	  el1.displayList();
	  EmpList el2=(EmpList)apctx.getBean("elist2");
	  el2.displayList();
	  ((AbstractApplicationContext)apctx).close();
  }
}
