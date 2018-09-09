package com.jspiders.hql.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hql.dto.MenuItemDTO;
import com.jspiders.singleton.SingletonFactory;

public class MenuItemDAO {

	SessionFactory factory = SingletonFactory.getFactory();
	
	public MenuItemDAO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}
	
	
	public void create(MenuItemDTO idto){
		System.out.println("create MenuItem method started");
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(idto);
		tx.commit();
		session.close();
		
		System.out.println("create MenuItem method ended");
	}
	
	public MenuItemDTO getItemById(int id){
		System.out.println("getItemById method started");
		String hql = "from MenuItemDTO where id = "+id;
		
		Session session = factory.openSession();
		Query query = session.createQuery(hql);
		MenuItemDTO itemFromDB = (MenuItemDTO) query.uniqueResult();

		
		System.out.println("getItemById method ended");
		return itemFromDB;
	}
	
	public List<MenuItemDTO> getAllItems(){
		System.out.println("getAllItems method started");
		String hql = "from MenuItemDTO";
		
		Session session = factory.openSession();
		Query query = session.createQuery(hql);
		List<MenuItemDTO> listFromDB = query.list();
		
		System.out.println("getAllItems method ended");
		return listFromDB;
	}
	
	public void getNameAndPriceByCode(String code){
		System.out.println("getNameAndPriceByCode method started");
		String hql = "select M.price, M.name from MenuItemDTO M where M.code =:cdm"; ;
		
		Session session = factory.openSession();
		Query query = session.createQuery(hql);
		query.setParameter("cdm", code);
		Object[] obj = (Object[]) query.uniqueResult();
		
		if(obj!=null){
			for (Object object : obj) {
				System.out.println(object);
			}
		}else
			System.out.println("No item found with code :"+code);
		
		System.out.println("getNameAndPriceByCode method started");
	}
	
	public List<Object[]> getNameAndPriceByType(String type){
		System.out.println("getNameAndPriceByType method startd");
		String hql = "select M.name, M.price from MenuItemDTO M where M.type=:tp";
		
		Session session = factory.openSession();
		Query query = session.createQuery(hql);
		query.setParameter("tp", type);
		List<Object[]> listFromDB = query.list();
		
		
		System.out.println("getNameAndPriceByType method ended");
		return listFromDB;
	}
	
	public void updatePriceByItemCode(String code, double latestPrice){
		System.out.println("update method started");
		String hql = "update MenuItemDTO M set M.price =:pc where M.code=:cd";
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setParameter("cd", code);
		query.setParameter("pc", latestPrice);
		int res = query.executeUpdate();
		tx.commit();
		System.out.println("Number of records updated :"+res);
		
		System.out.println("update method ended");
	}
}
