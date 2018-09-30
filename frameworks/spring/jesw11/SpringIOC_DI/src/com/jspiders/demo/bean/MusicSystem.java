package com.jspiders.demo.bean;

public class MusicSystem {

	public String brName;
	public String mdName;
	private double price;
	
	public MusicSystem(String brName, String mdName) {
		super();
		this.brName = brName;
		this.mdName = mdName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MusicSystem [brName=" + brName + ", mdName=" + mdName + ", price=" + price + "]";
	}
	
}
