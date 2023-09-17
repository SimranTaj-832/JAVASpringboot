package com.pkg.d2a;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		String confFile="applicationCon.xml";
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext(confFile);
		MyMathTest mathTest = (MyMathTest)context.getBean("myMathBean");
		System.out.println(mathTest.toString());
	}

}
