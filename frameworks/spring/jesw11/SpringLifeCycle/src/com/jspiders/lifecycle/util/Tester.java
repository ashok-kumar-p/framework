package com.jspiders.lifecycle.util;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.lifecycle.bean.Employee;

public class Tester {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Employee emp = ctx.getBean(Employee.class);
		
		emp.projectDetails();
		emp.projectDetails();
		emp.projectDetails();
		emp.projectDetails();
		
		ctx.close();
		
		System.out.println("main method ended");
	}
}
