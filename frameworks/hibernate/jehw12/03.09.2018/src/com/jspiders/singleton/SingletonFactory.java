package com.jspiders.singleton;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingletonFactory {

	private static SessionFactory factory;
	
	static{
		Configuration cfg = new Configuration();
		cfg.configure();
		
		factory = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getFactory(){
		System.out.println("Obtaining Singleton SessionFactory");
		return factory;
	}
}
