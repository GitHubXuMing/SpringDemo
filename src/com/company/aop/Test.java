package com.company.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		IPersonService personService = (IPersonService) ctx.getBean("personProxy");
		personService.save();
		System.out.println(personService.findAll());
	}
}
