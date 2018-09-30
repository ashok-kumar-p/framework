package com.jspiders.demo.bean;

public class Accessories {
	public String name;
	public String brand;
	private double price;

	public Accessories(String name, String brand) {
		super();
		this.name = name;
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Accessories [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

}
