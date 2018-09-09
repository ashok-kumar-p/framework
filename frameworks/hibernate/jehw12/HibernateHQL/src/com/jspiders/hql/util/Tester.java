package com.jspiders.hql.util;

import java.util.Iterator;
import java.util.List;

import com.jspiders.hql.dao.MenuItemDAO;
import com.jspiders.hql.dto.MenuItemDTO;

public class Tester {

	public static void main(String[] args) {
		System.out.println("main method started");
		/*MenuItemDTO item1 = new MenuItemDTO();
		item1.setCode("AP");
		item1.setName("Aloo Paratha");
		item1.setPrice(60.00);
		item1.setType("North Indian");*/
		
		MenuItemDAO dao = new MenuItemDAO();
		//dao.create(item1);
		
		/*MenuItemDTO dtoFromDb = dao.getItemById(3);
		if(dtoFromDb!=null){
			System.out.println("Menu item available");
			System.out.println("Item details\n"+dtoFromDb);
		}else{
			System.out.println("Item not available");
		}*/
		
		/*List<MenuItemDTO> items = dao.getAllItems();
		if (items != null) {
			for (MenuItemDTO menuItemDTO : items) {
				System.out.println(menuItemDTO);
				System.out.println("----");
			}
		}else{
			System.out.println("NO items available");
		}
		
		//lambda expression
		System.out.println("Using lambda expression");
		items.forEach(dto->{
			System.out.println(dto);
		});*/
		
		//dao.getNameAndPriceByCode("IDV");
		
		
		//scenario4
		/*List<Object[]> list = dao.getNameAndPriceByType("Afghanise");
		if (list.size()>0) {
			Iterator<Object[]> itr = list.iterator();
			while (itr.hasNext()) {
				Object[] obj = itr.next();
				for (Object object : obj) {
					System.out.println(object);
				}
				System.out.println("----------");
			}
		} else {
			System.out.println("NO items available for the given type");
		}*/
		
		dao.updatePriceByItemCode("IDV", 40.50);
		
		System.out.println("main method ended");
	}
}
