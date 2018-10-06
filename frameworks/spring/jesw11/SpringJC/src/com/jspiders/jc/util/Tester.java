package com.jspiders.jc.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.jc.bean.BookMyShow;
import com.jspiders.jc.bean.Event;
import com.jspiders.jc.bean.Hospital;

public class Tester {

	public static void main(String[] args) {
		System.out.println("main method started");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		BookMyShow bms = ctx.getBean(BookMyShow.class);
		
		System.out.println(bms);
		System.out.println(bms.movie);
		
		Event e1 = bms.getEvent();
		System.out.println(e1);
		
		System.out.println("main method ended");
	}
}
