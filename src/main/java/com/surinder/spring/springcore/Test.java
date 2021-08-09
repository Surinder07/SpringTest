package com.surinder.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println(" Test Line  ");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee ID  : "+emp.getId());
		System.out.println("Employee Name  : "+emp.getName());
		
		
	}
	
}
