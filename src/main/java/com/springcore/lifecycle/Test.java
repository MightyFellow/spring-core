package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//		Samsung s1 = (Samsung) context.getBean("s1");
//		System.out.println(s1);
//		//registering shutdown hook to call destroy method
		context.registerShutdownHook();
//		
//		System.out.println("---------------------------------------");
//		Pepsi p1 = (Pepsi) context.getBean("p1");
//		
//		System.out.println(p1);
		Movie m1 = (Movie)context.getBean("m1");
		System.out.println(m1);
	}
}
