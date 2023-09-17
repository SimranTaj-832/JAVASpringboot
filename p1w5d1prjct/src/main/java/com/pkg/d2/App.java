package com.pkg.d2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		String confFile="conFfilexml.xml";
		ConfigurableApplicationContext context =new ClassPathXmlApplicationContext(confFile);
		MyCompany mycom=(MyCompany)context.getBean("myCompanyBean");
		mycom.printEmpInfo();
	}

}
