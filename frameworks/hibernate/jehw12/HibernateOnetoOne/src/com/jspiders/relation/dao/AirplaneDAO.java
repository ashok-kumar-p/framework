package com.jspiders.relation.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspiders.relation.dto.AirplaneDTO;

public class AirplaneDAO {

	public AirplaneDAO() {
		System.out.println(this.getClass().getSimpleName() + " created");
	}

	public void createFlight(AirplaneDTO adto) {
		System.out.println("createFlight method started");
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = null;
		Transaction tx = null;
		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			session.save(adto);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			System.out.println("Exception occurede while saving records");
			e.printStackTrace();
		} finally {
			session.close();
		}

		System.out.println("createFlight method ended");
	}
}
