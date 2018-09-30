package com.jspiders.demo.bean;

public class Car {

	public int id;
	public String brandName;
	public String modelName;
	public String fuel;
	private double price;
	private String colour;
	public MusicSystem ms;
	private Accessories acc;
	
	public Car() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public Car(String brandName, String fuel, MusicSystem ms) {
		this.brandName = brandName;
		this.fuel = fuel;
		this.ms = ms;
		System.out.println("3 param constructor");
	}
	
	public Car(String brandName, String modelName, String fuel) {
		this.brandName = brandName;
		this.modelName = modelName;
		this.fuel = fuel;
		System.out.println("3 param constructor");
	}
	
	public Car(int id, String brandName) {
		super();
		this.id = id;
		this.brandName = brandName;
	}
	
	public Car(int id, double price) {
		super();
		this.id = id;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Accessories getAcc() {
		return acc;
	}

	public void setAcc(Accessories acc) {
		this.acc = acc;
	}

	public void start() {
		System.out.println("Engine started");
	}
	
	public void driving() {
		System.out.println("Vehicle is moving");
	}
	
	public void applyBrake() {
		System.out.println("Vehicle stopped");
	}
	
	public void stop() {
		System.out.println("Engine turned off");
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brandName=" + brandName + ", modelName=" + modelName + ", fuel=" + fuel + ", price="
				+ price + ", colour=" + colour + "]";
	}

	
	
}
