package com.jspiders.scopes.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.scopes.bean.OS;

public class OsTester {

	public static void main(String[] args) {
		System.out.println("main method started");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		OS windows1 = ctx.getBean(OS.class);
		System.out.println(windows1);

		OS windows2 = ctx.getBean(OS.class);
		System.out.println(windows2);
		
		OS windows3 = ctx.getBean(OS.class);
		System.out.println(windows3);
		OS windows4 = ctx.getBean(OS.class);
		System.out.println(windows4);
		OS windows = ctx.getBean(OS.class);
		System.out.println(windows);
		
		System.out.println("main method ended");
	}
}
