package com.jspiders.crud.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.crud.dto.EmployeeDTO;
import com.jspiders.singleton.SingletonFactory;

public class EmployeeDAO {

	SessionFactory factory = SingletonFactory.getFactory();

	public EmployeeDAO() {
		System.out.println("EmployeeDAO object created");
	}

	public void createEmp(EmployeeDTO edto) {
		System.out.println("Create method started");

		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(edto);
			tx.commit();
		} catch (HibernateException e) {
			System.out.println("Rolling back the saved data");
			tx.rollback();
		} finally {
			session.close();
			// factory.close();
		}

		System.out.println("Create method ended");

	}

	public void getEmp(int id) {
		System.out.println("getEmployee method started");
		EmployeeDTO dtoFromDB = null;
		Session session = factory.openSession();
		try {
			dtoFromDB = session.get(EmployeeDTO.class, id);
			if (dtoFromDB != null) {
				System.out.println("EmployeeDetails\n" + dtoFromDB);
			} else {
				System.out.println("No record found with id(pk):" + id);
			}
		} catch (HibernateException e) {
			System.out.println("Exception Occured while fetching the Employee data");
		} finally {
			session.close();
		}

		System.out.println("getEmployee method ended");

	}

	public void update(String name, int id) {
		System.out.println("update method started");
		EmployeeDTO dtoFromDB = null;
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			dtoFromDB = session.get(EmployeeDTO.class, id);
			if (dtoFromDB != null) {
				System.out.println("EmployeeDetails from Db\n" + dtoFromDB);
				dtoFromDB.setEmpName(name);
				
				session.update(dtoFromDB);
				tx.commit();
			} else {
				System.out.println("No record found with id(pk):" + id);
			}
		} catch (HibernateException e) {
			System.out.println("Exception Occured");
			tx.rollback();
		} finally {
			session.close();
		}

		System.out.println("update method ended");
	}
	
	public void delete(int id) {
		System.out.println("update method started");
		EmployeeDTO dtoFromDB = null;
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			dtoFromDB = session.get(EmployeeDTO.class, id);
			if (dtoFromDB != null) {
				System.out.println("EmployeeDetails from Db\n" + dtoFromDB);
				
				session.delete(dtoFromDB);
				tx.commit();
			} else {
				System.out.println("No record found with id(pk):" + id);
			}
		} catch (HibernateException e) {
			System.out.println("Exception Occured");
			tx.rollback();
		} finally {
			session.close();
		}

		System.out.println("update method ended");
	}
}
