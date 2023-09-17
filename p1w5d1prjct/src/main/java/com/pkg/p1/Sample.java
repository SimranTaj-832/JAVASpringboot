package com.pkg.p1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Sample {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		
		Employee e=(Employee)factory.getBean("obj");
		e.display();
		Employee e1=(Employee)factory.getBean("obj1");
		e1.display();
	}

}
