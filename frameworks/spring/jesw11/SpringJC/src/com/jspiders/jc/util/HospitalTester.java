package com.jspiders.jc.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.jc.bean.Hospital;

public class HospitalTester {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Hospital hospital = ctx.getBean(Hospital.class);
		System.out.println(hospital);
		hospital.registerPatients();
		hospital.treatPatients();
		
		System.out.println("main method ended");
	}
}
