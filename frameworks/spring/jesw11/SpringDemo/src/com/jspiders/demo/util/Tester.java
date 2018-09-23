package com.jspiders.demo.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.demo.bean.HotelOrders;

public class Tester {

	public static void main(String[] args) {
		System.out.println("main method started");

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		HotelOrders bh = ctx.getBean("ord1", HotelOrders.class);

		bh.takeOrder();
		bh.serveOrder();
		System.out.println(bh+"\n");

		HotelOrders bh2 = ctx.getBean("ord2", HotelOrders.class);

		bh2.takeOrder();
		bh2.serveOrder();
		System.out.println(bh2+"\n");
		
		System.out.println("main method ended");
	}
}
