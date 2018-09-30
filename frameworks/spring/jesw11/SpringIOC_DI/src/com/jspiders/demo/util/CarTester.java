package com.jspiders.demo.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.demo.bean.Car;

public class CarTester {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext("spring.xml");
		Car car = ctx.getBean(Car.class);
		/*car.start();
		car.driving();
		car.applyBrake();
		car.stop();*/
		
		System.out.println(car);
		
		System.out.println(car.ms);
		
		System.out.println(car.getAcc());
		
		
		System.out.println("main method ended");
	}
}
