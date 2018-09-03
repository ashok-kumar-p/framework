package com.jspiders.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspiders.demo.dto.StudentDTO;

public class StudentDAO {

	public StudentDAO() {
		System.out.println("StudentDAO object created");
	}
	
	public void create(StudentDTO dto){
		System.out.println("Inside create method");
		
		//component1
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(StudentDTO.class);
		
		//component2
		SessionFactory factory = cfg.buildSessionFactory();
		
		//component3
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(dto);
		tx.commit();
		
		session.close();
		factory.close();
	}
}
