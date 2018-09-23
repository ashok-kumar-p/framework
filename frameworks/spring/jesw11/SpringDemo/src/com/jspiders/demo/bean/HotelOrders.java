package com.jspiders.demo.bean;

public class HotelOrders {

	public HotelOrders() {

	}
	
	public HotelOrders(String name) {
		System.out.println("overloaded constructor");
	}
	
	public void takeOrder() {
		System.out.println("Order taken for Biryani");
		prepareDish("Biryani");
	}
	
	public void prepareDish(String name) {
		System.out.println(name+" is available");
	}
	
	public void serveOrder() {
		System.out.println("Serving the Biryani");
	}
}
